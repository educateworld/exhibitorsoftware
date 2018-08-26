package com.bvr.insertbean;

import java.io.Serializable;
/**
 * InsertCenterBean is a bean class which contains the fields  districtId and districtName. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */

public class InsertCenterBean implements Serializable{
	String districtId;
	String districtName;
	String centerName;
	public InsertCenterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * districtId is the field which is used for inserting districtId and stored it in the database.
	 * @return
	 */
	
	public String getDistrictId() {
		return districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	/**
	 * centerName is the field which is used for inserting centerName and stored it in the database.
	 * @return
	 */
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
}
