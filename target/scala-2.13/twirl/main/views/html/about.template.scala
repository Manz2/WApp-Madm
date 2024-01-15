
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mensch Ärgere dich nicht</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/about.css")),format.raw/*7.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*8.102*/("""">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<style>
    .header-common """),format.raw/*13.20*/("""{"""),format.raw/*13.21*/("""
        """),format.raw/*14.9*/("""color: white;
        margin: 40px auto;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
"""),format.raw/*17.1*/("""</style>
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
    <div class="container">
        <h1 class="header-common">Mensch Ärgere dich nicht</h1>
        <a class="btn btn-light" href="/startGame" role="button">Starte ein Spiel</a>
        <h3 class="header-common">Details</h3>
        <div class="accordion" id="accordionExample">
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-1" aria-expanded="true" aria-controls="collapseOne">
                    Felder
                </button>
              </h2>
              <div id="collapse-1" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <li><b>Player</b>: Wartefeld der Figuren</li>
                    <li><b>Home</b>: Finales Feld der Figuren</li>
                    <li><b>Field</b>: Eigentliches Spielfeld</li> 
                </div>
              </div>
            </div>
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-2" aria-expanded="false" aria-controls="collapseTwo">
                    Spielablauf
                </button>
              </h2>
              <div id="collapse-2" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <ul>
                        <li>Jeder Spieler erhält 4 Figuren</li>
                        <li>Ziel ist es alle seine Figuren in die Home Felder zu bewegen</li>
                        <li>Ist ein Spieler an der Reihe darf er würfeln und die gewürfelte Anzahl fahren</li>
                        <li>Bewegt sich ein Spieler A auf ein Feld auf welchem eine Figur von Spieler B steht muss Spieler B seine Figur wieder in das Begin Feld stellen</li>
                        <li>Gewonnen hat der Spieler der als erstes alles seine 4 Figuren im Home Feld hat</li>
                    </ul>
                </div>
              </div>
            </div>
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-3" aria-expanded="false" aria-controls="collapseThree">
                    Geschichte des Spiels
                </button>
              </h2>
              <div id="collapse-3" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <ul>
                        <li>Das Spiel wurde Anfang des 20. Jahrhunderts von Josef Friedrich Schmidt erfunden. Schmidt war ein deutscher Spielehersteller und brachte das Spiel erstmals im Jahr 1914 unter dem Namen "Mensch ärgere Dich nicht!" auf den Markt.</li>
                        <li>Die Entstehung des Spiels fällt in eine Zeit, als Gesellschaftsspiele in Deutschland populär wurden. Die Menschen suchten nach unterhaltsamen Aktivitäten, um sich in der Freizeit zu beschäftigen</li>
                        <li>Das Spiel "Mensch ärgere dich nicht" erfreute sich schnell großer Beliebtheit in Deutschland und wurde in den folgenden Jahrzehnten zu einem der bekanntesten und meistgespielten Brettspiele im Land</li>
                        <li>Das Spiel hat sich zu einem wichtigen kulturellen Erbe Deutschlands entwickelt und ist ein Teil der deutschen Spielt radition</li>
                    </ul>
                </div>
              </div>
            </div>
            <div class="accordion-item">
                <h2 class="accordion-header">
                  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-4" aria-expanded="false" aria-controls="collapseThree">
                    Namensgebung
                  </button>
                </h2>
                <div id="collapse-4" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                  <div class="accordion-body">
                    <p>Der Name "Mensch ärgere dich nicht" spiegelt den spielerischen Charakter des Spiels wider. Es kann zu frustrierenden Momenten führen, wenn die eigenen Spielfiguren von Gegnern zurückgesetzt werden, was zu Ärger oder Gelächter unter den Spielern führt</p>
                  </div>
                </div>
              </div>
              <div class="accordion-item">
                <h2 class="accordion-header">
                  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-5" aria-expanded="false" aria-controls="collapseThree">
                    Web-Interface
                  </button>
                </h2>
                <div id="collapse-5" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                  <div class="accordion-body">
                    <p>Ergänzend zu unserer TUI & GUI die in der Vorlesung Softwareengineering entstanden sind entwickeln wir hier ein Web Interface für die Vorlesung WebTechnologien Dieses Interface ist mit dem Scala Play Framework entstanden</p>
                  </div>
                </div>
              </div>
              <div class="accordion-item">
                <h2 class="accordion-header">
                  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-6" aria-expanded="false" aria-controls="collapseThree">
                    Autoren
                  </button>
                </h2>
                <div id="collapse-6" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                  <div class="accordion-body">
                    <ul class="author-list">
                        <li>Erik Manz</li>
                        <li>Sebastian Kaeser</li>
                    </ul>
                  </div>
                </div>
              </div>
          </div>


    </div>
</body>
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
                  SOURCE: app/views/about.scala.html
                  HASH: c1e8cb410c171e07886380db4fe12b809b212363
                  MATRIX: 811->0|1072->235|1086->241|1148->283|1226->335|1240->341|1307->387|1801->855|1830->856|1866->865|1938->910|1966->911|1994->912
                  LINES: 26->1|32->7|32->7|32->7|33->8|33->8|33->8|38->13|38->13|39->14|41->16|41->16|42->17
                  -- GENERATED --
              */
          