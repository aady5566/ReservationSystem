package controllers

/**
 * Created by cirrusdi on 12/6/15.
 */

import play.api._
import play.api.mvc._

class Producer extends Controller {

  // we can test by shell
  // curl --header "Content-type: application/json" --request POST --data '{"title":"DAD","content":"ddasdasdfg","name":"yd","email":"dd@cc.com","phone":"4653125","date":"465846"}' http://localhost:9000/uploadSchedule
  def uploadSchedule() = Action {

    implicit request => {

      //    ref by https://www.playframework.com/documentation/2.4.x/ScalaForms
      import play.api.data._
      import play.api.data.Forms._

      case class produceExperimentSchedule(title:String,content:String,name:String,email:String,phone:String
                                           ,t:List[Long]
                                            )
      //case class produceExperimentSchedule(title:String,content:String)
      val scheduleForm = Form(mapping(
        "title"->nonEmptyText,
        "content"->nonEmptyText,
        "name"->nonEmptyText,
        "email"->email,
        "phone"->nonEmptyText,
        "t"->list(longNumber)
      )(produceExperimentSchedule.apply)(produceExperimentSchedule.unapply))

      val scheduleData = scheduleForm.bindFromRequest().get

      val allText= ""
      scheduleData.t.foreach( println )

      println(allText)
      Ok(allText)
    }

  }


  def manager()=Action {

    Ok(views.html.manager())
  }


}
