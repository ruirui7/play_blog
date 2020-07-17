
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/龍/Desktop/play_blog/conf/routes
// @DATE:Thu Jul 16 18:45:51 JST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHelloController HelloController = new controllers.ReverseHelloController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHelloController HelloController = new controllers.javascript.ReverseHelloController(RoutesPrefix.byNamePrefix());
  }

}
