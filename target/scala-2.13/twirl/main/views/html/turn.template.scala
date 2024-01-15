
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

object turn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller: de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller, diceResult: String, player: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <body>
        <h1>Gratualtion</h1>
        <p>
            <b>"""),_display_(/*6.17*/player),format.raw/*6.23*/("""</b> hat eine <b>"""),_display_(/*6.41*/diceResult),format.raw/*6.51*/("""</b> gewürfelt
        </p>
        <h1>
            Derzeitiger Spielstand
        </h1>
        """),_display_(/*11.10*/for(row <- 0 until controller.field.data.size) yield /*11.56*/ {_display_(Seq[Any](format.raw/*11.58*/("""
            """),format.raw/*12.13*/("""<span style="border: solid black 1px">
                """),_display_(/*13.18*/{if (controller.field.data(row).toString() == "") {"__"} else controller.field.data(row).toString()}),format.raw/*13.118*/(""" 
            """),format.raw/*14.13*/("""</span>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""<form method="POST" action="/go">
        <label for="figur">Spieler auswählen</label>
        <input type="figur" id="figur" name="figur" required>
        <input type="submit" value="Auswählen">
    </body>

</html>"""))
      }
    }
  }

  def render(controller:de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,diceResult:String,player:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,diceResult,player)

  def f:((de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,String,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,diceResult,player) => apply(controller,diceResult,player)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/turn.scala.html
                  HASH: 31cb6435c924639fed77ecb6a6deb30cd1bd6cbd
                  MATRIX: 812->1|1032->128|1133->203|1159->209|1203->227|1233->237|1359->336|1421->382|1461->384|1502->397|1585->453|1707->553|1749->567|1797->584|1829->589
                  LINES: 21->1|26->2|30->6|30->6|30->6|30->6|35->11|35->11|35->11|36->12|37->13|37->13|38->14|39->15|40->16
                  -- GENERATED --
              */
          