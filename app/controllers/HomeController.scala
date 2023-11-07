package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl._
import java.lang.ProcessBuilder.Redirect
import play.api.libs.json._
//import de.htwg.se.malefiz.Malefiz
//import de.htwg.se.malefiz.controller.controllerComponent._
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
    val gameController = new Controller()
    var diceVal = 0;
    var player = "A"
    gameController.newGame(4)
     def newGame() = Action {
      request => 
        var req = request.body.asFormUrlEncoded.get("anzahl").mkString.toInt
        gameController.newGame(req)
        Ok(views.html.fullBoardWurf(gameController))
     }
     
     def showFields() = Action {
        Ok(views.html.board(gameController))
     }

    /**
      * 05-JS
      */
   def newMove() = Action { request =>
    println("request",request.body.asFormUrlEncoded.get("spieler").flatMap(_.headOption).head)
  request.body.asFormUrlEncoded match {
    case Some(formData) =>
      // Extrahieren Sie die Werte aus der Map. Verwenden Sie headOption, um den ersten Wert zu erhalten oder None, falls nicht vorhanden.
      val spieler = formData.get("spieler").flatMap(_.headOption)
      val diceValue = formData.get("diceResult").flatMap(_.headOption)
      val figur = formData.get("figur").flatMap(_.headOption)

      println(spieler)
      println(diceValue)
      println(figur)


      (spieler, diceValue, figur) match {
        case (Some(s), Some(dv), Some(f)) =>
          println(s"player: $s, diceValue: $dv, figure: $f")
          // Hier könnten Sie Ihre Logik implementieren.
          gameController.move(gameController.getFigureFromField(s,f.toInt),dv.toInt)
          println(gameController.field.data)
          println(gameController.player.data)
          println(gameController.home.data)
          Ok("Move processed")
          Redirect("/fullBoard")
        case _ =>
          BadRequest("Missing form data")
      }
      
    case None =>
      BadRequest("Expecting form-urlencoded data")
  }
}

     def fullBoard() = Action {
        Ok(views.html.fullBoard(gameController))
     }


     //////


    def turn() = Action {
      request => 
        var req = request.body.asFormUrlEncoded.get("spieler").head
        player = req.toUpperCase()
        if (gameController.nochAlle(player)){
          if (gameController.Alleda(player)){
            Redirect("/fullBoardWurf")
          }
          else {
            Ok(views.html.diceFail(gameController))
          }
      } else {
        diceVal = gameController.throwDice
        Ok(views.html.fullBoardGo(gameController,diceVal.toString(),player))
      }     
    }

    def fullBoardWurf() = Action {
      Ok(views.html.fullBoardWurf(gameController))
    }

    def fullBoardGo() = Action {
      request => 
        var req = request.body.asFormUrlEncoded.get("figur").head
        var fig = req.toInt
        gameController.move(gameController.getFigureFromField(player,fig),diceVal)

        Redirect("/fullBoardWurf")
    }

    def go() = Action{
      request => 
        var req = request.body.asFormUrlEncoded.get("figur").head
        var fig = req.toInt
        gameController.move(gameController.getFigureFromField(player,fig),diceVal)
        Redirect("/fullBoardWurf")
    }

    def about() = Action {
      Ok(views.html.about())
    }


    def test() = Action {
      val name = "John Doe"
      val age = 32
      val email = "test@test.com"
      Ok(views.html.test(email,age,name))
    }

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def startGame() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.startGame())
  }

  }
