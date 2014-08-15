@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7' )
@GrabExclude('commons-lang:commons-lang')

import groovyx.net.http.*
import static groovyx.net.http.ContentType.JSON
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC


RESTClient client = new RESTClient('http://localhost:8080/', ContentType.JSON)

def response = client.get(path: 'mobile-accelerometer-dashboard/api/accelerometerMovements/1.json')
response.status == 200
response.contentType == 'application/json'
response.data.size() == 590

/*
def http = new HTTPBuilder( 'http://localhost:8080/')
http.request(GET, JSON) {
    url.path = 'mobile-accelerometer-dashboard/api/accelerometerMovements' 
    
    response.success = { resp, json ->
        println resp.status
        println resp.getContentType()
        println json
        println "The current activity is: ${json.accelerometerRest.activity[0]}"

    }
}

def httpPost = new HTTPBuilder( 'http://localhost:8080/' )
println httpPost

def postBody = [id: 591, activity:"Wayne's Test", alt:"126.682396", device:"iPad", diffX:3.225708, diffY:0.85907, diffZ:6.219482, lat:"37.709358", lon:"-121.868416", time:"303200.44781484455", xcoord:"0.301178", ycoord:"-0.48645", zcoord:"-0.846161"]
println postBody
httpPost.post(path:'mobile-accelerometer-dashboard/api/acceleratorMovements.json', body: postBody, requestContentType: URLENC) { resp ->
    println "POST Success ${resp.status}"
    assert resp.statusLine.statusCode == 201
}
*/