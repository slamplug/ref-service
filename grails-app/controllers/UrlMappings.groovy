class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/airport/iata/$airportCode"(controller:"ref", action: "lookupAirport", method: "GET")

        "/airport"(controller: "ref",
                action: "saveAirport",
                method: "POST")

        "/"(controller: 'index')
        "500"(controller: 'InternalServerError')
        "404"(controller: 'NotFound')
    }
}
