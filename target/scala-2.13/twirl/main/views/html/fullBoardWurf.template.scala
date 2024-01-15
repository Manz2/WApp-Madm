
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

object fullBoardWurf extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller: de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/field/*2.7*/ = {{
controller.field.data
}};def /*5.2*/player/*5.8*/ = {{
controller.player.data
}};def /*8.2*/home/*8.6*/ = {{
controller.home.data
}};
Seq[Any](format.raw/*4.2*/("""
"""),format.raw/*7.2*/("""
"""),format.raw/*10.2*/("""


"""),format.raw/*13.1*/("""<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gameborard</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*20.50*/routes/*20.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*20.102*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*21.50*/routes/*21.56*/.Assets.versioned("stylesheets/fullBoard.css")),format.raw/*21.102*/("""">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("javascripts/board.js")),format.raw/*24.66*/("""" type="text/javascript"></script>
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
    <h1 id="heading">Spielfeld</h1>
    <h1 class="short-message">Bildschrim zu klein</h1>
    <div class="container">
        <div class="grid-container">
            <div class="grid-item p1" id="p1-home-1">"""),_display_(/*53.55*/player(0)),format.raw/*53.64*/("""</div>
            <div class="grid-item p1" id="p1-home-2">"""),_display_(/*54.55*/player(1)),format.raw/*54.64*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-39">"""),_display_(/*57.51*/field(8)),format.raw/*57.59*/("""</div>
            <div class="grid-item" id="field-40">"""),_display_(/*58.51*/field(9)),format.raw/*58.59*/("""</div>
            <div class="grid-item p2" id="field-1">"""),_display_(/*59.53*/field(10)),format.raw/*59.62*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-1">"""),_display_(/*62.55*/player(4)),format.raw/*62.64*/("""</div>
            <div class="grid-item p2" id="p2-home-2">"""),_display_(/*63.55*/player(5)),format.raw/*63.64*/("""</div>

            <div class="grid-item p1" id="p1-home3">"""),_display_(/*65.54*/player(2)),format.raw/*65.63*/("""</div>
            <div class="grid-item p1" id="p1-home4">"""),_display_(/*66.54*/player(3)),format.raw/*66.63*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-38">"""),_display_(/*69.51*/field(7)),format.raw/*69.59*/("""</div>
            <div class="grid-item p2" id="p2-final-1">"""),_display_(/*70.56*/home(4)),format.raw/*70.63*/("""</div>
            <div class="grid-item" id="field-2">"""),_display_(/*71.50*/field(11)),format.raw/*71.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-3">"""),_display_(/*74.55*/player(6)),format.raw/*74.64*/("""</div>
            <div class="grid-item p2" id="p2-home-4">"""),_display_(/*75.55*/player(7)),format.raw/*75.64*/("""</div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">A</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-37">"""),_display_(/*81.51*/field(6)),format.raw/*81.59*/("""</div>
            <div class="grid-item p2" id="p2-final-2">"""),_display_(/*82.56*/home(5)),format.raw/*82.63*/("""</div>
            <div class="grid-item" id="field-3">"""),_display_(/*83.50*/field(12)),format.raw/*83.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">B</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-36">"""),_display_(/*93.51*/field(5)),format.raw/*93.59*/("""</div>
            <div class="grid-item p2" id="p2-final-3">"""),_display_(/*94.56*/home(6)),format.raw/*94.63*/("""</div>
            <div class="grid-item" id="field-4">"""),_display_(/*95.50*/field(13)),format.raw/*95.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item p1" id="p1-start">"""),_display_(/*101.54*/field(0)),format.raw/*101.62*/("""</div>
            <div class="grid-item" id="field-32">"""),_display_(/*102.51*/field(1)),format.raw/*102.59*/("""</div>
            <div class="grid-item" id="field-33">"""),_display_(/*103.51*/field(2)),format.raw/*103.59*/("""</div>
            <div class="grid-item" id="field-34">"""),_display_(/*104.51*/field(3)),format.raw/*104.59*/("""</div>
            <div class="grid-item" id="field-35">"""),_display_(/*105.51*/field(4)),format.raw/*105.59*/("""</div>
            <div class="grid-item p2" id="p2-final4">"""),_display_(/*106.55*/home(7)),format.raw/*106.62*/("""</div>
            <div class="grid-item" id="field-5">"""),_display_(/*107.50*/field(14)),format.raw/*107.59*/("""</div>
            <div class="grid-item" id="field-6">"""),_display_(/*108.50*/field(15)),format.raw/*108.59*/("""</div>
            <div class="grid-item" id="field-7">"""),_display_(/*109.50*/field(16)),format.raw/*109.59*/("""</div>
            <div class="grid-item" id="field-8">"""),_display_(/*110.50*/field(17)),format.raw/*110.59*/("""</div>
            <div class="grid-item" id="field-9">"""),_display_(/*111.50*/field(18)),format.raw/*111.59*/("""</div>

            <div class="grid-item" id="field-30">"""),_display_(/*113.51*/field(39)),format.raw/*113.60*/("""</div>
            <div class="grid-item p1" id="p1-final-1">"""),_display_(/*114.56*/home(0)),format.raw/*114.63*/("""</div>
            <div class="grid-item p1" id="p1-final-2">"""),_display_(/*115.56*/home(1)),format.raw/*115.63*/("""</div>
            <div class="grid-item p1" id="p1-final-3">"""),_display_(/*116.56*/home(2)),format.raw/*116.63*/("""</div>
            <div class="grid-item p1" id="p1-final-4">"""),_display_(/*117.56*/home(3)),format.raw/*117.63*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-final-4">"""),_display_(/*119.56*/home(11)),format.raw/*119.64*/("""</div>
            <div class="grid-item p4" id="p4-final-3">"""),_display_(/*120.56*/home(10)),format.raw/*120.64*/("""</div>
            <div class="grid-item p4" id="p4-final-2">"""),_display_(/*121.56*/home(9)),format.raw/*121.63*/("""</div>
            <div class="grid-item p4" id="p4-final-1">"""),_display_(/*122.56*/home(8)),format.raw/*122.63*/("""</div>
            <div class="grid-item" id="field-10">"""),_display_(/*123.51*/field(19)),format.raw/*123.60*/("""</div>




            <div class="grid-item" id="field-29">"""),_display_(/*128.51*/field(38)),format.raw/*128.60*/("""</div>
            <div class="grid-item" id="field-28">"""),_display_(/*129.51*/field(37)),format.raw/*129.60*/("""</div>
            <div class="grid-item" id="field-27">"""),_display_(/*130.51*/field(36)),format.raw/*130.60*/("""</div>
            <div class="grid-item" id="field-26">"""),_display_(/*131.51*/field(35)),format.raw/*131.60*/("""</div>
            <div class="grid-item" id="field-25">"""),_display_(/*132.51*/field(34)),format.raw/*132.60*/("""</div>
            <div class="grid-item p3" id="p3-final-4">"""),_display_(/*133.56*/home(15)),format.raw/*133.64*/("""</div>
            <div class="grid-item" id="field-15">"""),_display_(/*134.51*/field(24)),format.raw/*134.60*/("""</div>
            <div class="grid-item" id="field-14">"""),_display_(/*135.51*/field(23)),format.raw/*135.60*/("""</div>
            <div class="grid-item" id="field-13">"""),_display_(/*136.51*/field(22)),format.raw/*136.60*/("""</div>
            <div class="grid-item" id="field-12">"""),_display_(/*137.51*/field(21)),format.raw/*137.60*/("""</div>
            <div class="grid-item p4" id="field-11">"""),_display_(/*138.54*/field(20)),format.raw/*138.63*/("""</div>




            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-24">"""),_display_(/*147.51*/field(33)),format.raw/*147.60*/("""</div>
            <div class="grid-item p3" id="p3-final-3">"""),_display_(/*148.56*/home(14)),format.raw/*148.64*/("""</div>
            <div class="grid-item" id="field-16">"""),_display_(/*149.51*/field(25)),format.raw/*149.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">D</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-23">"""),_display_(/*159.51*/field(32)),format.raw/*159.60*/("""</div>
            <div class="grid-item p3" id="p3-final-2">"""),_display_(/*160.56*/home(13)),format.raw/*160.64*/("""</div>
            <div class="grid-item" id="field-17">"""),_display_(/*161.51*/field(26)),format.raw/*161.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">C</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>


            <div class="grid-item p3" id="p3-home-1">"""),_display_(/*168.55*/player(12)),format.raw/*168.65*/("""</div>
            <div class="grid-item p3" id="p3-home-2">"""),_display_(/*169.55*/player(13)),format.raw/*169.65*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-22">"""),_display_(/*172.51*/field(31)),format.raw/*172.60*/("""</div>
            <div class="grid-item p3" id="p3-final-1">"""),_display_(/*173.56*/home(12)),format.raw/*173.64*/("""</div>
            <div class="grid-item" id="field-18">"""),_display_(/*174.51*/field(27)),format.raw/*174.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-1">"""),_display_(/*177.55*/player(8)),format.raw/*177.64*/("""</div>
            <div class="grid-item p4" id="p4-home-2">"""),_display_(/*178.55*/player(9)),format.raw/*178.64*/("""</div>

            <div class="grid-item p3" id="p3-home-3">"""),_display_(/*180.55*/player(14)),format.raw/*180.65*/("""</div>
            <div class="grid-item p3" id="p3-home-4">"""),_display_(/*181.55*/player(15)),format.raw/*181.65*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p3" id="field-21">"""),_display_(/*184.54*/field(30)),format.raw/*184.63*/("""</div>
            <div class="grid-item" id="field-20">"""),_display_(/*185.51*/field(29)),format.raw/*185.60*/("""</div>
            <div class="grid-item" id="field-19">"""),_display_(/*186.51*/field(28)),format.raw/*186.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-3">"""),_display_(/*189.55*/player(10)),format.raw/*189.65*/("""</div>
            <div class="grid-item p4" id="p4-home-4">"""),_display_(/*190.55*/player(11)),format.raw/*190.65*/("""</div>

        </div>
        <!---
        <div id="inputs">
            <form action="/turn" method="POST" class="wurf-form">
                <label for="spieler">Welcher Spieler ist dran?</label>
                <select name="spieler" id="spieler">
                    <option value="A">A</option>
                    <option value="B">B</option>
                    <option value="C">C</option>
                    <option value="D">D</option>
                </select>
                <input type="submit" class="button" value="Würfeln">
                <div id="box"><img id="gif" class="dice-gif" src=""""),_display_(/*204.68*/routes/*204.74*/.Assets.versioned(s"images/dice/dice.gif")),format.raw/*204.116*/("""" alt="dice" /></div>
            </form>
        </div>
      -->
        

     <form id="form-1" method="POST" action="/turn">
        <div class="form-group">
          <label for="spieler">Welcher Spieler ist dran?</label>
          <select name="spieler" class="form-control" id="spieler">
            <option>A</option>
            <option>B</option>
            <option>C</option>
            <option>D</option>
          </select>
          <input type="submit" class="btn btn-primary shake-btn" value="Würfeln"/>
          <div id="box"><img id="gif-1" class="dice-gif" src=""""),_display_(/*220.64*/routes/*220.70*/.Assets.versioned(s"images/dice/dice.gif")),format.raw/*220.112*/("""" alt="dice" /></div>
        </div>
      <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
          Spiel Abbrechen
      </button>
      </form>
        
        
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

  def render(controller:de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/fullBoardWurf.scala.html
                  HASH: 23973735d36d9ef30e011f1ee428679446ff0dcc
                  MATRIX: 807->1|975->93|987->98|1029->129|1042->135|1085->167|1096->171|1153->127|1180->165|1208->199|1238->202|1477->414|1492->420|1560->466|1639->518|1654->524|1722->570|2198->1021|2213->1027|2275->1068|3578->2344|3608->2353|3696->2414|3726->2423|3908->2578|3937->2586|4021->2643|4050->2651|4136->2710|4166->2719|4352->2878|4382->2887|4470->2948|4500->2957|4588->3018|4618->3027|4705->3087|4735->3096|4917->3251|4946->3259|5035->3321|5063->3328|5146->3384|5176->3393|5362->3552|5392->3561|5480->3622|5510->3631|5804->3898|5833->3906|5922->3968|5950->3975|6033->4031|6063->4040|6553->4503|6582->4511|6671->4573|6699->4580|6782->4636|6812->4645|7097->4902|7127->4910|7212->4967|7242->4975|7327->5032|7357->5040|7442->5097|7472->5105|7557->5162|7587->5170|7676->5231|7705->5238|7789->5294|7820->5303|7904->5359|7935->5368|8019->5424|8050->5433|8134->5489|8165->5498|8249->5554|8280->5563|8366->5621|8397->5630|8487->5692|8516->5699|8606->5761|8635->5768|8725->5830|8754->5837|8844->5899|8873->5906|9012->6017|9042->6025|9132->6087|9162->6095|9252->6157|9281->6164|9371->6226|9400->6233|9485->6290|9516->6299|9605->6360|9636->6369|9721->6426|9752->6435|9837->6492|9868->6501|9953->6558|9984->6567|10069->6624|10100->6633|10190->6695|10220->6703|10305->6760|10336->6769|10421->6826|10452->6835|10537->6892|10568->6901|10653->6958|10684->6967|10772->7027|10803->7036|11088->7293|11119->7302|11209->7364|11239->7372|11324->7429|11355->7438|11846->7901|11877->7910|11967->7972|11997->7980|12082->8037|12113->8046|12413->8318|12445->8328|12534->8389|12566->8399|12749->8554|12780->8563|12870->8625|12900->8633|12985->8690|13016->8699|13203->8858|13234->8867|13323->8928|13354->8937|13444->8999|13476->9009|13565->9070|13597->9080|13783->9238|13814->9247|13899->9304|13930->9313|14015->9370|14046->9379|14233->9538|14265->9548|14354->9609|14386->9619|15025->10230|15041->10236|15106->10278|15720->10864|15736->10870|15801->10912
                  LINES: 21->1|25->2|25->2|27->5|27->5|29->8|29->8|32->4|33->7|34->10|37->13|44->20|44->20|44->20|45->21|45->21|45->21|48->24|48->24|48->24|77->53|77->53|78->54|78->54|81->57|81->57|82->58|82->58|83->59|83->59|86->62|86->62|87->63|87->63|89->65|89->65|90->66|90->66|93->69|93->69|94->70|94->70|95->71|95->71|98->74|98->74|99->75|99->75|105->81|105->81|106->82|106->82|107->83|107->83|117->93|117->93|118->94|118->94|119->95|119->95|125->101|125->101|126->102|126->102|127->103|127->103|128->104|128->104|129->105|129->105|130->106|130->106|131->107|131->107|132->108|132->108|133->109|133->109|134->110|134->110|135->111|135->111|137->113|137->113|138->114|138->114|139->115|139->115|140->116|140->116|141->117|141->117|143->119|143->119|144->120|144->120|145->121|145->121|146->122|146->122|147->123|147->123|152->128|152->128|153->129|153->129|154->130|154->130|155->131|155->131|156->132|156->132|157->133|157->133|158->134|158->134|159->135|159->135|160->136|160->136|161->137|161->137|162->138|162->138|171->147|171->147|172->148|172->148|173->149|173->149|183->159|183->159|184->160|184->160|185->161|185->161|192->168|192->168|193->169|193->169|196->172|196->172|197->173|197->173|198->174|198->174|201->177|201->177|202->178|202->178|204->180|204->180|205->181|205->181|208->184|208->184|209->185|209->185|210->186|210->186|213->189|213->189|214->190|214->190|228->204|228->204|228->204|244->220|244->220|244->220
                  -- GENERATED --
              */
          