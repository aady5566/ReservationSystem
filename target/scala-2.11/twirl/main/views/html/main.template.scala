
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.versioned("images/favicon.png")),format.raw/*7.104*/("""">
        <script src=""""),_display_(/*8.23*/routes/*8.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*8.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*11.10*/content),format.raw/*11.17*/("""
    """),format.raw/*12.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 23:01:07 GMT+08:00 2015
                  SOURCE: C:/opt/WorkSpaceForScala/reservationsystem/app/views/main.scala.html
                  HASH: 4f279872942b58435e4c62b8c7d802ac00ccda1e
                  MATRIX: 530->1|655->31|683->33|772->96|797->101|886->164|900->170|962->211|1050->273|1064->279|1124->318|1176->344|1190->350|1251->391|1348->461|1376->468|1409->474
                  LINES: 20->1|25->1|26->2|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|35->11|35->11|36->12
                  -- GENERATED --
              */
          