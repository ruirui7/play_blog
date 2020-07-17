
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/龍/Desktop/play_blog/conf/routes
// @DATE:Thu Jul 16 18:45:51 JST 2020


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
