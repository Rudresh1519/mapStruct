package com.java.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.entity.Vehicals;
import com.java.api.entity.VehicalsHistory;
import com.java.api.service.VehicalsHistoryService;

@RestController
@RequestMapping("/vehical/vehicalhistory")
public class VehicalHistoryController {

	@Autowired
	private VehicalsHistoryService vehicalhistoryservice;
	
	@RequestMapping("/")
	public List<VehicalsHistory> getAllVehicalHistory(){
		
		return vehicalhistoryservice.getAllVehicalHistory();
	}
	
	@RequestMapping("/{vehicalId}")
	public List<VehicalsHistory> getVehicalHistory(@PathVariable int vehicalId) {
		
		return vehicalhistoryservice.getVehicalHistory(vehicalId);
	}
	
/*	@RequestMapping("/{fieldName}")
	public List<VehicalsHistory> getVehicalHistory(@PathVariable String fieldName) {
		
		return vehicalhistoryservice.getVehicalHistory(fieldName);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/")
	public void addVehicalHistory(@RequestBody VehicalsHistory vehicalshistory )
	{
		vehicalhistoryservice.addVehicalHistory(vehicalshistory);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,value = "/{vehical_id}")
	public void updateVehicalHistory(@RequestBody VehicalsHistory vehicalhistory,@PathVariable int vehical_id)
	{
		vehicalhistoryservice.updateVehicalHistory(vehical_id, vehicalhistory);
	}
	
	@RequestMapping(method = RequestMethod.DELETE ,value = "/{vehical_id}")
	public void deleteVehicalHistory(@PathVariable int vehical_id)
	{
		vehicalhistoryservice.deleteVehicalHistory(vehical_id);
	}*/
}
