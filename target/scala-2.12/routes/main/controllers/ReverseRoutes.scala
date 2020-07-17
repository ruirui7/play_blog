
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/龍/Desktop/play_blog/conf/routes
// @DATE:Thu Jul 16 18:45:51 JST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHelloController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get(name:Option[String]): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("name", name)))))
    }
  
  }


}
