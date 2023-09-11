package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl._
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


     def newGame(num:Int) = Action {
      gameController.newGame(num)
      Ok(gameController.player.toString())
     }

    def turn(playerE:String) = Action {
      player = playerE
      diceVal = gameController.throwDice
      val out = "du hast eine " + diceVal.toString() + " gewürfelt mit welcher Figur möchtest du gehen?"
      Ok(out.toString)
    }

    def go(fig:Int) = Action{
      gameController.move(gameController.getFigureFromField(player,fig),diceVal)
      val out = gameController.field.toString() + gameController.player.toString();
      Ok(out.toString)
    }

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
    
  }

  }
