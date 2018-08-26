package com.bvr.insertbean;

import java.io.Serializable;

public class InsertMovieBean implements Serializable{
	/*int theatorId;
	public String getTheatorName() {
		return theatorName;
	}
	public void setTheatorName(String theatorName) {
		this.theatorName = theatorName;
	}*/
	//String theatorName;
	String movieName;
	public InsertMovieBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public int getTheatorId() {
		return theatorId;
	}
	public void setTheatorId(int theatorId) {
		this.theatorId = theatorId;
	}*/
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
}
