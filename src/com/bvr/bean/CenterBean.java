package com.bvr.bean;

import java.io.Serializable;
/**
 * CenterBean is a bean class which contains the fields centerId, districtId and centerName. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */

public class CenterBean implements Serializable{
	int centerId;
	int districtId;
	String districtName;
	String centerName;
	public CenterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * centerId is the field which is auto increment by inserting districtId and centerName field.
	 * @return
	 */
	
	public int getCenterId() {
		return centerId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	/**
	 * districtId is the field which is used for inserting districtId and stored it in the database.
	 * @return
	 */
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
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
