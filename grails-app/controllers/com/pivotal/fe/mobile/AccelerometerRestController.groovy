package com.pivotal.fe.mobile

import grails.rest.RestfulController

import org.grails.datastore.mapping.query.Projections
import org.hibernate.Hibernate
import com.pivotal.fe.mobile.Accelerometer

class AccelerometerRestController extends RestfulController{
	static responseFormats = ["json"]
	
	AccelerometerRestController() {
		super (Accelerometer)
	}

	def activityAcceleration () {
/*
				def a = Accelerometer.withCriteria {
		
			projections {
				groupProperty('activity')
				avg('avgDiffX')
				avg('avgDiffY')
				avg('avgDiffZ')
			}
		}
		respond a as JSON
*/	
	}

	def barchartProjection () {
		
		def results = criteria {
			projections {
				addProjectionToList(Projections.sqlGroupProjection(
				"activity as activity, avg(diffX) as AvgDiffX, avg(diffY) as AvgDiffY, avg(diffZ) as AvgDiffZ",
					["activity", "AvgDiffX", "AvgDiffY", "AvgDiffZ"].toArray(new String[4]),
					[Hibernate.STRING, Hibernate.DOUBLE, Hibernate.DOUBLE, hibernate.DOUBLE].toArray(new Type[4])),
					'barchartDataProjection'
				)
			}
	   }
		return results
	}

}				

