package com.bvr.insertbean;

import java.io.Serializable;
/**
 * InsertDistrictBean is a bean class which contains the fields stateId and districtName. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */
public class InsertDistrictBean implements Serializable{
	int stateId;
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	String stateName;
	String districtName;
	public InsertDistrictBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * stateId is the field which is used for inserting stateId and stored it in the database.
	 * @return
	 */
	
	/**
	 * districtName is the field which is used for inserting districtName and stored it in the database.
	 * @return
	 */
	public String getDistrictName() {
		return districtName;
	}
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	

}
