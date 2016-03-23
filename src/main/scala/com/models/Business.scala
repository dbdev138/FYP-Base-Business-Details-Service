package com.models

trait Business

object Business{
    
    case class Business(id: Int, name: String, channel: String, channel_type: String, phone: String, address: String, town: String, county: String, region: String )
    
    val businesses = List[Business](
        Business(0, "Brooks Hire", "retail", "hire", "+35318410436", "Unit BC5 M1 Business Park Courtlough Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(1, "Harry Hire", "retail", "hire", "+35318412417", "3 Dublin Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(2, "O' Rourke Plant Hire", "retail", "hire", "+35318415942", "51 Pinewood Green Lawn Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(3, "Quads For Hire", "retail", "hire", "+353868723219", "Balrothery Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(4, "Jack Doyles Bar", "f&b", "pub", "+35318413333", "Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(5, "Harvest Inn", "f&b", "pub", "+35318411265", "Drogheda Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(6, "Milestone Inn", "f&b", "pub", "+35318412176", "Drogheda Street Balbriggan Co Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(7, "White Hart Inn", "f&b", "pub", "+35318412190", "Dublin Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(8, "Man O War Inn", "f&b", "pub", "+35318414052", "Courtlough Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(9, "Brownes Butchers", "food", "butchers", "+35318412113", "19 Bridge Street Balbriggan Co. Dublin", "Balbriggan","Dublin", "Leinster"),
        Business(10, "Landmark Estates", "property", "estate agents", "+35318414726", "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Dublin", "Leinster"),
        Business(11, "Landmark Estates", "property", "estate agents", "+35318414726", "21 Drogheda Street Balbriggan Co. Dublin", "Balbriggan", "Dublin", "Leinster"),
        Business(12, "Village Art Gallery", "art", "gallery", "+35318492236", "83 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(13, "Carrolls Pierhouse Hotel Restaurant", "f&b", "restaurant", "+35318491033", "Harbour Road Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(14, "Central Cafe", "f&b", "cafe", "+35318491374", "75 Strand Street Skerries Co.Dublin", "Skerries", "Dublin", "Leinster"),
        Business(15, "O'Sheas Bar & Restaurant", "f&b", "pub", "+35318491374", "17 New Street Skerries Co Dublin", "Skerries", "Dublin", "Leinster"),
        Business(16, "Olive", "f&b", "cafe", "+35318490310", "86A Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(17, "Parachute Cafe", "f&b", "cafe", "+35318492322", "47 Thomas Hand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(18, "Pasta Pizza", "f&b", "restaurant", "+35318492724", "54 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(19, "Pheonix Chinese Take Away", "f&b", "takeaway", "+35318490848", "South Strand Skerries Co Dublin", "Skerries", "Dublin", "Leinster"),
        Business(20, "Russelle Restauran", "f&b", "restaurant", "+35318492450", "24 Strand Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(21, "The Cottage Bistro", "f&b", "restaurant", "+35318492450", "17 New Street Skerries Co. Dublin", "Skerries", "Dublin", "Leinster"),
        Business(22, "The Lifeboat Restaurant", "f&b", "restaurant", "+35318490109", "Harbour Road Skerries Co Dublin", "Skerries", "Dublin", "Leinster")
      )

}



