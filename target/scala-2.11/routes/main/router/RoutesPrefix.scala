
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/Documents/HTML/reservationSystem/ReservationSystem-master/conf/routes
// @DATE:Mon Dec 07 16:42:56 HKT 2015


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
