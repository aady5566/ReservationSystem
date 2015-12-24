
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/opt/WorkSpaceForScala/reservationsystem/conf/routes
// @DATE:Wed Dec 16 23:01:06 GMT+08:00 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
