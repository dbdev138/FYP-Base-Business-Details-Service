// package com

// import org.json4s.ShortTypeHints
// import org.json4s.native.Serialization
// import org.json4s.native.Serialization._

// trait Business

// case class BaseBusinessDetail(name: String, channel: String, channel_type: String, phone: Int, address: String, town: String, county: String, region: String ) extends Business

// object Business {

//   //Three static objects for testing
//   val b1 = BaseBusinessDetail(name = "Brownes Butchers", channel = "food", channel_type = "butchers", phone = 8412113, address ="19 Bridge Street Balbriggan Co. Dublin", town = "Balbriggan", county = "Dublin", region = "Leinster")
//   val b2 = BaseBusinessDetail(name = "Landmark Estates", channel = "property", channel_type = "estate agents", phone = 8414726, address ="21 Drogheda Street Balbriggan Co. Dublin", town = "Balbriggan", county = "Dublin", region = "Leinster")
//   val b3 = BaseBusinessDetail(name = "Village Art Gallery", channel = "art", channel_type = "gallery", phone = 8492236, address ="83 Strand Street Skerries Co. Dublin", town = "Skerries", county = "Dublin", region = "Leinster")

//     val businesses = List[Business](b1,b2,b3,b2,b1,b3,b1,b2,b3,b2,b1,b3,b1,b2,b3,b2,b1,b3)

//     //Returns a an integer representing the number of businesses
//     val count = businesses.length

//     private implicit val formats = Serialization.formats(ShortTypeHints(List(classOf[BaseBusinessDetail])))
//     //Returns a list of businesses as json objects
// //    def toJSon(businesses: List[Business]): String = writePretty(businesses)
//     def toJSon(businesses: List[Business]): String = {
//         println("List of Businesses: " + businesses)
//         writePretty(businesses)
//     }
//     //Returns a single business as a json object (by index)
//     def toJSon(business: Business): String = {
//         println("List of Businesses: " + business)
//         writePretty(business)
//     }
    
// }

// def businessById(id: Int) : S = {
// 		val bId = id
// 		val businesses = Business.businesses
// 		for(b <- businesses)
// 		    { if (b.id == bId) 
// 		        {
// 		            b
		    
// 		        }
		    
// 	        }
// 	}

//Helper method for sorting a list of businesses according to the query parameters
// 	def getBusinessSubList(k: String, v: String) : List[Business] = {
// 	    val businesses = Business.businesses
// 		val businessesByTown = for(b <- businesses if b.k == v) yield b
// 		return businessesByTown
// 	}



// 	 def businessById(id: Int) : List[BusinessId] = {
// 		val bId = id
// 		val businesses = Business.businesses
// 		val jsonString = write(businesses)
// 		val obj = jsonString.extract[BusinessId]
		
		
		
// 		return obj
// 	 }
	
	
//     def businessById(id: Int) : List[Business] = {
// 		val bId = id
// 		val businesses = Business.businesses
// 		return businesses
		
// // 		for(b <- businesses) { if (b.id == bId) println(b.isInstanceOf[List[Business]) }
// 	}
