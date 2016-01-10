
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manager_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class manager extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/manager_style.css")),format.raw/*6.106*/("""">
    <link href='http://fonts.googleapis.com/css?family=Megrim' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Orbitron' rel='stylesheet' type='text/css'>
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("javascripts/jquery-1.11.3.min.js")),format.raw/*9.78*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/manager_js.js")),format.raw/*10.71*/("""" type="text/javascript"></script>
</head>
<br>
<body>
<header>
    <h1>Reservation System</h1>
    <p id="warn">(This web cannot support IE completely.)</p>
</header>
<form method=post id="connect" enctype='application/json' onsubmit="tranSub();" action='send.scala.html'>
    <h3>Title:</h3>
    <input type=text placeholder="實驗名稱" name=title  required><br/>
    <h3>Content:</h3>
    <textarea name=content placeholder="實驗內容說明" rows=20 cols=40 required></textarea><br/>
    <h3>Name:</h3>
    <input type=text placeholder="姓名" name=name required><br/>
    <h3>Phone:</h3>
    <input type=text placeholder="聯絡電話" name=phone required><br/>
    <h3>Email:</h3>
    <input type=email placeholder="電子信箱" name=email required><br/>
    <h3>Date:</h3>
    <div id="dynamicInput">
        <div id=removedate_0></br>
            <input type=datetime-local name='d[0]'>
            <input type=hidden id=timestamp name='t[0]'>
            <input type=button id=more_fields"+(counter)+" onclick=removeDate(0); value=Remove ></div>
    </div>
</form>
<input type="button" value="addDate" onClick="addInput('dynamicInput');" form="connect">
<input type="submit" value="Submit" name="sub" form="connect"/>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object manager extends manager_Scope0.manager
              /*
                  -- GENERATED --
                  DATE: Sun Jan 10 12:03:21 HKT 2016
                  SOURCE: /Volumes/jetD_YD/ReservationSystem/app/views/manager.scala.html
                  HASH: d64ff37335b59c29c89246d1a85fc6fc62be1855
                  MATRIX: 613->0|775->136|789->142|860->192|1104->410|1118->416|1191->469|1271->522|1286->528|1353->574
                  LINES: 25->1|30->6|30->6|30->6|33->9|33->9|33->9|34->10|34->10|34->10
                  -- GENERATED --
              */
          