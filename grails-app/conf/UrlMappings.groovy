class UrlMappings {

	static mappings = {
		"/api/acceleratorMovements"(resources: "accelerometerRest")
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
