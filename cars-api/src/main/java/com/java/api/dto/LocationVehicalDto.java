package com.java.api.dto;

import java.util.List;

public class LocationVehicalDto {

	int locationId;
	String locationName;
	String address;
	List<VehicalDto> vehicalDtoList;
	
	public LocationVehicalDto(int locationId, String locationName, String address, List<VehicalDto> vehicalDtoList) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.address = address;
		this.vehicalDtoList = vehicalDtoList;
	}
	
	public LocationVehicalDto() {
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<VehicalDto> getVehicalDtoList() {
		return vehicalDtoList;
	}

	public void setVehicalDtoList(List<VehicalDto> vehicalDtoList) {
		this.vehicalDtoList = vehicalDtoList;
	}

	
	
}
