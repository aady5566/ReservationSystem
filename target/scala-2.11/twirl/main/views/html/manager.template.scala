
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
<form method="post" id="connect" enctype='application/json' onsubmit="tranSub();">
</form>
<h3>Title:</h3>
<input type="text" name="title" form="connect" required><br/>
<h3>Content:</h3>
<textarea name="content" rows="20" cols="40" form="connect" required></textarea><br/>
<h3>Name:</h3>
<input type="text" name="name" form="connect" required><br/>
<h3>Phone:</h3>
<input type="text" name="phone" form="connect" required><br/>
<h3>Email:</h3>
<input type="email" name="email" form=connect required><br/>
<h3>Date:</h3>
<div id="dynamicInput">
    <div id=removedate_0></br>
        <input type='datetime-local' name='d[0]' form='connect'>
        <input type='hidden' id='timestamp' name='t[0]' form='connect'>
        <input type=button id=more_fields"+(counter)+" onclick=removeDate(0); value='Remove' ></div>
</div>
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
                  DATE: Wed Dec 16 23:01:07 GMT+08:00 2015
                  SOURCE: C:/opt/WorkSpaceForScala/reservationsystem/app/views/manager.scala.html
                  HASH: 886cbce64dc4d0ba6da10dc1a616eb1e8fa2a199
                  MATRIX: 613->0|780->141|794->147|865->197|1112->418|1126->424|1199->477|1280->531|1295->537|1362->583
                  LINES: 25->1|30->6|30->6|30->6|33->9|33->9|33->9|34->10|34->10|34->10
                  -- GENERATED --
              */
          