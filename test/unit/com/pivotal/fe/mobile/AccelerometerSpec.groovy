package com.pivotal.fe.mobile

import grails.test.mixin.TestFor
import groovy.json.JsonSlurper
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Accelerometer)
class AccelerometerSpec extends Specification {

    def setup() {
		
    }

    def cleanup() {
    }

    void "test the barchart data projection"() {
		given: "A set of accelerator movements "
		initializeAccelerometerMovements()
		
		when: "I invoke the activityAcceleration method "
		def response = Accelerator.activityAcceleration()
		
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
