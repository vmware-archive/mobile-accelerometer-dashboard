import com.pivotal.fe.mobile.Accelerometer
import com.pivotal.fe.mobile.AxisValue

class BootStrap {

	def init = { servletContext ->
		def accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"3.225708", diffY:"0.85907", diffZ:"6.219482", lat:"37.709358", lon:"-121.868416", time:"303200.44781484455", xcoord:"0.301178", ycoord:"-0.48645", zcoord:"-0.846161").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"2.890015", diffY:"0.769043", diffZ:"2.676392", lat:"37.709358", lon:"-121.868416", time:"303202.0478148684", xcoord:"0.280045", ycoord:"-0.485901", zcoord:"-0.856491").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"2.42157", diffY:"0.769043", diffZ:"2.316284", lat:"37.709358", lon:"-121.868416", time:"303201.34781485796", xcoord:"0.284729", ycoord:"-0.487717", zcoord:"-0.85289").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"6.163025", diffY:"2.780151", diffZ:"6.219482", lat:"37.709358", lon:"-121.868416", time:"303199.9478148371", xcoord:"0.297668", ycoord:"-0.4841", zcoord:"-0.850235").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"6.163025", diffY:"2.780151", diffZ:"6.219482", lat:"37.709358", lon:"-121.868416", time:"303199.0478148237", xcoord:"0.329407", ycoord:"-0.481964", zcoord:"-0.895523").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"2.714539", diffY:"0.769043", diffZ:"2.418518", lat:"37.709358", lon:"-121.868416", time:"303201.7478148639", xcoord:"0.282455", ycoord:"-0.488007", zcoord:"-0.853912").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"2.192688", diffY:"0.769043", diffZ:"2.050781", lat:"37.709358", lon:"-121.868416", time:"303201.0478148535", xcoord:"0.287018", ycoord:"-0.482788", zcoord:"-0.829727").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"6.163025", diffY:"2.828979", diffZ:"6.219482", lat:"37.709358", lon:"-121.868416", time:"303200.24781484157", xcoord:"0.308945", ycoord:"-0.490479", zcoord:"-0.837311").save(flush:true)
		accelerometer = new Accelerometer(activity:"Running", alt:"126.682396", device:"iphone", diffX:"2.714539", diffY:"0.769043", diffZ:"2.316284", lat:"37.709358", lon:"-121.868416", time:"303201.54781486094", xcoord:"0.281799", ycoord:"-0.48764", zcoord:"-0.850266").save(flush:true)

		// req from Edison: [ { "label": "Denver Movement x:", "n": 20 }, { "label": "Denver Movement y:", "n": 30 }, 
		// { "label": "San Francisco Movment x:", "n": 10 }, { "label": "San Francisco Movement y:", "n": 15 } ];
				
		def geocode = new AxisValue(label:"Denver Movement x:", n:"20").save(flush:true)
		geocode = new AxisValue(label: "Denver Movement y:", n: 30 ).save(flush:true)
		geocode = new AxisValue(label: "San Francisco Movment x:", n:"10").save(flush:true)
		geocode = new AxisValue(label: "San Francisco Movment y:", n:"15").save(flush:true)
		
	}

	def destroy = {
	}
}
