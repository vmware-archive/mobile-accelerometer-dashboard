package com.pivotal.fe.mobile

import grails.rest.RestfulController


class AxisValueRestController extends RestfulController{
	static responseFormats = ["json"]
	
	AxisValueRestController() {
		super (AxisValue)
	}

}
