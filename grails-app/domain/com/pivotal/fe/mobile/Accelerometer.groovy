package com.pivotal.fe.mobile

import grails.rest.Resource

// @Resource(uri="/accelerometer", formats=['json'])
class Accelerometer {
		String activity
		String alt 
		String device 
		Double diffX 
		Double diffY 
		Double diffZ 
		String lat
		String lon
		String time 
		String xcoord 
		String ycoord
		String zcoord
		
    static constraints = {
    }
}
