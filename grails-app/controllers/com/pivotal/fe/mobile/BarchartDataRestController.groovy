package com.pivotal.fe.mobile

import grails.rest.RestfulController


class BarchartDataRestController<T> extends RestfulController{
	static responseFormats = ["json"]

	BarchartDataRestController() {
		super (BarchartData, true)
	}
/*	
	def barchartData() {
		def builder = new JsonBuilder()
			builder.data {
				activities (
				[{
				activity 'walking'
				diffX '10.41'
				diffY '4.05'
				diffX ' 9.94'
				},
				{
				activity 'running'
				diffX '59.45'
				diffY '16.84'
				diffX '50.34'
				}]
				)
		}
		respond builder.toString() as JSON
	}
*/	
}
