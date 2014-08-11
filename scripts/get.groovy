import groovy.json.JsonSlurper

def test = new JsonSlurper().parseText( payload )
String parms = "&xdiff=" + test.diffX + "&ydiff=" + test.diffY + "&zdiff=" + test.diffZ 
println parms
// url = ("http://pcfagent.10.244.0.34.xip.io/pcfagent/?uapp=patientportal" + parms ).toURL().getText()

