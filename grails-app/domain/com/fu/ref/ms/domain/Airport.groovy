package com.fu.ref.ms.domain

import org.bson.types.ObjectId


class Airport {

    ObjectId id
    int airport_id
    String ident
    String type
    String name
    float lattitude_deg
    float longitude_deg
    int elevation_ft
    String continent
    String iso_region
    String municipality
    String scheduled_service = "no"
    String gps_code
    String iata_code
    String local_code
    String home_link
    String wikipedia_link
    String keywords

    static constraints = {
        scheduled_service nullable: true, blank: true
        continent nullable: true, blank: true
        municipality nullable: true, blank: true
        gps_code nullable: true, blank: true
        iata_code nullable: true, blank: true
        local_code nullable: true, blank: true
        home_link nullable: true, blank: true
        wikipedia_link nullable: true, blank: true
        keywords nullable: true, blank: true
    }

    static mapping = {
        collection "airports"
    }

    static mapWith = "mongo"
}
