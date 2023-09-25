package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl._
import java.lang.ProcessBuilder.Redirect
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
    gameController.newGame(1)




     def newGame() = Action {
      request => 
        var req = request.body.asFormUrlEncoded.get("anzahl").mkString.toInt
        gameController.newGame(req)
        Ok(views.html.board(gameController))
     }
     
     def showFields() = Action {
        Ok(views.html.board(gameController))
     }


    def turn() = Action {
      request => 
        var req = request.body.asFormUrlEncoded.get("spieler").head
        player = req.toUpperCase()
        if (gameController.nochAlle(player)){
          if (gameController.Alleda(player)){
            Redirect("/fields")
          }
          else {
            Ok(views.html.diceFail())
          }
      } else {
        diceVal = gameController.throwDice
        Ok(views.html.turn(gameController,diceVal.toString(),player))
      }     
    }

    def fullBoard() = Action {
      Ok(views.html.fullBoard())
    }

    def go() = Action{
      request => 
        var req = request.body.asFormUrlEncoded.get("figur").head
        var fig = req.toInt
        gameController.move(gameController.getFigureFromField(player,fig),diceVal)
        Redirect("/fields")
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
    Ok(views.html.index())
  }

  }
