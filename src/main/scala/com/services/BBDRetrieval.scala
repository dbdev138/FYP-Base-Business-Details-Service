package com.services

import com.models.Business

import scala.collection.mutable._ 
import net.liftweb.json._
import net.liftweb.json.Serialization.write
import java.util.Calendar

object BBDRetrieval {
    
	implicit val formats = DefaultFormats
	
	
	//Helper method for logging 
	def serviceRequestlog(requestedService: String, queryParamaeter: String) : Unit = {
	    val timeStamp = Calendar.getInstance.getTime
	    println("[ SERVICE REQUEST LOG ] -----------------------------")
	    println(s"--> Request for service: [ $requestedService ] received ")
	    println(s"--> At $timeStamp")
	    println(s"--> With query parameter: $queryParamaeter")
	    println(s"--> Query parameter is an instance of String = ${queryParamaeter.isInstanceOf[String]}")
	}
	
	
	def businessList() : String = {
		val businesses = Business.businesses
		val jsonString = write(businesses)
		return jsonString
	}

	def businessListCount() : Int = {
		val businesses = Business.businesses
		val count = businesses.length
		return count
	}
	
	def businessesByTown(town: String) : String = {
		val businesses = Business.businesses
		val businessesByTown = for(b <- businesses if b.town == town) yield b
		val jsonString = write(businessesByTown)
		serviceRequestlog("Business By Town", "Town")
		return jsonString
	}
	
	def businessesByCounty(county: String) : String = {
		val businesses = Business.businesses
		val businessesByCounty = for(b <- businesses if b.county == county) yield b
		val jsonString = write(businessesByCounty)
		serviceRequestlog("Business By County", "County")
		return jsonString
	}
	
	def businessesByRegion(region: String) : String = {
		val businesses = Business.businesses
		val businessByRegion = for(b <- businesses if b.region == region) yield b
		val jsonString = write(businessByRegion)
		serviceRequestlog("Business By Region", "Region")
		return jsonString
	}
	
	def businessById(id: Int) : String = {
		val businesses = Business.businesses
		val businessById = for(b <- businesses if b.id == id) yield b
		val jsonString = write(businessById)
		return jsonString
	}
	

}