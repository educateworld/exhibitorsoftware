package com.bvr.insertbean;

import java.io.Serializable;
/**
* @author Ramita
* This is the InsertBean class of Register Table
*/
public class InsertUserBean implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * @variables in Register Table
	 */
	private String random;
    private String userName;
    private String password;
	private String emailId;
	private String mobileNo;
    private String address;
    private String status;
    
    /**
	 * 
	 * @Generating Getters and Setters
	 * @category Getters is only for read the value
	 * @category Setters is only for setting the value 
	 */
	public String getRandom() {
		return random;
	}
	public void setRandom(String random) {
		this.random = random;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String string) {
		this.mobileNo = string;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
