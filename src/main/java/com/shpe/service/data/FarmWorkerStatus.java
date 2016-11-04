package com.shpe.service.data;

public class FarmWorkerStatus {

	public enum Status {ON_TRACK, OFF_TRACK};
	
	private Status breakStatus;
	private Status waterStatus;
	private Status bathroomStatus;
	
	public Status getBreakStatus() {
		return breakStatus;
	}
	public void setBreakStatus(Status breakStatus) {
		this.breakStatus = breakStatus;
	}
	public Status getWaterStatus() {
		return waterStatus;
	}
	public void setWaterStatus(Status waterStatus) {
		this.waterStatus = waterStatus;
	}
	public Status getBathroomStatus() {
		return bathroomStatus;
	}
	public void setBathroomStatus(Status bathroomStatus) {
		this.bathroomStatus = bathroomStatus;
	}
	
	
	
}
