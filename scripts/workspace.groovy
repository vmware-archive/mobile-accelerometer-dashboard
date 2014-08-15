import groovy.json.JsonSlurper
import com.pivotal.fe.mobile.Accelerometer

def movements = new File('/Users/wlund/git-workspace/wxlund/mobile-accelerometer-dashboard/grails-app/data/singlenode.json')
movements.eachLine() { line ->
   def move = new JsonSlurper().parseText(line)
   println move
   def accelerometer = new Accelerometer(activity: move.activity, alt: move.alt, device: move.device, diffX: move.diffX,
             diffY: move.diffY, diffZ: move.diffZ, lat: move.lat, lon: move.lon, time: move.time, xcoord: move.xcoord, ycoord: move.ycoord, zcoord: move.zcoord)
   println accelerometer
   }

def a = Accelerometer.createCriteria()

def results = a.list {
	projections {
		sqlProjection 'activity as activity, avg(diffX) as diffX, avg(diffY) as diffY, avg(diffZ) as diffZ',
			['activity', 'diffX', 'diffY', 'diffZ'], [STRING, INTEGER, INTEGER, INTEGER]
	}
}
println results

