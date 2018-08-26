package com.bvr.bean;

import java.io.Serializable;

/**
 * DistrictBean is a bean class which contains the fields districtId, stateId and districtName. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */
public class DistrictBean implements Serializable{
	int districtId;
	int stateId;
	String districtName;
	String stateName;
	public DistrictBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * districtId is the field which is auto increment by inserting stateId and districtName field.
	 * @return
	 */
	
	public int getDistrictId() {
		return districtId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	/**
	 * stateId is the field which is used for inserting stateId and stored it in the database.
	 * @return
	 */
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	/**
	 * districtName is the field which is used for inserting districtName and stored it in the database.
	 * @return
	 */
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	

}
