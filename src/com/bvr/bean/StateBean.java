package com.bvr.bean;

import java.io.Serializable;
/**
 * StateBean is a bean class which contains the fields stateId and stateName. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */

public class StateBean implements Serializable{
	int stateId;
	String stateName;
	public StateBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * stateId is the field which is auto increment by inserting the stateName field.
	 * @return
	 */
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	/**
	 * stateName is used for inserting stateNames and stored it in the database.
	 * @return
	 */
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
