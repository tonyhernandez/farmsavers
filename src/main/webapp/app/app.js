

function createOverviewTable(data){
	
	var rowStart = '<tr><td><img src=';
	var rowEnd = 'height="42" width="42"/></td>';
	
	var html = '<table class="table">';
	
	// add water
	html += rowStart;
	html += getStatusColor(data.waterStatus);
	html += rowEnd;
	html += '<td><img src="images/water.png" height="42" width="42"/></td></tr>';
	
	// add lunch
	html += rowStart;
	html += getStatusColor(data.breakStatus);
	html += rowEnd;
	html += '<td><img src="images/lunch.png" height="42" width="42"/></td></tr>';
	
	// add bathroom
	html += rowStart;
	html += getStatusColor(data.bathroomStatus);
	html += rowEnd;
	html += '<td><img src="images/bathroom.png" height="42" width="42"/></td></tr>';
	
	html += '</table>';
	
	$(html).appendTo('#overview-table');
}

function getStatus() {
   
   $.get("http://localhost:8080/farmsavers/farmworkers/farmWorker/status/David/foo", function(response) {
	    var data = response;
        createOverviewTable(response);
   }).error(function(){
	   alert("error");
});
  
}

function getStatusColor(status){
	var statusColor;
	if(status == "ON_TRACK") {
		statusColor = '"images/green.png"';
	} else {
		statusColor = '"images/yellow.png"';
	}
	return statusColor;
}


function updateBreak(){
	
	   $.get("http://localhost:8080/farmsavers/farmworkers/farmWorker/status/David/break", function(response) {
	        data = response;
	     
	   }).error(function(){
	 
	});

}

function updateWater(){
	
	   $.get("http://localhost:8080/farmsavers/farmworkers/farmWorker/status/David/water", function(response) {
	        data = response;
	  
	   }).error(function(){
	 
	});

}

function updateBathroom(){
	
	   $.get("http://localhost:8080/farmsavers/farmworkers/farmWorker/status/David/bathroom", function(response) {
	        data = response;
	       
	   }).error(function(){
	 
	});

}

