package com.bvr.bean;

import java.io.Serializable;
/**
 * @author Ramita
 * This is the Bean class of Term Table
 * we are using Serializable Interface
 */

public class TermBean  implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * @variables in Term Table
	 */
	int termId;
	String termname;
	public String getTermname() {
		return termname;
	}
	public void setTermname(String termname) {
		this.termname = termname;
	}
	int percentage;
	int marginProfit;
	int advance;

	/**
	 * 
	 * @Generating Getters and Setters
	 * @category Getters is only for read the value
	 * @category Setters is only for setting the value 
	 */
	public int getTermId() {
		return termId;
	}
	public void setTermId(int termId) {
		this.termId = termId;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getMarginProfit() {
		return marginProfit;
	}
	public void setMarginProfit(int marginProfit) {
		this.marginProfit = marginProfit;
	}
	public int getAdvance() {
		return advance;
	}
	public void setAdvance(int advance) {
		this.advance = advance;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
}
