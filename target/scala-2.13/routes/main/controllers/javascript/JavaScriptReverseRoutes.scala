// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:35
package controllers.javascript {

  // @LINE:35
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def health: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.health",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "health"})
        }
      """
    )
  
    // @LINE:43
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "websocket"})
        }
      """
    )
  
    // @LINE:41
    def resetGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.resetGame",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resetGame"})
        }
      """
    )
  
    // @LINE:35
    def getFields: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getFields",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fieldsJson"})
        }
      """
    )
  
    // @LINE:37
    def updateFields: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateFields",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fieldsJson"})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
