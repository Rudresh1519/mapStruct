package com.java.api.dto;

public class VehicalLocationDto {

	int vehicalId;
	String vehicalModel;
	int locationId;
	String locationName;
	
	public VehicalLocationDto(int vehicalId, String vehicalModel, int locationId, String locationName) {
		super();
		this.vehicalId = vehicalId;
		this.vehicalModel = vehicalModel;
		this.locationId = locationId;
		this.locationName = locationName;
	}
	
	public VehicalLocationDto() {
	
	}

	public int getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}

	public String getVehicalModel() {
		return vehicalModel;
	}

	public void setVehicalModel(String vehicalModel) {
		this.vehicalModel = vehicalModel;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
	
	
	
}
