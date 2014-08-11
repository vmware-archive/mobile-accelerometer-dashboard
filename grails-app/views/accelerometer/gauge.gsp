<!DOCTYPE html>
<html>
<head>
<!-- <script src="http://d3js.org/d3.v3.min.js" charset="utf-8"></script> 
<link rel='stylesheet' type='text/css' href='stylesheets/gauge.css' />
<script src='javascripts/d3.min.js'></script>
<script src='javascripts/gauge.js'></script>
 -->
<asset:stylesheet src="gauge.css"/>
<asset:javascript src="d3.min.js"/>
<asset:javascript src="gauge.js"/>

<script type='text/javascript'>
	var debug = 587;
	var data = [ {
		"metric" : "xdiff",
		"rate" : "0"
	}, {
		"metric" : "ydiff",
		"rate" : "0"
	}, {
		"metric" : "zdiff",
		"rate" : "0"
	} ];
	var url = "http://localhost:8080/mobile-accelerometer-dashboard/api/acceleratorMovements/";
	function getUpdate(){
	 var displayUrl = url + debug;
	 console.log("callback start.");
	 console.log("displayUrl = " + displayUrl);
	 request=new XMLHttpRequest(); request.onreadystatechange=getUpdateCallBack;
	 request.open('GET',displayUrl,true); request.send();
	};
	function getUpdateCallBack(){
	 if(request.readyState == 4){
	 console.log("callback back." + request.responseText);
	 var responseTxt=JSON.parse(request.responseText);debug+=1;
	 data[0]["rate"] = responseTxt["diffX"];
	 data[1]["rate"] = responseTxt["diffY"];
	 data[2]["rate"] = responseTxt["diffZ"];
	 updateGauges();
	 }
	 console.log("callback end.");
	 debug = debug + 1;	
	 if (debug > 600) {
		 debug = 1}
	} 
	
	
	function debugUpdate() {
		debug += 1;
		data[0]["rate"] = debug;
		data[1]["rate"] = debug + 1;
		data[2]["rate"] = debug + 2;
		updateGauges();
	};
</script>
</head>

<body>

	<div id='gauges' class='container' />

	<script>
		setInterval(getUpdate, 1000);
		createGauges('gauges');
	</script>

</body>

</html>