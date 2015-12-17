package com.fu.ref.ms.services

import com.fu.ref.ms.domain.Airport
import com.fu.ref.ms.domain.AirportTmp
import grails.transaction.Transactional
import groovy.util.logging.Log4j
import org.bson.types.ObjectId

@Transactional
@Log4j
class RefService {

    def findAirportByAirportCode(String airportCode) {
        log.info("find airport by code $airportCode")
        return Airport.withCriteria{ eq("iata_code", airportCode) }
    }

    /*def migrateAirport() {
        log.info("copying all....")
        int i = 0
        AirportTmp.list().each {
            Airport airport = new Airport(
                    //_id: new ObjectId(),
                    airport_id: it._id,
                    ident: it.ident,
                    type: it.type,
                    name: it.name,
                    lattitude_deg: it.lattitude_deg,
                    longitude_deg: it.longitude_deg,
                    elevation_ft: it.elevation_ft,
                    continent: it.continent,
                    iso_region: it.iso_region,
                    municipality: it.municipality,
                    scheduled_service: it.scheduled_service,
                    gps_code: it.gps_code,
                    iata_code: it.iata_code,
                    local_code: it.local_code,
                    home_link: it.home_link,
                    wikipedia_link: it.wikipedia_link,
                    keywords: it.keywords)
            //Thread.sleep(10L)
            airport.save(flush: true, failOnError: true)
            i++
        }
        log.info("done ${i}....")
    }*/
}
