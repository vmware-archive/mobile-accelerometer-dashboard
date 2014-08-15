package com.pivotal.fe.mobile

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import groovy.json.JsonSlurper
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AccelerometerRestController)
@Mock([Accelerometer])
class AccelerometerRestControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Get a list of Accelerometer Movements as JSON"() {
		given: "A set of movements"
		initializeAccelerometerMovements()
		
		when: "I invoke the index action "
		controller.index()
		
		then: "I get the expected movements as a JSON list"
		response.json*.content.sort() == []
    }
	
	void "Post a single movement as JSON"() {
		given: "A set of existing accelerator movement posts"
		initializeAccelerometerMovements()
		
		when: "I invoke the save action with a JSON packet"
		request.json = '{'  "device":"iphone","time":303200.44781484455,"activity":"Running","lat":37.709358, "lon":-121.868416,"alt":126.682396,"diffX":3.225708,"diffY":0.85907, "diffZ":6.219482,"xcoord":0.301178,"ycoord":-0.48645,"zcoord":-0.846161+'}'
        controller.save()
		
		then: "I get a 201 JSON response with the ID of the new post"
		response.status == 201
		response.json.id != null
    }
	
	void "Get Averages of DiffX, DiffY, DiffZ grouping by Activity"() {
		given: "A set of accelerator movements "
		initializeAccelerometerMovements()
		
		when: "I invoke the activityAcceleration method "
		controller.activityAcceleration()
		
		then: "I get the projection of averages of diffX/Y/Z grouped by Activity"
		response.json*.content.sort() == []
	}
	
	void "Test the barchart data projection"() {
		given: "A set of accelerator movements "
		initializeAccelerometerMovements()
		
		when: "I invoke the activityAcceleration method "
		def response = controller.barchartDataProjection()
		
		then: "I get the projection of averages of diffX/Y/Z grouped by Activity"
		response.json*.content.sort() == []
	}
	
	private initializeAccelerometerMovements() {
		def movements = new File('/Users/wlund/git-workspace/wxlund/mobile-accelerometer-dashboard/grails-app/data/singlenode.json')
		movements.eachLine() { line ->
		   def move = new JsonSlurper().parseText(line)
//		   println move
		   def accelerometer = new Accelerometer(activity: move.activity, alt: move.alt, device: move.device, diffX: move.diffX,
					 diffY: move.diffY, diffZ: move.diffZ, lat: move.lat, lon: move.lon, time: move.time, xcoord: move.xcoord, ycoord: move.ycoord, zcoord: move.zcoord).save()
//		   println accelerometer
		}
	}
}
