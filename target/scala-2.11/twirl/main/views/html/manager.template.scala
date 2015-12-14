
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
<!--<form action="1.php" method="post" id="connect" name="check"> -->
<form method="post" id="connect" enctype='application/json' onsubmit="tranSub();">
<h3>Title:</h3>
<input type="text" name="title" form="connect" ><br/>
<h3>Content:</h3>
<textarea name="content" rows="20" cols="40" form="connect" ></textarea><br/>
<h3>Name:</h3>
<input type="text" name="name" form="connect" ><br/>
<h3>Phone:</h3>
<input type="text" name="phone" form="connect" ><br/>
<h3>Email:</h3>
<input type="email" name="email" ><br/>
<h3>Date:</h3>
    <div id="dynamicInput">
        <input id="arrivalDate" type='datetime-local' name='d[0]'  form='connect' required>
        <input type='hidden' id='timestamp' name="t[0]" form='connect'>
    </div>
</form>
    <input type="button" value="Add another date" onClick="addInput('dynamicInput');" form="connect">
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
                  DATE: Sat Dec 12 20:33:37 HKT 2015
                  SOURCE: /Users/apple/Documents/HTML/reservationSystem/ReservationSystem-master/app/views/manager.scala.html
                  HASH: 590efdcbaaad25e86a16138740c0e442e1bfe84e
                  MATRIX: 613->0|775->136|789->142|860->192|1104->410|1118->416|1191->469|1271->522|1286->528|1353->574
                  LINES: 25->1|30->6|30->6|30->6|33->9|33->9|33->9|34->10|34->10|34->10
                  -- GENERATED --
              */
          