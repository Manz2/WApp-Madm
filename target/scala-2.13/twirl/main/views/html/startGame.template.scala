
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

object startGame extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.3*/("""<html>
    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Gameborard</title>
      <link rel="stylesheet" media="screen" href=""""),_display_(/*6.52*/routes/*6.58*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*6.104*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*7.52*/routes/*7.58*/.Assets.versioned("stylesheets/newGame.css")),format.raw/*7.102*/("""">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
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
                <a class="nav-link" href="/startGame">Neues Spiel</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="https://github.com/Manz2/WApp-Madm" target="_blank">Github</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <div class="image-wrapper">
      <div class="container">
        <h1>Welcome to Mensch Ärgere dich nicht!</h1>
        <!--
        <form method="POST" action="/newGame">
          <div class="form-group">
            <label for="anzahl">Wähle die Anzahl Spieler aus</label>
            <input type="number" id="anzahl" name="anzahl" required>
            <input type="submit" class="button" value="Spiel starten">
          </div>
        </form>
      -->
      <h1 class="short-message">Bildschrim zu klein</h1>
      <form method="POST" action="/newGame">
        <div class="form-group">
          <label for="anzahl">Anzahl Spieler</label>
          <select name="anzahl" class="form-control" id="anzahl">
            <option selected disabled></option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option><strong>4</strong></option>
          </select>
          <input type="submit" class="btn btn-primary" value="Spiel starten"/>
        </div>
      </form>
      </div>
      </div>
    </body>
  </html>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/startGame.scala.html
                  HASH: 7c61fb8c1bfdb3e1524f367d6ad886058125de69
                  MATRIX: 815->2|1048->209|1062->215|1129->261|1209->315|1223->321|1288->365
                  LINES: 26->1|31->6|31->6|31->6|32->7|32->7|32->7
                  -- GENERATED --
              */
          