import groovy.json.JsonSlurper

def urlString = "http://localhost:8080/mobile-accelerometer-dashboard/api/acceleratorMovements"
def url = new URL(urlString)
def connection = url.openConnection()
connection.setRequestMethod("POST")
connection.setRequestProperty("Content-Type", "application/json")
connection.doOutput = true
def writer = new OutputStreamWriter(connection.outputStream)
// def payload = '{"device":"dell","time":303200.44781484455,"activity":"Running","lat":37.709358, "lon":-121.868416,"alt":126.682396,"diffX":3.225708,"diffY":0.85907, "diffZ":6.219482,"xcoord":0.301178,"ycoord":-0.48645,"zcoord":-0.846161}'

writer.write( payload )
writer.flush()
writer.close()
connection.connect()

//println(connection.content.text)
println(payload)

if(connection.responseCode == 201)
   println("IT WORKS!")
else
   println("SOMETHINGS WRONG")

return connection.responseCode 