
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object fullBoard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gameborard</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*11.102*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("stylesheets/fullBoard.css")),format.raw/*12.102*/("""">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.versioned("javascripts/board-jquery.js")),format.raw/*16.73*/("""" type="text/javascript"></script>
</head>

<body>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="/">Mensch Ärgere dich nicht</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/">Über das Spiel</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" id="resetGame">Neues Spiel</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="https://github.com/Manz2/WApp-Madm" target="_blank">Github</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    <h1 id="heading">Spielfeld</h1>
    <div id="health-box">
      <div id="health"></div>
      <p id="health-text">Connected</p>
    </div>
    <h1 class="short-message">Bildschrim zu klein</h1>
    <div class="container">
        <div class="grid-container">
            <div class="grid-item p1" id="p1-home-1"></div>
            <div class="grid-item p1" id="p1-home-2"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-9"></div>
            <div class="grid-item" id="field-10" ></div>
            <div class="grid-item p2" id="field-11"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-1"></div>
            <div class="grid-item p2" id="p2-home-2"></div>

            <div class="grid-item p1" id="p1-home-3"></div>
            <div class="grid-item p1" id="p1-home-4"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-8"></div>
            <div class="grid-item p2" id="p2-final-1"></div>
            <div class="grid-item" id="field-12"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-3"></div>
            <div class="grid-item p2" id="p2-home-4"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">A</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-7"></div>
            <div class="grid-item p2" id="p2-final-2"></div>
            <div class="grid-item" id="field-13"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">B</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-6"></div>
            <div class="grid-item p2" id="p2-final-3"></div>
            <div class="grid-item" id="field-14"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item p1" id="field-1"></div>
            <div class="grid-item" id="field-2"></div>
            <div class="grid-item" id="field-3"></div>
            <div class="grid-item" id="field-4"></div>
            <div class="grid-item" id="field-5"></div>
            <div class="grid-item p2" id="p2-final-4"></div>
            <div class="grid-item" id="field-15"></div>
            <div class="grid-item" id="field-16"></div>
            <div class="grid-item" id="field-17"></div>
            <div class="grid-item" id="field-18"></div>
            <div class="grid-item" id="field-19"></div>

            <div class="grid-item" id="field-40"></div>
            <div class="grid-item p1" id="p1-final-1"></div>
            <div class="grid-item p1" id="p1-final-2"></div>
            <div class="grid-item p1" id="p1-final-3"></div>
            <div class="grid-item p1" id="p1-final-4"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-final-4"></div>
            <div class="grid-item p4" id="p4-final-3"></div>
            <div class="grid-item p4" id="p4-final-2"></div>
            <div class="grid-item p4" id="p4-final-1"></div>
            <div class="grid-item" id="field-20"></div>




            <div class="grid-item" id="field-39"></div>
            <div class="grid-item" id="field-38"></div>
            <div class="grid-item" id="field-37"></div>
            <div class="grid-item" id="field-36"></div>
            <div class="grid-item" id="field-35"></div>
            <div class="grid-item p3" id="p3-final-4"></div>
            <div class="grid-item" id="field-25"></div>
            <div class="grid-item" id="field-24"></div>
            <div class="grid-item" id="field-23"></div>
            <div class="grid-item" id="field-22"></div>
            <div class="grid-item p4" id="field-21"></div>




            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-34"></div>
            <div class="grid-item p3" id="p3-final-3"></div>
            <div class="grid-item" id="field-26"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">D</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-33"></div>
            <div class="grid-item p3" id="p3-final-2"></div>
            <div class="grid-item" id="field-27"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">C</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>


            <div class="grid-item p3" id="p3-home-1"></div>
            <div class="grid-item p3" id="p3-home-2"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-32"></div>
            <div class="grid-item p3" id="p3-final-1"></div>
            <div class="grid-item" id="field-28"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-1"></div>
            <div class="grid-item p4" id="p4-home-2"></div>

            <div class="grid-item p3" id="p3-home-3"></div>
            <div class="grid-item p3" id="p3-home-4"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p3" id="field-31" ></div>
            <div class="grid-item" id="field-30"></div>
            <div class="grid-item" id="field-29"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-3"></div>
            <div class="grid-item p4" id="p4-home-4"></div>

        </div>
        
        

      <div id="player-select-form">
        <div class="form-group">
          <label for="spieler">Welcher Spieler ist dran?</label>
          <select name="spieler" class="form-control" id="player-select">
            <option>A</option>
            <option>B</option>
            <option>C</option>
            <option>D</option>
          </select>
          <button id="wurf-button" class="btn btn-primary shake-btn">Würfeln</button>
          <div id="box"><img id="gif-1" class="dice-gif" src=""""),_display_(/*202.64*/routes/*202.70*/.Assets.versioned(s"images/dice/dice.gif")),format.raw/*202.112*/("""" alt="dice" /></div>
        </div>
      <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
          Spiel Abbrechen
      </button>
    </div>

      <div id="figure-select-form">
        <div class="form-group">
          <label for="figur">Mit welcher Figur willst du Fahren</label>
          <select name="figur" class="form-control" id="figure-select">
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
          </select>
          <button id="figure-button" class="btn btn-primary">Fahren</button>
          <div id="box-dynamic"><img class="img-dynamic" id="dice-image" src="" alt="one" /></div>
        </div>
        <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
          Spiel Abbrechen
      </button>
      </div>

      <div id="diceFail-form">
        <div class="form-group">
          <label id="diceFail-label">Du hast keine 6 gewürfelt</label>
          <button id="diceFail-button" class="btn btn-primary">Nochmal würfeln</button>
        </div>
      </div>

        
 <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Spiel Abbrechen</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Wollen Sie das Spiel wirklich abbrechen? Dadurch verlieren Sie Ihren aktuellen Fortschritt.
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-outline" data-bs-dismiss="modal">Nicht abbrechen</button>
        <a href="/" class="btn btn-danger">Abbrechen</a>
      </div>
    </div>
  </div>
</div>   </div>
</body>
<!-- Modal -->


</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/fullBoard.scala.html
                  HASH: 5ac8981bc0cec4268c6e5e7d48780eaabb431178
                  MATRIX: 815->3|1054->215|1069->221|1137->267|1216->319|1231->325|1299->371|1868->915|1883->921|1952->969|10493->9482|10509->9488|10574->9530
                  LINES: 26->4|33->11|33->11|33->11|34->12|34->12|34->12|38->16|38->16|38->16|224->202|224->202|224->202
                  -- GENERATED --
              */
          