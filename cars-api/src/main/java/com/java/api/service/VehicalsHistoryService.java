package com.java.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.api.entity.Vehicals;
import com.java.api.entity.VehicalsHistory;
import com.java.api.repository.VehicalsHistoryRepository;

@Service
public class VehicalsHistoryService {
	
	@Autowired
	private VehicalsHistoryRepository vehicalshistoryrepository;

    public List<VehicalsHistory> getAllVehicalHistory() {
		
		return (List<VehicalsHistory>) vehicalshistoryrepository.findAll();
	}

	public List<VehicalsHistory> getVehicalHistory(int vehicalId) {
		
		return vehicalshistoryrepository.findByVehicalId( vehicalId);
	}
	
  /*  public List<VehicalsHistory> getVehicalHistory(String fieldName) {
 		
		return vehicalshistoryrepository.findByFieldName(fieldName);
	}
    
	public void addVehicalHistory(VehicalsHistory vehicalhistory) {
		
		vehicalshistoryrepository.save(vehicalhistory);
	}

	public void updateVehicalHistory(int vehical_id, VehicalsHistory vehicalhistory) {
		
		vehicalshistoryrepository.save(vehicalhistory);
	}

	public void deleteVehicalHistory(int vehical_id) {
		
		vehicalshistoryrepository.deleteById(vehical_id);
	}*/

	
}
