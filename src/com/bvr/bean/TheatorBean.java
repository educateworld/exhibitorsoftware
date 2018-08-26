package com.bvr.bean;

import java.io.Serializable;
/**
 * TheatorBean is a bean class which contains the fields theatorId, centerId,theatorName,showTax,batta,rent,slab,ownerName and contactNumber. 
 * in this we implements Serializable interface , it is used for storing the state of an object at a particular instance of time.
 * 
 * @author Harika
 *
 */
public class TheatorBean implements Serializable{
	int theatorId;
	String stateName;
	String districtName;
	String theatorName;
	Float showTax;
	Float batta;
	Float rent;
	Float slab;
	String ownerName;
	String contactNumber;
	Float exhibitorShare;
	Float distributorShare;
	String centerName;
	int housefulCapacity;
	Float theatreRent;
	Float distributorRent;
	Float inr;
	Float mc;
	String theatreDescription;
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getTheatreDescription() {
		return theatreDescription;
	}
	public void setTheatreDescription(String theatreDescription) {
		this.theatreDescription = theatreDescription;
	}
	public int getHousefulCapacity() {
		return housefulCapacity;
	}
	public void setHousefulCapacity(int housefulCapacity) {
		this.housefulCapacity = housefulCapacity;
	}
	public Float getTheatreRent() {
		return theatreRent;
	}
	public void setTheatreRent(Float theatreRent) {
		this.theatreRent = theatreRent;
	}
	public Float getDistributorRent() {
		return distributorRent;
	}
	public void setDistributorRent(Float distributorRent) {
		this.distributorRent = distributorRent;
	}
	public Float getInr() {
		return inr;
	}
	public void setInr(Float inr) {
		this.inr = inr;
	}
	public Float getMc() {
		return mc;
	}
	public void setMc(Float mc) {
		this.mc = mc;
	}
	public int getTheatorId() {
		return theatorId;
	}
	public void setTheatorId(int theatorId) {
		this.theatorId = theatorId;
	}
	public String getTheatorName() {
		return theatorName;
	}
	public void setTheatorName(String theatorName) {
		this.theatorName = theatorName;
	}
	public Float getShowTax() {
		return showTax;
	}
	public void setShowTax(Float showTax) {
		this.showTax = showTax;
	}
	public Float getBatta() {
		return batta;
	}
	public void setBatta(Float batta) {
		this.batta = batta;
	}
	public Float getRent() {
		return rent;
	}
	public void setRent(Float rent) {
		this.rent = rent;
	}
	public Float getSlab() {
		return slab;
	}
	public void setSlab(Float slab) {
		this.slab = slab;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Float getExhibitorShare() {
		return exhibitorShare;
	}
	public void setExhibitorShare(Float exhibitorShare) {
		this.exhibitorShare = exhibitorShare;
	}
	public Float getDistributorShare() {
		return distributorShare;
	}
	public void setDistributorShare(Float distributorShare) {
		this.distributorShare = distributorShare;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

}
