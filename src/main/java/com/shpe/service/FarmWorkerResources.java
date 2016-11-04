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

import java.util.ArrayList;

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
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		FarmWorkerHelper.makeWorkers();
		return this.returnJSONResponse(FarmWorkerHelper.WorkersList);
	}

	@GET
	@Path("/status/{name}/{action}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFarmworkerStatus(@PathParam("name") String name, @PathParam("action") String action) {
		ArrayList<FarmWorker> trabajadores;
		if (FarmWorkerHelper.WorkersList.isEmpty()) {
			trabajadores = FarmWorkerHelper.makeWorkers();
		} else {
			trabajadores = FarmWorkerHelper.WorkersList;
		}
		FarmWorker theWorker = null;
		for (FarmWorker worker : trabajadores) {
			if (worker.nameWorker.equals(name)) {
				theWorker = worker;
				break;
			}
		}
		if (action.equals("break")) {
			theWorker.setBreakStatus(FarmWorker.Status.ON_TRACK);
		}
		if (action.equals("bathroom")) {
			theWorker.setBathroomStatus(FarmWorker.Status.ON_TRACK);
		}
		if (action.equals("water")) {
			theWorker.setWaterStatus(FarmWorker.Status.ON_TRACK);
		}
		return this.returnJSONResponse(theWorker);
	}

	
}