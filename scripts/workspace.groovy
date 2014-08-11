import groovy.json.JsonSlurper
import com.pivotal.fe.mobile.Accelerometer

def movements = new File('/Users/wlund/git-workspace/wxlund/mobile-accelerometer-dashboard/web-app/WEB-INF/singlenode.json')
movements.eachLine() { line ->
   def move = new JsonSlurper().parseText(line)
   println move
   def accelerometer = new Accelerometer(activity: move.activity, alt: move.alt, device: move.device, diffX: move.diffX,
             diffY: move.diffY, diffZ: move.diffZ, lat: move.lat, lon: move.lon, time: move.time, xcoord: move.xcoord, ycoord: move.ycoord, zcoord: move.zcoord)
   println accelerometer
   }
