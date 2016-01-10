
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/jetD_YD/ReservationSystem/conf/routes
// @DATE:Sun Jan 10 12:08:59 HKT 2016


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
