package com.server

import akka.actor.ActorSystem
import com.models.Business
import com.support.CORSSupport
import com.services.BBDRetrieval
import spray.http.MediaTypes
import spray.routing.{Route, SimpleRoutingApp}

object BaseBusinessDetailsService extends App with SimpleRoutingApp with CORSSupport{


  implicit val actorSystem = ActorSystem()


  //Custom directive to replace the inclcusion of the stated return type header
  def getJson(route: Route) = get{
    respondWithMediaType(MediaTypes.`application/json`){
      route
    }
  }

  //Define Each route independently as lazy vals to keep code clean
  //Link the names of each route in the start server method

  lazy val helloRoute = get {
      cors{
        path("hello") {
          complete {
            "Welcome to the Base Business Details Service \n here are a list of the available routes:"
          }
        }
      }
  }


  lazy val countAllRoute = getJson{
      cors{
        path("baseBusinesses" / "all" / "count"){
          complete{
              val count = BBDRetrieval.businessListCount().toInt
              s"$count"
          }
        }
      }
  }


   lazy val listAllRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details"){
          complete{
                    BBDRetrieval.businessList()
          }
        }
      }
  }
  
  lazy val listAllByTownRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details" / "towns" / Segment ){ town =>
          complete{
                    BBDRetrieval.businessesByTown(town)
          }
        }
      }
  }
  
lazy val listAllByCountyRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details" / "counties" / Segment ){ county =>
          complete{
                    BBDRetrieval.businessesByCounty(county)
          }
        }
      }
  }
  
  lazy val listAllByRegionRoute = getJson {
      cors{
        path("baseBusinesses" / "all" / "details" / "regions" / Segment ){ region =>
          complete{
                    BBDRetrieval.businessesByRegion(region)
          }
        }
      }
  }
  
  lazy val selectWithIdRoute = get{
     cors{ 
         path("baseBusinesses" / IntNumber / "details"){ id =>
          complete{
             BBDRetrieval.businessById(id)
          }
         }
     }
  }


  startServer(interface = "localhost", port = 8081) {
    helloRoute~
    listAllRoute~
    countAllRoute~
    selectWithIdRoute~
    listAllByTownRoute~
    listAllByCountyRoute~
    listAllByRegionRoute
  }

}

  