package com.java.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.java.api.dto.VehicalDto;
import com.java.api.dto.VehicalLocationDto;
import com.java.api.entity.Vehicals;


@Mapper(componentModel = "spring")
public interface VehicalMapper{
 
	Vehicals toVehicals(VehicalDto vehicalDto);
	
	VehicalDto toVehicalDto(Vehicals vehicals);
	
	@Mapping(target="locationId", expression = "java(locations.getLocationId())")
	@Mapping(target="locationName", expression = "java(locations.getLocationName())")
	VehicalLocationDto toVehicalLocationDto(Vehicals vehicals);
	
	  
}
