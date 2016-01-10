
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object send_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class send extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE HTML>
<html>
<head>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/send_style.css")),format.raw/*4.103*/("""">
    <link href='http://fonts.googleapis.com/css?family=Megrim' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Orbitron' rel='stylesheet' type='text/css'>
</head>
  <body>
    <header>
       <h1>Reservation System</h1>
       <h2>Your Reservation Website is made!</h2>
       <p id=warn>(This web cannot support IE completely.)</p>
    </header>
      <form method=post id="connect" enctype='application/json' onsubmit="tranSub();">
      <h3>Website Link:</h3>
      <p id=link></p>
      <h4 id=deleteInfo>You can only have one website for each NTU email, if you want another one, just delete the present one as below:</h4>

      <h3>Email:</h3>
      <input type=email placeholder="電子信箱" name=email required><br/>
      <h3>Password:</h3>
      <input type=password placeholder="密碼" name=pw id=password  required>
      <input type=password placeholder="密碼驗證" name=pwConfirm id=confirm_password required>
      </form>
      <input type=submit value=Delete name=sub form=connect>
      <button>Get JSON data</button>
	</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object send extends send_Scope0.send
              /*
                  -- GENERATED --
                  DATE: Sun Jan 10 11:57:42 HKT 2016
                  SOURCE: /Volumes/jetD_YD/ReservationSystem/app/views/send.scala.html
                  HASH: 0b4d0a80d06a25472f920f1f117ad9feebb0ba75
                  MATRIX: 607->0|712->79|726->85|794->132
                  LINES: 25->1|28->4|28->4|28->4
                  -- GENERATED --
              */
          