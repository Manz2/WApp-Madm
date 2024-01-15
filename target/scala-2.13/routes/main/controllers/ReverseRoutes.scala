// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:35
package controllers {

  // @LINE:35
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def health(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "health")
    }
  
    // @LINE:43
    def socket: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "websocket")
    }
  
    // @LINE:41
    def resetGame(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "resetGame")
    }
  
    // @LINE:35
    def getFields(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fieldsJson")
    }
  
    // @LINE:37
    def updateFields(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "fieldsJson")
    }
  
  }

  // @LINE:49
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
