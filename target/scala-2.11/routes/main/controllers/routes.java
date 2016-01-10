
// @GENERATOR:play-routes-compiler
// @SOURCE:/Volumes/jetD_YD/ReservationSystem/conf/routes
// @DATE:Sun Jan 10 12:51:03 HKT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProducer Producer = new controllers.ReverseProducer(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProducer Producer = new controllers.javascript.ReverseProducer(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
