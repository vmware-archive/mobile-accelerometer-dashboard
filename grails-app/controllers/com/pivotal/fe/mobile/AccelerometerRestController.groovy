package com.pivotal.fe.mobile

import grails.rest.RestfulController


class AccelerometerRestController extends RestfulController{
	static responseFormats = ["json"]
	
	AccelerometerRestController() {
		super (Accelerometer)
	}
}
