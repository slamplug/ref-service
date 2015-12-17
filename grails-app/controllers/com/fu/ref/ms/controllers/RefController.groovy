package com.fu.ref.ms.controllers

import groovy.util.logging.Log4j

@Log4j
class RefController {

    def refService

    def index() { }

    def lookupAirport() {
        def airportCode = params.airportCode
        render(contentType: "application/json") {
            refService.findAirportByAirportCode(airportCode)
        }
    }

    /*def saveAirport() {
        refService.migrateAirport()

        render(contentType: "application/json") {
            [status: "200"]
        }
    }*/
}
