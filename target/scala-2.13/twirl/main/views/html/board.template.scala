
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

object board extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller: de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <body>
        <h1>Felder</h1>
        <h2>Home-Field</h2>
        """),_display_(/*6.10*/for(row <- 0 until controller.home.data.size) yield /*6.55*/ {_display_(Seq[Any](format.raw/*6.57*/("""
            """),format.raw/*7.13*/("""<span style="border: solid black 1px">
                """),_display_(/*8.18*/{if (controller.home.data(row).toString() == "") {"__"} else controller.home.data(row).toString()}),format.raw/*8.116*/(""" 
            """),format.raw/*9.13*/("""</span>
        """)))}),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""<h2>Player-Field</h2>
        """),_display_(/*12.10*/for(row <- 0 until controller.player.data.size) yield /*12.57*/ {_display_(Seq[Any](format.raw/*12.59*/("""
            """),format.raw/*13.13*/("""<span style="border: solid black 1px">
                """),_display_(/*14.18*/{if (controller.player.data(row).toString() == "") {"__"} else controller.player.data(row).toString()}),format.raw/*14.120*/(""" 
            """),format.raw/*15.13*/("""</span>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""<h2>Field-Field</h2>
        """),_display_(/*18.10*/for(row <- 0 until controller.field.data.size) yield /*18.56*/ {_display_(Seq[Any](format.raw/*18.58*/("""
            """),format.raw/*19.13*/("""<span style="border: solid black 1px">
                """),_display_(/*20.18*/{if (controller.field.data(row).toString() == "") {"__"} else controller.field.data(row).toString()}),format.raw/*20.118*/(""" 
            """),format.raw/*21.13*/("""</span>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""<br/>
        <br/>

        <form method="POST" action="/turn">
            <label for="spieler">Würfeln</label>
            <input type="spieler" id="spieler" name="spieler" required>
            <input type="submit" value="Würfeln">
    </body>
</html>"""))
      }
    }
  }

  def render(controller:de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/board.scala.html
                  HASH: 6bdb03ef8d9457174f5954d619a10473147a658b
                  MATRIX: 799->1|983->92|1088->171|1148->216|1187->218|1227->231|1309->287|1428->385|1469->399|1517->416|1553->425|1611->456|1674->503|1714->505|1755->518|1838->574|1962->676|2004->690|2052->707|2088->716|2145->746|2207->792|2247->794|2288->807|2371->863|2493->963|2535->977|2583->994|2619->1003
                  LINES: 21->1|26->2|30->6|30->6|30->6|31->7|32->8|32->8|33->9|34->10|35->11|36->12|36->12|36->12|37->13|38->14|38->14|39->15|40->16|41->17|42->18|42->18|42->18|43->19|44->20|44->20|45->21|46->22|47->23
                  -- GENERATED --
              */
          