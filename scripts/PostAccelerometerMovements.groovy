@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7' )
@GrabExclude('commons-lang:commons-lang')

import groovyx.net.http.*
import static groovyx.net.http.ContentType.JSON
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC

def http = new HTTPBuilder( 'http://localhost:8080' )

http.request(GET, JSON) {
    url.path = '/mobile-accelerometer-dashboard/api/accelerometerMovements' 
    
    response.success = { resp, json ->
        println resp.status
        println resp.getContentType()
        println json
        println "The current activity is: ${json.accelerometerRest.activity[0]}"

    }
}

/*

def httpPost = new HTTPBuilder( 'http://localhost:8080/mobile-accelerometer-dashboard/api/accelerometerMovements' )
println httpPost

def postBody = [activity:"Wayne's Test", alt:"126.682396", device:"iPad", diffX:"3.225708", diffY:"0.85907", diffZ:"6.219482", lat:"37.709358", lon:"-121.868416", time:"303200.44781484455", xcoord:"0.301178", ycoord:"-0.48645", zcoord:"-0.846161"]
httpPost.post(path:'/', body: postBody, requestContentType: URLENC) { resp ->
    println "POST Success ${response.statusLine}"
    assert resp.statusLine.statusCode == 201
}
*/