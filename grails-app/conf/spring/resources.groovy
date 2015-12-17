import com.fu.ref.ms.domain.Airport
import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.json.JsonRenderer

// Place your Spring DSL code here
beans = {
    airportRender(JsonRenderer, Airport) {
        excludes = ['class', 'id']
    }

    airportsRender(JsonCollectionRenderer, Airport) {
        excludes = ['class', 'id']
    }
}
