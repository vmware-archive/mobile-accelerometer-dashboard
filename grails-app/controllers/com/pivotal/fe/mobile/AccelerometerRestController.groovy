package com.pivotal.fe.mobile

import grails.converters.JSON
import grails.rest.RestfulController
import org.hibernate.type.StandardBasicTypes

import javax.print.DocFlavor.STRING


class AccelerometerRestController extends RestfulController{
	static responseFormats = ["json"]
	
	AccelerometerRestController() {
		super (Accelerometer)
	}

	def activityAcceleration () {
		def a = Accelerometer.withCriteria {
		
			projections {
				groupProperty('activity')
				avg('avgDiffX')
				avg('avgDiffY')
				avg('avgDiffZ')
			}
		}
		respond a as JSON
	}

	def barchartDataProjection() {
		def results = accelerometerInstance.barchartProjection
		respond results as JSON
	}
}				

