package DAO

import java.util


import com.amazonaws.services.dynamodbv2.model._
import play.api.mvc.Request

/**
 * Created by BingHongLi on 2015/12/16.
 */
class DBCRUDDynamoDB(serverHost:String)    {

  val dynamoDB = createDynamoDBclient()

//  "http://192.168.114.12:8000"
  def createDynamoDBclient(endpoint:String = serverHost )={
    //  com.amazonaws.auth.profile.ProfileCredentialsProvider
    val credentials =  new com.amazonaws.auth.BasicAWSCredentials("DDD","bogus")
    val dynamoDBClient =  new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient(credentials)
    dynamoDBClient.setEndpoint(endpoint)
    val dynamoDBInstance = new com.amazonaws.services.dynamodbv2.document.DynamoDB(dynamoDBClient)
    dynamoDBInstance
  }

  @Override
  def createTable(tableName:String, primalKey:String,pkType:String ) = {
    //    com.amazonaws.services.dynamodbv2.model.AttributeDefinition
    val attributeDefinitions = new util.ArrayList[AttributeDefinition]()

    //    item attr
    attributeDefinitions.add(
      new AttributeDefinition()
        .withAttributeName(primalKey)
        .withAttributeType(pkType)
    )

    //    create a table key schema
    //    com.amazonaws.services.dynamodbv2.model.KeySchemaElement
    //    com.amazonaws.services.dynamodbv2.model.KeyType
    val keySchema = new util.ArrayList[KeySchemaElement]()
    keySchema.add(
      new KeySchemaElement()
        .withAttributeName(primalKey)
        .withKeyType(KeyType.HASH))

    //    com.amazonaws.services.dynamodbv2.model.CreateTableRequest
    //    com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput
    val createTableRequest = new CreateTableRequest()
      .withTableName(tableName)
      .withKeySchema(keySchema)
      .withAttributeDefinitions(attributeDefinitions)
      .withProvisionedThroughput(
        new ProvisionedThroughput()
          .withReadCapacityUnits(5L)
          .withWriteCapacityUnits(6L)
      )

    println("Issuing CreateTable request for "+ tableName)
    val table = dynamoDB.createTable(createTableRequest)
    println("Waiting for "+ tableName + " to be created... this may take a while...")


    val tableDescription = dynamoDB.getTable(tableName).describe()

    println(tableDescription.getTableStatus+": \t "+tableDescription.getTableName+ " \t ReadCapacityUnits: "+tableDescription.getProvisionedThroughput().getReadCapacityUnits()+" \t WriteCapacityUnits: "+ tableDescription.getProvisionedThroughput().getWriteCapacityUnits())

  }

  @Override
  def deleteTable(tableName:String)={
    val table = dynamoDB.getTable(tableName)
    table.delete()
    println("Delete Table")
    table.waitForDelete()
  }


//  @Override
//  def insertRecord(tableName:String,formParseSchema:play.api.data.Form[controllers.produceExperimentSchedule])={
//
//    val requestAfterParse = formParseSchema.bindFromRequest().get
//    val table = dynamoDB.getTable(tableName)
//    //   scala list to java list
//    //   http://stackoverflow.com/questions/29686544/convert-scala-list-to-java-list
//    val item = new com.amazonaws.services.dynamodbv2.document.Item
//    import scala.collection.JavaConversions._
//    val javaList : java.util.List[Long] = formParseSchema.t.toStream
//    item.withPrimaryKey("email",formParseSchema.email )
//      .withString("title", formParseSchema.title)
//      .withString("content", formParseSchema.content)
//      .withString("name", formParseSchema.name)
//      .withString("phone", formParseSchema.phone)
//      .withList("time", javaList )
//
//
//    val outcome = table.putItem(item)
//
//
//  }

//  def reservationRecordInsert(tableName:String,request:Any):Unit = {
//
////   scala list to java list
////   http://stackoverflow.com/questions/29686544/convert-scala-list-to-java-list
//    val item = new com.amazonaws.services.dynamodbv2.document.Item
//    item.withPrimaryKey("email",request.email )
//      .withString("title", request.title)
//      .withString("content", request.content)
//      .withString("name", request.name)
//      .withString("phone", request.phone)
//      .withStringSet("time",  new util.HashSet[String](request.t))
//
//
//    val outcome = table.putItem(item)
//
//
//  }


}
