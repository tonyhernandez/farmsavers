package com.shpe.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.shpe.service.data.FarmWorkerStatus;
import com.shpe.service.data.FarmWorkerStatus.Status;

@Path("/farmWorker")
public class FarmWorkerResources extends BaseResources {

	private static Logger LOG = Logger.getLogger(FarmWorkerResources.class);
	
	@GET
	@Path("{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFarmworker(@PathParam("name") String name) {
		return this.returnJSONResponse(name);
	}
	
	@GET
	@Path("/status/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFarmworkerStatus(@PathParam("name") String name) {
		FarmWorkerStatus status = new FarmWorkerStatus();
		status.setBathroomStatus(Status.OFF_TRACK);
		status.setBreakStatus(Status.ON_TRACK);
		status.setWaterStatus(Status.ON_TRACK);
		
		return this.returnJSONResponse(status);
	}
	
	
}
