package com.bvr.bean;

import java.io.Serializable;

public class MoviesBean implements Serializable{
	int movieId;
	//int theatorId;
	String movieName;
	//String theatorName;
	/*public String getTheatorName() {
		return theatorName;
	}
	public void setTheatorName(String theatorName) {
		this.theatorName = theatorName;
	}*/
	public MoviesBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
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
