
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, age: Int, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <body>
        <h1>Test</h1>
        <p>Name : """),_display_(/*5.20*/name),format.raw/*5.24*/("""</p>
        <p>Age : """),_display_(/*6.19*/age),format.raw/*6.22*/("""</p>
        <p>Email : """),_display_(/*7.21*/email),format.raw/*7.26*/("""</p>
    </body>
</html>"""))
      }
    }
  }

  def render(name:String,age:Int,email:String): play.twirl.api.HtmlFormat.Appendable = apply(name,age,email)

  def f:((String,Int,String) => play.twirl.api.HtmlFormat.Appendable) = (name,age,email) => apply(name,age,email)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/test.scala.html
                  HASH: 7f860cd9e6c2eb7800635b00ce9a1911f4a52fd5
                  MATRIX: 739->1|872->41|957->100|981->104|1030->127|1053->130|1104->155|1129->160
                  LINES: 21->1|26->2|29->5|29->5|30->6|30->6|31->7|31->7
                  -- GENERATED --
              */
          