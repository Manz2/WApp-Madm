
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

object diceFail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,play.twirl.api.HtmlFormat.Appendable] {

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
    <div class="container">
        <div class="grid-container">
            <div class="grid-item p1" id="p1-home-1">"""),_display_(/*51.55*/player(0)),format.raw/*51.64*/("""</div>
            <div class="grid-item p1" id="p1-home-2">"""),_display_(/*52.55*/player(1)),format.raw/*52.64*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-39">"""),_display_(/*55.51*/field(8)),format.raw/*55.59*/("""</div>
            <div class="grid-item" id="field-40">"""),_display_(/*56.51*/field(9)),format.raw/*56.59*/("""</div>
            <div class="grid-item p2" id="field-1">"""),_display_(/*57.53*/field(10)),format.raw/*57.62*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-1">"""),_display_(/*60.55*/player(4)),format.raw/*60.64*/("""</div>
            <div class="grid-item p2" id="p2-home-2">"""),_display_(/*61.55*/player(5)),format.raw/*61.64*/("""</div>

            <div class="grid-item p1" id="p1-home3">"""),_display_(/*63.54*/player(2)),format.raw/*63.63*/("""</div>
            <div class="grid-item p1" id="p1-home4">"""),_display_(/*64.54*/player(3)),format.raw/*64.63*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-38">"""),_display_(/*67.51*/field(7)),format.raw/*67.59*/("""</div>
            <div class="grid-item p2" id="p2-final-1">"""),_display_(/*68.56*/home(4)),format.raw/*68.63*/("""</div>
            <div class="grid-item" id="field-2">"""),_display_(/*69.50*/field(11)),format.raw/*69.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-3">"""),_display_(/*72.55*/player(6)),format.raw/*72.64*/("""</div>
            <div class="grid-item p2" id="p2-home-4">"""),_display_(/*73.55*/player(7)),format.raw/*73.64*/("""</div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">A</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-37">"""),_display_(/*79.51*/field(6)),format.raw/*79.59*/("""</div>
            <div class="grid-item p2" id="p2-final-2">"""),_display_(/*80.56*/home(5)),format.raw/*80.63*/("""</div>
            <div class="grid-item" id="field-3">"""),_display_(/*81.50*/field(12)),format.raw/*81.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">B</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-36">"""),_display_(/*91.51*/field(5)),format.raw/*91.59*/("""</div>
            <div class="grid-item p2" id="p2-final-3">"""),_display_(/*92.56*/home(6)),format.raw/*92.63*/("""</div>
            <div class="grid-item" id="field-4">"""),_display_(/*93.50*/field(13)),format.raw/*93.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item p1" id="p1-start">"""),_display_(/*99.54*/field(0)),format.raw/*99.62*/("""</div>
            <div class="grid-item" id="field-32">"""),_display_(/*100.51*/field(1)),format.raw/*100.59*/("""</div>
            <div class="grid-item" id="field-33">"""),_display_(/*101.51*/field(2)),format.raw/*101.59*/("""</div>
            <div class="grid-item" id="field-34">"""),_display_(/*102.51*/field(3)),format.raw/*102.59*/("""</div>
            <div class="grid-item" id="field-35">"""),_display_(/*103.51*/field(4)),format.raw/*103.59*/("""</div>
            <div class="grid-item p2" id="p2-final4">"""),_display_(/*104.55*/home(7)),format.raw/*104.62*/("""</div>
            <div class="grid-item" id="field-5">"""),_display_(/*105.50*/field(14)),format.raw/*105.59*/("""</div>
            <div class="grid-item" id="field-6">"""),_display_(/*106.50*/field(15)),format.raw/*106.59*/("""</div>
            <div class="grid-item" id="field-7">"""),_display_(/*107.50*/field(16)),format.raw/*107.59*/("""</div>
            <div class="grid-item" id="field-8">"""),_display_(/*108.50*/field(17)),format.raw/*108.59*/("""</div>
            <div class="grid-item" id="field-9">"""),_display_(/*109.50*/field(18)),format.raw/*109.59*/("""</div>

            <div class="grid-item" id="field-30">"""),_display_(/*111.51*/field(39)),format.raw/*111.60*/("""</div>
            <div class="grid-item p1" id="p1-final-1">"""),_display_(/*112.56*/home(0)),format.raw/*112.63*/("""</div>
            <div class="grid-item p1" id="p1-final-2">"""),_display_(/*113.56*/home(1)),format.raw/*113.63*/("""</div>
            <div class="grid-item p1" id="p1-final-3">"""),_display_(/*114.56*/home(2)),format.raw/*114.63*/("""</div>
            <div class="grid-item p1" id="p1-final-4">"""),_display_(/*115.56*/home(3)),format.raw/*115.63*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-final-4">"""),_display_(/*117.56*/home(11)),format.raw/*117.64*/("""</div>
            <div class="grid-item p4" id="p4-final-3">"""),_display_(/*118.56*/home(10)),format.raw/*118.64*/("""</div>
            <div class="grid-item p4" id="p4-final-2">"""),_display_(/*119.56*/home(9)),format.raw/*119.63*/("""</div>
            <div class="grid-item p4" id="p4-final-1">"""),_display_(/*120.56*/home(8)),format.raw/*120.63*/("""</div>
            <div class="grid-item" id="field-10">"""),_display_(/*121.51*/field(19)),format.raw/*121.60*/("""</div>




            <div class="grid-item" id="field-29">"""),_display_(/*126.51*/field(38)),format.raw/*126.60*/("""</div>
            <div class="grid-item" id="field-28">"""),_display_(/*127.51*/field(37)),format.raw/*127.60*/("""</div>
            <div class="grid-item" id="field-27">"""),_display_(/*128.51*/field(36)),format.raw/*128.60*/("""</div>
            <div class="grid-item" id="field-26">"""),_display_(/*129.51*/field(35)),format.raw/*129.60*/("""</div>
            <div class="grid-item" id="field-25">"""),_display_(/*130.51*/field(34)),format.raw/*130.60*/("""</div>
            <div class="grid-item p3" id="p3-final-4">"""),_display_(/*131.56*/home(15)),format.raw/*131.64*/("""</div>
            <div class="grid-item" id="field-15">"""),_display_(/*132.51*/field(24)),format.raw/*132.60*/("""</div>
            <div class="grid-item" id="field-14">"""),_display_(/*133.51*/field(23)),format.raw/*133.60*/("""</div>
            <div class="grid-item" id="field-13">"""),_display_(/*134.51*/field(22)),format.raw/*134.60*/("""</div>
            <div class="grid-item" id="field-12">"""),_display_(/*135.51*/field(21)),format.raw/*135.60*/("""</div>
            <div class="grid-item p4" id="field-11">"""),_display_(/*136.54*/field(20)),format.raw/*136.63*/("""</div>




            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-24">"""),_display_(/*145.51*/field(33)),format.raw/*145.60*/("""</div>
            <div class="grid-item p3" id="p3-final-3">"""),_display_(/*146.56*/home(14)),format.raw/*146.64*/("""</div>
            <div class="grid-item" id="field-16">"""),_display_(/*147.51*/field(25)),format.raw/*147.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">D</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-23">"""),_display_(/*157.51*/field(32)),format.raw/*157.60*/("""</div>
            <div class="grid-item p3" id="p3-final-2">"""),_display_(/*158.56*/home(13)),format.raw/*158.64*/("""</div>
            <div class="grid-item" id="field-17">"""),_display_(/*159.51*/field(26)),format.raw/*159.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">C</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>


            <div class="grid-item p3" id="p3-home-1">"""),_display_(/*166.55*/player(12)),format.raw/*166.65*/("""</div>
            <div class="grid-item p3" id="p3-home-2">"""),_display_(/*167.55*/player(13)),format.raw/*167.65*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-22">"""),_display_(/*170.51*/field(31)),format.raw/*170.60*/("""</div>
            <div class="grid-item p3" id="p3-final-1">"""),_display_(/*171.56*/home(12)),format.raw/*171.64*/("""</div>
            <div class="grid-item" id="field-18">"""),_display_(/*172.51*/field(27)),format.raw/*172.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-1">"""),_display_(/*175.55*/player(8)),format.raw/*175.64*/("""</div>
            <div class="grid-item p4" id="p4-home-2">"""),_display_(/*176.55*/player(9)),format.raw/*176.64*/("""</div>

            <div class="grid-item p3" id="p3-home-3">"""),_display_(/*178.55*/player(14)),format.raw/*178.65*/("""</div>
            <div class="grid-item p3" id="p3-home-4">"""),_display_(/*179.55*/player(15)),format.raw/*179.65*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p3" id="field-21">"""),_display_(/*182.54*/field(30)),format.raw/*182.63*/("""</div>
            <div class="grid-item" id="field-20">"""),_display_(/*183.51*/field(29)),format.raw/*183.60*/("""</div>
            <div class="grid-item" id="field-19">"""),_display_(/*184.51*/field(28)),format.raw/*184.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-3">"""),_display_(/*187.55*/player(10)),format.raw/*187.65*/("""</div>
            <div class="grid-item p4" id="p4-home-4">"""),_display_(/*188.55*/player(11)),format.raw/*188.65*/("""</div>
        </div>
        <form>
      <div class="form-group">
        <label for="spieler">Du hast keine 6 gewürfelt</label>
        <div class="spinner-border" style="display: block; margin: 0 auto;" role="status">
          <span class="visually-hidden">Loading...</span>
        </div>        
            <div><button class="btn btn-primary"><a style="text-decoration: none; color: white;" href="/fullBoardWurf">Nochmal würfeln</a></button></div>
      </div>
    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
        Spiel Abbrechen
    </button>
        
        
    </div>
</body>
<!-- Modal -->
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
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Nicht abbrechen</button>
        <a href="/" class="btn btn-primary">Abbrechen</a>
      </div>
    </div>
</div>

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
                  SOURCE: app/views/diceFail.scala.html
                  HASH: 0df0bb745250552e4824689bfd6def765375649f
                  MATRIX: 802->1|970->93|982->98|1024->129|1037->135|1080->167|1091->171|1148->127|1175->165|1203->199|1233->202|1472->414|1487->420|1555->466|1634->518|1649->524|1717->570|3361->2189|3391->2198|3479->2259|3509->2268|3691->2423|3720->2431|3804->2488|3833->2496|3919->2555|3949->2564|4135->2723|4165->2732|4253->2793|4283->2802|4371->2863|4401->2872|4488->2932|4518->2941|4700->3096|4729->3104|4818->3166|4846->3173|4929->3229|4959->3238|5145->3397|5175->3406|5263->3467|5293->3476|5587->3743|5616->3751|5705->3813|5733->3820|5816->3876|5846->3885|6336->4348|6365->4356|6454->4418|6482->4425|6565->4481|6595->4490|6879->4747|6908->4755|6993->4812|7023->4820|7108->4877|7138->4885|7223->4942|7253->4950|7338->5007|7368->5015|7457->5076|7486->5083|7570->5139|7601->5148|7685->5204|7716->5213|7800->5269|7831->5278|7915->5334|7946->5343|8030->5399|8061->5408|8147->5466|8178->5475|8268->5537|8297->5544|8387->5606|8416->5613|8506->5675|8535->5682|8625->5744|8654->5751|8793->5862|8823->5870|8913->5932|8943->5940|9033->6002|9062->6009|9152->6071|9181->6078|9266->6135|9297->6144|9386->6205|9417->6214|9502->6271|9533->6280|9618->6337|9649->6346|9734->6403|9765->6412|9850->6469|9881->6478|9971->6540|10001->6548|10086->6605|10117->6614|10202->6671|10233->6680|10318->6737|10349->6746|10434->6803|10465->6812|10553->6872|10584->6881|10869->7138|10900->7147|10990->7209|11020->7217|11105->7274|11136->7283|11627->7746|11658->7755|11748->7817|11778->7825|11863->7882|11894->7891|12194->8163|12226->8173|12315->8234|12347->8244|12530->8399|12561->8408|12651->8470|12681->8478|12766->8535|12797->8544|12984->8703|13015->8712|13104->8773|13135->8782|13225->8844|13257->8854|13346->8915|13378->8925|13564->9083|13595->9092|13680->9149|13711->9158|13796->9215|13827->9224|14014->9383|14046->9393|14135->9454|14167->9464
                  LINES: 21->1|25->2|25->2|27->5|27->5|29->8|29->8|32->4|33->7|34->10|37->13|44->20|44->20|44->20|45->21|45->21|45->21|75->51|75->51|76->52|76->52|79->55|79->55|80->56|80->56|81->57|81->57|84->60|84->60|85->61|85->61|87->63|87->63|88->64|88->64|91->67|91->67|92->68|92->68|93->69|93->69|96->72|96->72|97->73|97->73|103->79|103->79|104->80|104->80|105->81|105->81|115->91|115->91|116->92|116->92|117->93|117->93|123->99|123->99|124->100|124->100|125->101|125->101|126->102|126->102|127->103|127->103|128->104|128->104|129->105|129->105|130->106|130->106|131->107|131->107|132->108|132->108|133->109|133->109|135->111|135->111|136->112|136->112|137->113|137->113|138->114|138->114|139->115|139->115|141->117|141->117|142->118|142->118|143->119|143->119|144->120|144->120|145->121|145->121|150->126|150->126|151->127|151->127|152->128|152->128|153->129|153->129|154->130|154->130|155->131|155->131|156->132|156->132|157->133|157->133|158->134|158->134|159->135|159->135|160->136|160->136|169->145|169->145|170->146|170->146|171->147|171->147|181->157|181->157|182->158|182->158|183->159|183->159|190->166|190->166|191->167|191->167|194->170|194->170|195->171|195->171|196->172|196->172|199->175|199->175|200->176|200->176|202->178|202->178|203->179|203->179|206->182|206->182|207->183|207->183|208->184|208->184|211->187|211->187|212->188|212->188
                  -- GENERATED --
              */
          