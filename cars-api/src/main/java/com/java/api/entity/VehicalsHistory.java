package com.java.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;

@Entity
public class VehicalsHistory {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int vehicalHistoryId; 
	
//	@Column(name="vehical_id")
	private int vehicalId;
	
//	@Column(name="field_name")
	private String fieldName;
	
//	@Column(name="old_value")
	private String oldValue;
	
//	@Column(name="new_value")
	private String newValue;
	
	public VehicalsHistory() {
		
	}
	

	public VehicalsHistory(int vehicalHistoryId, int vehicalId, String fieldName, String oldValue, String newValue) {
		super();
		this.vehicalHistoryId = vehicalHistoryId;
		this.vehicalId = vehicalId;
		this.fieldName = fieldName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}


	public int getVehicalHistoryId() {
		return vehicalHistoryId;
	}

	public void setVehicalHistoryId(int vehicalHistoryId) {
		this.vehicalHistoryId = vehicalHistoryId;
	}

	public int getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	
	
	
	
	
}

