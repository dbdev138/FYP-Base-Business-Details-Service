package com.models

trait Business

object Business{
    
    case class Business(id: Int, name: String, channel: String, channel_type: String, phone: Int, address: String, town: String, county: String, region: String )
    
    val businesses = List[Business](
        Business(0, "Brownes Butchers", "food", "butchers", 18412113, "19 Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(1, "Landmark Estates", "property", "estate agents", 18414726, "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Dublin", "Leinster"),
        Business(2, "Village Art Gallery", "art", "gallery", 18492236, "83 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(3, "Brownes Butchers", "food", "butchers", 18412113, "19 Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(4, "Landmark Estates", "property", "estate agents", 18414726, "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Dublin", "Leinster"),
        Business(5, "Village Art Gallery", "art", "gallery", 18492236, "83 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(6, "Brownes Butchers", "food", "butchers", 18412113, "19 Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(7, "Landmark Estates", "property", "estate agents", 18414726, "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Wicklow", "Leinster"),
        Business(8, "Village Art Gallery", "art", "gallery", 18492236, "83 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Munster")
      )

}
