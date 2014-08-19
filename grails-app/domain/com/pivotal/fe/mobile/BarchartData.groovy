package com.pivotal.fe.mobile

class BarchartData {
	Double avgDiffX
	Double avgDiffY
	Double avgDiffZ

	static mapping = {
		table 'BarchartData'
		id column: 'activity', generator: 'assigned', insertable: false, updateable: false
		avgDiffX column: 'AVGDIFFX', insertable: false, updateable: false
		avgDiffY column: 'AVGDIFFY', insertable: false, updateable: false
		avgDiffZ column: 'AVGDIFFZ', insertable: false, updateable: false
		version false
/*
		avgDiffX formula: "avg(diffX)"
		avgDiffY formula: "avg(diffY)"
		avgDiffZ formula: "avg(diffZ)"
*/		
		
	}

    static constraints = {
    }
}
