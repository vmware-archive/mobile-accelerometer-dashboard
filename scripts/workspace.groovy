import groovy.json.JsonSlurper
import grails.converters.JSON
import groovy.sql.Sql

def db = [url:'jdbc:sqlfire://pivhdsne:1527/', user:'APP', password:'APP', driver:'com.vmware.sqlfire.jdbc.ClientDriver']
def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

// import com.pivotal.fe.mobile.Accelerometer
/*
** Read a json file and parse
def movements = new File('/Users/wlund/git-workspace/wxlund/mobile-accelerometer-dashboard/grails-app/data/singlenode.json')
movements.eachLine() { line ->
   def move = new JsonSlurper().parseText(line)
   println move
   def accelerometer = new Accelerometer(activity: move.activity, alt: move.alt, device: move.device, diffX: move.diffX,
             diffY: move.diffY, diffZ: move.diffZ, lat: move.lat, lon: move.lon, time: move.time, xcoord: move.xcoord, ycoord: move.ycoord, zcoord: move.zcoord)
   println accelerometer
   }
*/
/*
** Read a csv file and populate the database
*/
def urlString = "http://localhost:8080/mobile-accelerometer-dashboard/api/acceleratorMovements"
def records = new File('/Users/wlund/git-workspace/wxlund//mobile-accelerometer-dashboard/src/sql/accelerator.sql')

def url = new URL(urlString)
def connection = url.openConnection()
connection.setRequestMethod("POST")
connection.setRequestProperty("Content-Type", "application/json")
connection.doOutput = true
def writer = new OutputStreamWriter(connection.outputStream)
records.eachLine() { record ->
    def text = record.split(",")
    def accelerometer = new Accelerometer(activity: text[0], alt: text[1], device: text[2], 
			 diffX: text[3], diffY: text[4], diffZ: text[5], lat: text[6], lon: text[7], 
			 time: text[8], xcoord: text[9], ycoord: text[10], zcoord: text[11])
 //  def payload =  accelerometer as JSON
   println "$accelerometer.activity     |     $accelerometer.diffX  |   $accelerometer.diffY     |  $accelerometer.diffZ"
   def sqlStr = "insert into ACCELEROMETER (activity, alt, device, diffX, diffY, diffZ, lat, lon, time, xcoord, ycoord, zcoord) values ($accelerometer.activity, $accelerometer.alt, $accelerometer.device, $accelerometer.diffX, $accelerometer.diffY,  $accelerometer.diffZ, $accelerometer.lat, $accelerometer.lon, $accelerometer.time, $accelerometer.xcoord, $accelerometer.ycoord, $accelerometer.zcoord)"
   println sqlStr
   sql.execute sqlStr
/*
   def payload = accelerometer as JSON
   println payload
    
//    def payload = accelerometer '{"device":"iphone","time":89107.7689075768,"activity":"Running","lat":37.714542,"lon":-121.867378,"alt":132.395721,"diffX":13.806152,"diffY":18.479919,"diffZ":83.297729,"xcoord":-0.09487915,"ycoord":-0.312393,"zcoord":-0.606064}'
//def payload = '{"device":"iPad","time":303200.44781484455,"activity":"Running","lat":37.709358, "lon":-121.868416,"alt":126.682396,"diffX":3.225708,"diffY":0.85907, "diffZ":6.219482,"xcoord":0.301178,"ycoord":-0.48645,"zcoord":-0.846161}'

    writer.write( payload )
//println(connection.content.text)
    println(payload)
    println connection.responseCode

    if(connection.responseCode == 201)
       println("IT WORKS!")
    else
       println("SOMETHINGS WRONG")

    println connection.responseCode        
*/    
} 
/*   
writer.flush()
writer.close()
connection.close()
*/


