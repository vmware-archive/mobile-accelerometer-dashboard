

def rest = new grails.plugins.rest.client.RestBuilder()


def response = rest.get('http://localhost:8080/mobile-accelerometer-dashboard/api/acceleratorMovements/')
assert response.status == 200
println response.status
def json = response.json
def jsonFile = new File("/Users/wlund/git-workspace/wxlund/mobile-accelerometer-dashboard/simulated-movements.json")
def writer = jsonFile.newWriter()
json.each() { movement ->
    println movement.activity
    writer.append(movement.toString() + "\n")
}
writer.close()


/*
def resp = rest.post("http://localhost:8080/mobile-accelerometer-dashboard/api/acceleratorMovements/") {
    contentType "application/json"
    json {
       diffX = "6.163025"
       activity = "Running"
       diffY = "2.780151"
       diffZ = "6.219482"
       alt = "126.682396"
       lon = "-121.868416"
       zcoord = "-0.850235"
       xcoord = "0.297668"
       time = "303199.9478148371"
       device = "imac"
       ycoord = "-0.4841"
       lat = "37.709358"
    }
}
*/