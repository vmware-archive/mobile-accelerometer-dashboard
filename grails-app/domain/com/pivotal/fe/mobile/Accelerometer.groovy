
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
	

}
