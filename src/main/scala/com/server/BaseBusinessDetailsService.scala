package com.server

import akka.actor.ActorSystem
import spray.http.MediaTypes
import spray.routing.{Route, SimpleRoutingApp}
import com.Business

object BaseBusinessDetailsService extends App with SimpleRoutingApp {
  implicit val actorSystem = ActorSystem()


  var businessList = Business.businesses
  val businessCount = Business.count.toInt
  //val business_json = Business.business_json

  //Custom directive to replace the inclcusion of the stated return type header
  def getJson(route: Route) = get{
    respondWithMediaType(MediaTypes.`application/json`){
      route
    }
  }

  //Define Each route independently as lazy vals to keep code clean
  //Link the names of each route in the start server method

  lazy val helloRoute = get {
    path("hello") {
      complete {
        "Welcome to the Base Business Details Service \n here are a list of the available routes:"
      }
    }
  }

  lazy val countAllRoute = getJson{
    path("baseBusinesses" / "all" / "count"){
      complete{
        val count = businessCount.toInt
        s"$count"
      }
    }
  }

  lazy val listAllRoute = getJson {
    path("baseBusinesses" / "all" / "details"){
      complete{
                Business.toJSon(businessList)
//          val url = "https://api.myjson.com/bins/2dpx7"
//          val x = Business.getSampleJson(url)
////          val json = x.toString
//          s"$x"
      }
    }
  }

  lazy val selectWithIndexRoute = getJson{
    path("baseBusinesses" / IntNumber / "details"){ index =>
      complete{
        Business.toJSon(businessList(index))
      }
    }
  }


  startServer(interface = "localhost", port = 8081) {
    helloRoute~
    countAllRoute~
    listAllRoute~
    selectWithIndexRoute
  }

}