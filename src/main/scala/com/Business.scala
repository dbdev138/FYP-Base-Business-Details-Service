package com

import org.json4s.native.Serialization
import org.json4s.native.Serialization._
import org.json4s.ShortTypeHints

trait Business

case class BaseBusinessDetail(name: String, channel: String, channel_type: String, phone: Int, address: String, town: String, county: String, region: String ) extends Business

object Business {
    val businesses = List[Business](
             BaseBusinessDetail(name = "Brownes Butchers", channel = "food", channel_type = "butchers", phone = 8412113, address ="19 Bridge Street Balbriggan Co. Dublin", town = "Balbriggan", county = "Dublin", region = "Leinster"),
             BaseBusinessDetail(name = "Landmark Estates", channel = "property", channel_type = "estate agents", phone = 8414726, address ="21 Drogheda Street Balbriggan Co. Dublin", town = "Balbriggan", county = "Dublin", region = "Leinster"),
             BaseBusinessDetail(name = "Village Art Gallery", channel = "art", channel_type = "gallery", phone = 8492236, address ="83 Strand Street Skerries Co. Dublin", town = "Skerries", county = "Dublin", region = "Leinster")
        )
        
    val count = businesses.length

    private implicit val formats = Serialization.formats(ShortTypeHints(List(classOf[BaseBusinessDetail])))
    def toJSon(businesses: List[Business]): String = writePretty(businesses)
    def toJSon(business: Business): String = writePretty(business)
}