package com.java.api.mapper;

import org.mapstruct.Mapper;

import com.java.api.dto.LocationVehicalDto;
import com.java.api.entity.Locations;

@Mapper(uses = VehicalMapper.class, componentModel = "spring")
public interface LocationMapper {

	LocationVehicalDto toLocationVehicalDto(Locations locations);
	
}
