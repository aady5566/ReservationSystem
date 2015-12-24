package controllers

/**
 * Created by cirrusdi on 12/6/15.
 */

import DAO.DBCRUDDynamoDB
import play.api._
import play.api.mvc._

case class produceExperimentSchedule(title:String,content:String,name:String,email:String,phone:String
                                     ,t:List[Long]
                                      )

class Producer extends Controller {


  val dynamoDB = createDynamoDBclient("http://192.168.12.106:8000")

  //  "http://192.168.114.12:8000"
  def createDynamoDBclient(endpoint:String )={
    //  com.amazonaws.auth.profile.ProfileCredentialsProvider
    val credentials =  new com.amazonaws.auth.BasicAWSCredentials("DDD","bogus")
    val dynamoDBClient =  new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient(credentials)
    dynamoDBClient.setEndpoint(endpoint)
    val dynamoDBInstance = new com.amazonaws.services.dynamodbv2.document.DynamoDB(dynamoDBClient)
    dynamoDBInstance
  }


  // we can test by shell
  // curl --header "Content-type: application/json" --request POST --data '{"title":"DAD","content":"ddasdasdfg","name":"yd","email":"dd@cc.com","phone":"4653125","date":"465846"}' http://localhost:9000/uploadSchedule
  def uploadSchedule() = Action {

    implicit request => {

      //    ref by https://www.playframework.com/documentation/2.4.x/ScalaForms
      import play.api.data._
      import play.api.data.Forms._

//      case class produceExperimentSchedule(title:String,content:String,name:String,email:String,phone:String
//                                           ,t:List[Long]
//                                            )
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

          val tableName ="reservationTable"
          val table = dynamoDB.getTable(tableName)
          //   scala list to java list
          //   http://stackoverflow.com/questions/29686544/convert-scala-list-to-java-list
//      http://www.scala-lang.org/api/2.11.4/index.html#scala.collection.JavaConversions$
      val item = new com.amazonaws.services.dynamodbv2.document.Item


      import scala.collection.JavaConversions._
      val javaList : java.util.List[Long] = scheduleData.t.toStream
      item.withPrimaryKey("email",scheduleData.email )
            .withString("title", scheduleData.title)
            .withString("content", scheduleData.content)
            .withString("name", scheduleData.name)
            .withString("phone", scheduleData.phone)
            .withList("time", javaList )

      val outcome = table.putItem(item)


      val allText= ""
//      scheduleData.t.foreach( println )
//
//      val dbUpdate:DAO.IDBCRUD = new DBCRUDDynamoDB("http://192.168.1.111:8000")
//      dbUpdate.insertRecord("reservationTable",scheduleForm)

//      println(allText)
      Ok(allText)
    }

  }

//  def getRecordFromDB = Action{
//    implicit request => {
//      val table = dynamoDB.getTable("reservationTable")
//      val item =  table.getItem("email","ddd")
//      Ok()
//    }
//  }

  def manager()=Action {

    Ok(views.html.manager())
  }


}
