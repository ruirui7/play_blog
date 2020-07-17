
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/龍/Desktop/play_blog/conf/routes
// @DATE:Thu Jul 16 18:45:51 JST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseHelloController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloController.get",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
  }


}
