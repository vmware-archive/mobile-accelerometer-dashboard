
import org.grails.datastore.mapping.query.Projections
import org.hibernate.Hibernate
import org.hibernate.type.Type

// @Resource(uri="/accelerometer", formats=['json'])
class Accelerometer {
		long id
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
		
		static mapping = {
			table 'accelerometer'
			id generator: 'identity'
/*
			avgDiffX formula: "avg(diffX)"
			avgDiffY formula: "avg(diffY)"
			avgDiffZ formula: "avg(diffZ)"
*/			
		}

    static constraints = {
    }
	
	def barchartProjection () {
/*		
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
*/		
	}
}
