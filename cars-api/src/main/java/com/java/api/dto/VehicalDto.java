package com.java.api.dto;

public class VehicalDto {

	int vehicalId;
	String VehicalModel;
	int fuelCapacity;
	
	public VehicalDto(int vehicalId, String vehicalModel, int fuelCapacity) {
		super();
		this.vehicalId = vehicalId;
		VehicalModel = vehicalModel;
		this.fuelCapacity = fuelCapacity;
	}
	
	public VehicalDto() {
	
	}
	
	public int getVehicalId() {
		return vehicalId;
	}
	
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	
	public String getVehicalModel() {
		return VehicalModel;
	}
	
	public void setVehicalModel(String vehicalModel) {
		VehicalModel = vehicalModel;
	}
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	
	
	
	
}
