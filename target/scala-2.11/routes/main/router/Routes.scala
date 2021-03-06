
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/jetD_YD/ReservationSystem/conf/routes
// @DATE:Sun Jan 10 12:51:03 HKT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:11
  Producer_0: controllers.Producer,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:11
    Producer_0: controllers.Producer
  ) = this(errorHandler, Application_2, Assets_1, Producer_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Assets_1, Producer_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadSchedule""", """controllers.Producer.uploadSchedule"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.Producer.manager"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.Producer.uploadSchedule"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """send""", """controllers.Producer.send"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Producer_uploadSchedule2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadSchedule")))
  )
  private[this] lazy val controllers_Producer_uploadSchedule2_invoker = createInvoker(
    Producer_0.uploadSchedule,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Producer",
      "uploadSchedule",
      Nil,
      "POST",
      """""",
      this.prefix + """uploadSchedule"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Producer_manager3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_Producer_manager3_invoker = createInvoker(
    Producer_0.manager,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Producer",
      "manager",
      Nil,
      "GET",
      """""",
      this.prefix + """manager"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Producer_uploadSchedule4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_Producer_uploadSchedule4_invoker = createInvoker(
    Producer_0.uploadSchedule,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Producer",
      "uploadSchedule",
      Nil,
      "POST",
      """""",
      this.prefix + """manager"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Producer_send5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("send")))
  )
  private[this] lazy val controllers_Producer_send5_invoker = createInvoker(
    Producer_0.send,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Producer",
      "send",
      Nil,
      "GET",
      """""",
      this.prefix + """send"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Producer_uploadSchedule2_route(params) =>
      call { 
        controllers_Producer_uploadSchedule2_invoker.call(Producer_0.uploadSchedule)
      }
  
    // @LINE:13
    case controllers_Producer_manager3_route(params) =>
      call { 
        controllers_Producer_manager3_invoker.call(Producer_0.manager)
      }
  
    // @LINE:14
    case controllers_Producer_uploadSchedule4_route(params) =>
      call { 
        controllers_Producer_uploadSchedule4_invoker.call(Producer_0.uploadSchedule)
      }
  
    // @LINE:16
    case controllers_Producer_send5_route(params) =>
      call { 
        controllers_Producer_send5_invoker.call(Producer_0.send)
      }
  }
}