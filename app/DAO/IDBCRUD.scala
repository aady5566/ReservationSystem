package DAO

/**
 * Created by BingHongLi on 2015/12/16.
 */
trait IDBCRUD {


  def createTable(tableName:String,primalKey:String,pkType:String)
  def deleteTable(tableName:String)

  def insertRecord(tableName:String,formParseSchema:play.api.data.Form[controllers.produceExperimentSchedule])
//  def getRecord(tableName:String)
//  def updateRecord(tableName:String)
//  def deleteRecord(tableName:String)

}
