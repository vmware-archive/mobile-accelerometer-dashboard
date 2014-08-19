class UrlMappings {

	static mappings = {
		"/api/acceleratorMovements"(resources: "accelerometerRest")
		"/api/axisValues"(resources: "axisValueRest")
		"/api/barchartData"(resources: "barchartDataRest")
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
