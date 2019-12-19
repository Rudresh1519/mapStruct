package com.java.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.java.api.entity.VehicalsHistory;

public interface VehicalsHistoryRepository extends JpaRepository<VehicalsHistory, Integer>{

//	@Query(value = "SELECT v.field_name,v.old_value,v.new_value FROM vehicals_history v WHERE v.vehical_id = :vehicalId",nativeQuery = true)
	
	
	List<VehicalsHistory> findByVehicalId(int vehicalId);
	
	//List<VehicalsHistory> findByFieldName(String fieldName);
	
}
