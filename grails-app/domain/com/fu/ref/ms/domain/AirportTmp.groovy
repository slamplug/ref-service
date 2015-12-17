package com.fu.ref.ms.domain

/**
 * Created by slamplugh on 04/12/2015.
 */
class AirportTmp {

    int _id
    String ident
    String type
    String name
    float lattitude_deg
    float longitude_deg
    int elevation_ft
    String continent
    String iso_region
    String municipality
    String scheduled_service
    String gps_code
    String iata_code
    String local_code
    String home_link
    String wikipedia_link
    String keywords

    static constraints = {
        local_code nullable: true, blank: true
        home_link nullable: true, blank: true
        wikipedia_link nullable: true, blank: true
        keywords nullable: true, blank: true
    }

    static mapping = {
        collection "airportstmp"
    }

    static mapWith = "mongo"

}
