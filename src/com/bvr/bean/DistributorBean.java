package com.bvr.bean;

import java.io.Serializable;

/**
 * @author Ramita
 * This is the Bean class of Term Table
 * we are using Serializable Interface
 */
public class DistributorBean implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * @variables in Distributor Table
	 */
	int distributorId;
	String distributorName;
	String mobileNumber;
	String address;
	/**
	 * Default constructor
	 */
	public DistributorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @Generating Getters and Setters
	 * @category Getters is only for read the value
	 * @category Setters is only for setting the value 
	 */
	public int getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
