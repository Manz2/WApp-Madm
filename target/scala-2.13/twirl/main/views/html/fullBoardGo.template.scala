
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

object fullBoardGo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller: de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller, diceResult: String, currentPlayer: String):play.twirl.api.HtmlFormat.Appendable = {
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
    <h1 class="short-message">Bildschrim zu klein</h1>
    <div class="container">
        <div class="grid-container">
            <div class="grid-item p1" id="p1-home-1">"""),_display_(/*52.55*/player(0)),format.raw/*52.64*/("""</div>
            <div class="grid-item p1" id="p1-home-2">"""),_display_(/*53.55*/player(1)),format.raw/*53.64*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-39">"""),_display_(/*56.51*/field(8)),format.raw/*56.59*/("""</div>
            <div class="grid-item" id="field-40">"""),_display_(/*57.51*/field(9)),format.raw/*57.59*/("""</div>
            <div class="grid-item p2" id="field-1">"""),_display_(/*58.53*/field(10)),format.raw/*58.62*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-1">"""),_display_(/*61.55*/player(4)),format.raw/*61.64*/("""</div>
            <div class="grid-item p2" id="p2-home-2">"""),_display_(/*62.55*/player(5)),format.raw/*62.64*/("""</div>

            <div class="grid-item p1" id="p1-home3">"""),_display_(/*64.54*/player(2)),format.raw/*64.63*/("""</div>
            <div class="grid-item p1" id="p1-home4">"""),_display_(/*65.54*/player(3)),format.raw/*65.63*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-38">"""),_display_(/*68.51*/field(7)),format.raw/*68.59*/("""</div>
            <div class="grid-item p2" id="p2-final-1">"""),_display_(/*69.56*/home(4)),format.raw/*69.63*/("""</div>
            <div class="grid-item" id="field-2">"""),_display_(/*70.50*/field(11)),format.raw/*70.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p2" id="p2-home-3">"""),_display_(/*73.55*/player(6)),format.raw/*73.64*/("""</div>
            <div class="grid-item p2" id="p2-home-4">"""),_display_(/*74.55*/player(7)),format.raw/*74.64*/("""</div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">A</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-37">"""),_display_(/*80.51*/field(6)),format.raw/*80.59*/("""</div>
            <div class="grid-item p2" id="p2-final-2">"""),_display_(/*81.56*/home(5)),format.raw/*81.63*/("""</div>
            <div class="grid-item" id="field-3">"""),_display_(/*82.50*/field(12)),format.raw/*82.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">B</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-36">"""),_display_(/*92.51*/field(5)),format.raw/*92.59*/("""</div>
            <div class="grid-item p2" id="p2-final-3">"""),_display_(/*93.56*/home(6)),format.raw/*93.63*/("""</div>
            <div class="grid-item" id="field-4">"""),_display_(/*94.50*/field(13)),format.raw/*94.59*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item p1" id="p1-start">"""),_display_(/*100.54*/field(0)),format.raw/*100.62*/("""</div>
            <div class="grid-item" id="field-32">"""),_display_(/*101.51*/field(1)),format.raw/*101.59*/("""</div>
            <div class="grid-item" id="field-33">"""),_display_(/*102.51*/field(2)),format.raw/*102.59*/("""</div>
            <div class="grid-item" id="field-34">"""),_display_(/*103.51*/field(3)),format.raw/*103.59*/("""</div>
            <div class="grid-item" id="field-35">"""),_display_(/*104.51*/field(4)),format.raw/*104.59*/("""</div>
            <div class="grid-item p2" id="p2-final4">"""),_display_(/*105.55*/home(7)),format.raw/*105.62*/("""</div>
            <div class="grid-item" id="field-5">"""),_display_(/*106.50*/field(14)),format.raw/*106.59*/("""</div>
            <div class="grid-item" id="field-6">"""),_display_(/*107.50*/field(15)),format.raw/*107.59*/("""</div>
            <div class="grid-item" id="field-7">"""),_display_(/*108.50*/field(16)),format.raw/*108.59*/("""</div>
            <div class="grid-item" id="field-8">"""),_display_(/*109.50*/field(17)),format.raw/*109.59*/("""</div>
            <div class="grid-item" id="field-9">"""),_display_(/*110.50*/field(18)),format.raw/*110.59*/("""</div>

            <div class="grid-item" id="field-30">"""),_display_(/*112.51*/field(39)),format.raw/*112.60*/("""</div>
            <div class="grid-item p1" id="p1-final-1">"""),_display_(/*113.56*/home(0)),format.raw/*113.63*/("""</div>
            <div class="grid-item p1" id="p1-final-2">"""),_display_(/*114.56*/home(1)),format.raw/*114.63*/("""</div>
            <div class="grid-item p1" id="p1-final-3">"""),_display_(/*115.56*/home(2)),format.raw/*115.63*/("""</div>
            <div class="grid-item p1" id="p1-final-4">"""),_display_(/*116.56*/home(3)),format.raw/*116.63*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-final-4">"""),_display_(/*118.56*/home(11)),format.raw/*118.64*/("""</div>
            <div class="grid-item p4" id="p4-final-3">"""),_display_(/*119.56*/home(10)),format.raw/*119.64*/("""</div>
            <div class="grid-item p4" id="p4-final-2">"""),_display_(/*120.56*/home(9)),format.raw/*120.63*/("""</div>
            <div class="grid-item p4" id="p4-final-1">"""),_display_(/*121.56*/home(8)),format.raw/*121.63*/("""</div>
            <div class="grid-item" id="field-10">"""),_display_(/*122.51*/field(19)),format.raw/*122.60*/("""</div>




            <div class="grid-item" id="field-29">"""),_display_(/*127.51*/field(38)),format.raw/*127.60*/("""</div>
            <div class="grid-item" id="field-28">"""),_display_(/*128.51*/field(37)),format.raw/*128.60*/("""</div>
            <div class="grid-item" id="field-27">"""),_display_(/*129.51*/field(36)),format.raw/*129.60*/("""</div>
            <div class="grid-item" id="field-26">"""),_display_(/*130.51*/field(35)),format.raw/*130.60*/("""</div>
            <div class="grid-item" id="field-25">"""),_display_(/*131.51*/field(34)),format.raw/*131.60*/("""</div>
            <div class="grid-item p3" id="p3-final-4">"""),_display_(/*132.56*/home(15)),format.raw/*132.64*/("""</div>
            <div class="grid-item" id="field-15">"""),_display_(/*133.51*/field(24)),format.raw/*133.60*/("""</div>
            <div class="grid-item" id="field-14">"""),_display_(/*134.51*/field(23)),format.raw/*134.60*/("""</div>
            <div class="grid-item" id="field-13">"""),_display_(/*135.51*/field(22)),format.raw/*135.60*/("""</div>
            <div class="grid-item" id="field-12">"""),_display_(/*136.51*/field(21)),format.raw/*136.60*/("""</div>
            <div class="grid-item p4" id="field-11">"""),_display_(/*137.54*/field(20)),format.raw/*137.63*/("""</div>




            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-24">"""),_display_(/*146.51*/field(33)),format.raw/*146.60*/("""</div>
            <div class="grid-item p3" id="p3-final-3">"""),_display_(/*147.56*/home(14)),format.raw/*147.64*/("""</div>
            <div class="grid-item" id="field-16">"""),_display_(/*148.51*/field(25)),format.raw/*148.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>

            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">D</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-23">"""),_display_(/*158.51*/field(32)),format.raw/*158.60*/("""</div>
            <div class="grid-item p3" id="p3-final-2">"""),_display_(/*159.56*/home(13)),format.raw/*159.64*/("""</div>
            <div class="grid-item" id="field-17">"""),_display_(/*160.51*/field(26)),format.raw/*160.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden player-name">C</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>


            <div class="grid-item p3" id="p3-home-1">"""),_display_(/*167.55*/player(12)),format.raw/*167.65*/("""</div>
            <div class="grid-item p3" id="p3-home-2">"""),_display_(/*168.55*/player(13)),format.raw/*168.65*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item" id="field-22">"""),_display_(/*171.51*/field(31)),format.raw/*171.60*/("""</div>
            <div class="grid-item p3" id="p3-final-1">"""),_display_(/*172.56*/home(12)),format.raw/*172.64*/("""</div>
            <div class="grid-item" id="field-18">"""),_display_(/*173.51*/field(27)),format.raw/*173.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-1">"""),_display_(/*176.55*/player(8)),format.raw/*176.64*/("""</div>
            <div class="grid-item p4" id="p4-home-2">"""),_display_(/*177.55*/player(9)),format.raw/*177.64*/("""</div>

            <div class="grid-item p3" id="p3-home-3">"""),_display_(/*179.55*/player(14)),format.raw/*179.65*/("""</div>
            <div class="grid-item p3" id="p3-home-4">"""),_display_(/*180.55*/player(15)),format.raw/*180.65*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p3" id="field-21">"""),_display_(/*183.54*/field(30)),format.raw/*183.63*/("""</div>
            <div class="grid-item" id="field-20">"""),_display_(/*184.51*/field(29)),format.raw/*184.60*/("""</div>
            <div class="grid-item" id="field-19">"""),_display_(/*185.51*/field(28)),format.raw/*185.60*/("""</div>
            <div class="grid-item hidden"></div>
            <div class="grid-item hidden"></div>
            <div class="grid-item p4" id="p4-home-3">"""),_display_(/*188.55*/player(10)),format.raw/*188.65*/("""</div>
            <div class="grid-item p4" id="p4-home-4">"""),_display_(/*189.55*/player(11)),format.raw/*189.65*/("""</div>
        
    </div>
    <!---
    <div id="inputs">
        <form action="/fullBoardGo" method="POST">
            <div class="form-div">
                <label for="figur">Suche dir eine Figur aus</label>
            </div>
            <div><input type="number" name="figur" id="figur" value="1" min="1" max="4" steps="1"></div>
            <input type="submit" class="button" value="Fahren">
            <div id="box"><img class="img" src=""""),_display_(/*200.50*/routes/*200.56*/.Assets.versioned(s"images/dice/" + diceResult + ".svg")),format.raw/*200.112*/("""" alt="one" /></div>
        </form>
    </div>
  -->

  <form method="POST" action="/fullBoardGo">
    <div class="form-group">
      <label for="figur">Welcher Spieler ist dran?</label>
      <select name="figur" class="form-control" id="figur">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
      </select>
      <input type="submit" class="btn btn-primary" value="Fahren"/>
      <div id="box-dynamic"><img class="img-dynamic" src=""""),_display_(/*215.60*/routes/*215.66*/.Assets.versioned(s"images/dice/" + diceResult + ".svg")),format.raw/*215.122*/("""" alt="one" /></div>
    </div>
  <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
      Spiel Abbrechen
  </button>
  </form>
    
    
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
</div>

</html>"""))
      }
    }
  }

  def render(controller:de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,diceResult:String,currentPlayer:String): play.twirl.api.HtmlFormat.Appendable = apply(controller,diceResult,currentPlayer)

  def f:((de.htwg.se.madn.Controller.controllerComponent.controllerBaseImpl.Controller,String,String) => play.twirl.api.HtmlFormat.Appendable) = (controller,diceResult,currentPlayer) => apply(controller,diceResult,currentPlayer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/fullBoardGo.scala.html
                  HASH: 6ad3a2c95c1da6089e8e21a00dc3971414c4850b
                  MATRIX: 819->1|1030->136|1042->141|1084->172|1097->178|1140->210|1151->214|1208->170|1235->208|1263->242|1293->245|1532->457|1547->463|1615->509|1694->561|1709->567|1777->613|3476->2287|3506->2296|3594->2357|3624->2366|3806->2521|3835->2529|3919->2586|3948->2594|4034->2653|4064->2662|4250->2821|4280->2830|4368->2891|4398->2900|4486->2961|4516->2970|4603->3030|4633->3039|4815->3194|4844->3202|4933->3264|4961->3271|5044->3327|5074->3336|5260->3495|5290->3504|5378->3565|5408->3574|5702->3841|5731->3849|5820->3911|5848->3918|5931->3974|5961->3983|6451->4446|6480->4454|6569->4516|6597->4523|6680->4579|6710->4588|6995->4845|7025->4853|7110->4910|7140->4918|7225->4975|7255->4983|7340->5040|7370->5048|7455->5105|7485->5113|7574->5174|7603->5181|7687->5237|7718->5246|7802->5302|7833->5311|7917->5367|7948->5376|8032->5432|8063->5441|8147->5497|8178->5506|8264->5564|8295->5573|8385->5635|8414->5642|8504->5704|8533->5711|8623->5773|8652->5780|8742->5842|8771->5849|8910->5960|8940->5968|9030->6030|9060->6038|9150->6100|9179->6107|9269->6169|9298->6176|9383->6233|9414->6242|9503->6303|9534->6312|9619->6369|9650->6378|9735->6435|9766->6444|9851->6501|9882->6510|9967->6567|9998->6576|10088->6638|10118->6646|10203->6703|10234->6712|10319->6769|10350->6778|10435->6835|10466->6844|10551->6901|10582->6910|10670->6970|10701->6979|10986->7236|11017->7245|11107->7307|11137->7315|11222->7372|11253->7381|11744->7844|11775->7853|11865->7915|11895->7923|11980->7980|12011->7989|12311->8261|12343->8271|12432->8332|12464->8342|12647->8497|12678->8506|12768->8568|12798->8576|12883->8633|12914->8642|13101->8801|13132->8810|13221->8871|13252->8880|13342->8942|13374->8952|13463->9013|13495->9023|13681->9181|13712->9190|13797->9247|13828->9256|13913->9313|13944->9322|14131->9481|14163->9491|14252->9552|14284->9562|14762->10012|14778->10018|14857->10074|15384->10573|15400->10579|15479->10635
                  LINES: 21->1|25->2|25->2|27->5|27->5|29->8|29->8|32->4|33->7|34->10|37->13|44->20|44->20|44->20|45->21|45->21|45->21|76->52|76->52|77->53|77->53|80->56|80->56|81->57|81->57|82->58|82->58|85->61|85->61|86->62|86->62|88->64|88->64|89->65|89->65|92->68|92->68|93->69|93->69|94->70|94->70|97->73|97->73|98->74|98->74|104->80|104->80|105->81|105->81|106->82|106->82|116->92|116->92|117->93|117->93|118->94|118->94|124->100|124->100|125->101|125->101|126->102|126->102|127->103|127->103|128->104|128->104|129->105|129->105|130->106|130->106|131->107|131->107|132->108|132->108|133->109|133->109|134->110|134->110|136->112|136->112|137->113|137->113|138->114|138->114|139->115|139->115|140->116|140->116|142->118|142->118|143->119|143->119|144->120|144->120|145->121|145->121|146->122|146->122|151->127|151->127|152->128|152->128|153->129|153->129|154->130|154->130|155->131|155->131|156->132|156->132|157->133|157->133|158->134|158->134|159->135|159->135|160->136|160->136|161->137|161->137|170->146|170->146|171->147|171->147|172->148|172->148|182->158|182->158|183->159|183->159|184->160|184->160|191->167|191->167|192->168|192->168|195->171|195->171|196->172|196->172|197->173|197->173|200->176|200->176|201->177|201->177|203->179|203->179|204->180|204->180|207->183|207->183|208->184|208->184|209->185|209->185|212->188|212->188|213->189|213->189|224->200|224->200|224->200|239->215|239->215|239->215
                  -- GENERATED --
              */
          