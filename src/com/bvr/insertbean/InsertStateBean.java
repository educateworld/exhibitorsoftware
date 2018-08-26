package com.bvr.insertbean;

import java.io.Serializable;
/**
 * InsertStateBean is a bean class which contains the field stateName. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */

public class InsertStateBean implements Serializable{
	String stateName;

	public InsertStateBean() {
		super();
		// TODO Auto-generated constructor stub
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
