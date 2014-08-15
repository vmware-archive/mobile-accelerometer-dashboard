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
	var debug = 100;
	var data2 = [ { "label": "Denver Movement x:", "n": 20 }, { "label": "Denver Movement y:", "n": 30 }, { "label": "San Francisco Movment x:", "n": 10 }, { "label": "San Francisco Movement y:", "n": 15 } ];
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

	function getHistoricalUpdate(){
		 var displayUrl = "http://localhost:8080/mobile-accelerometer-dashboard/api/axisValues/";
		 console.log("callback start.");
		 console.log("displayUrl = " + displayUrl);
		 request=new XMLHttpRequest(); request.onreadystatechange=getHistoricalUpdateCallBack;
		 request.open('GET',displayUrl,true); request.send();
		};
		function getHistoricalUpdateCallBack(){
		 if(request.readyState == 4){
		 console.log("callback back." + request.responseText);
		 var responseTxt=JSON.parse(request.responseText);
		 data = responseTxt;
		 barchart('barchart1', data);
		 }
		 console.log("callback end.");
		} 
		
	
	function debugUpdate() {
		debug += 1;
		data[0]["rate"] = debug;
		data[1]["rate"] = debug + 1;
		data[2]["rate"] = debug + 2;
		updateGauges();
	};
	function barchart(id, data) 
	{
		
		var w = 500,
		    h = 100;

	        h = 25 + (25 * data.length);

	        d3.select("#" + id).select("svg").remove();

		var svg = d3.select("#" + id)
			.append("svg")
			.attr("width", w)
			.attr("height", h);
		
		var max_n = 0;
		for (var d in data) {
			max_n = Math.max(data[d].n, max_n);
		}
			
		var dx = w / max_n;
		var dy = h / data.length;
		
		var bars = svg.selectAll(".bar")
			.data(data)
			.enter()
			.append("rect")
			.attr("class", function(d, i) {return "bar " + d.label;})
			.attr("x", function(d, i) {return 0;})
			.attr("y", function(d, i) {return dy*i;})
			.attr("width", function(d, i) {return dx*d.n})
			.attr("height", dy);

		var text = svg.selectAll("text")
			.data(data)
			.enter()
			.append("text")
			.attr("class", function(d, i) {return "label " + d.label;})
			.attr("x", 5)
			.attr("y", function(d, i) {return dy*i + 15;})
			.text( function(d) {return d.label + " (" + d.n  + ")";})
			.attr("font-size", "10px")
			.style("font-weight", "bold");
	};

		
</script>
</head>

<body>

	<table>
	<tr>
		<td>
		<div id='barchart1' />
		</td>
	<tr>
		<td>
		<div id='gauges' class='container' />
		</td>
		</tr>

	</table>
	<script>
		setInterval(getUpdate, 1000);
		createGauges('gauges');
		setInterval(getHistoricalUpdate, 2000)
		barchart('barchart1', data2)
	</script>

</body>

</html>