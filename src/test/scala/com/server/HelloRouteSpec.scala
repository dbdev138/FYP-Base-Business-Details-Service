package com.server


/**
 * Created by pc on 19/01/2016.
 */

import org.scalatest.{FlatSpec, ShouldMatchers}
import spray.testkit.ScalatestRouteTest
import spray.routing.Directives


class HelloRouteSpec extends FlatSpec with ShouldMatchers
    with ScalatestRouteTest with Directives {


    it should "produce a welocme message" in {
      Get("/hello") ~> BaseBusinessDetailsService.helloRoute ~> check {
        responseAs[String] should include ("Welcome to the Base Business Details Service \n " +
          "here are a list of the available routes:")
      }
    }



}
