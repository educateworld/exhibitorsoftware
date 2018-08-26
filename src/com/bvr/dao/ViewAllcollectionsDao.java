package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CollectionBean;
import com.bvr.bean.MoviesBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewAllcollectionsDao {

	public List  viewAllusers() {
		// TODO Auto-generated method stub
		 List movies = new ArrayList();
	        try {
	                String sql = "SELECT * FROM collection";
	                Connection conn=ConnectionProvider.getConnection();
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	CollectionBean collectionBean = new CollectionBean();
	            	collectionBean.setCollectionId(rs.getInt("collectionId"));
	            	collectionBean.setTname(rs.getString("tname"));
	            	collectionBean.setCname(rs.getString("cname"));
	            	collectionBean.setMname(rs.getString("mname"));
	            	collectionBean.setDa(rs.getString("da"));
	            	collectionBean.setTotaldays(rs.getInt("totaldays"));
	            	collectionBean.setTodayaudiance(rs.getInt("todayaudiance"));
	            	collectionBean.setTotalaudiance(rs.getInt("totalaudiance"));
	            	collectionBean.setTodaygross(rs.getFloat("todaygross"));
	            	collectionBean.setTotalgross(rs.getFloat("totalgross"));
	            	collectionBean.setTodaynet(rs.getFloat("todaynet"));
	            	collectionBean.setTotalnet(rs.getFloat("totalnet"));
	            	collectionBean.setTodayshows(rs.getFloat("todayshows"));
	            	collectionBean.setTotalshows(rs.getFloat("totalshows"));
	            	collectionBean.setTodayexhibitorshare(rs.getFloat("todayexhibitorshare"));
	            	collectionBean.setTotalexhibitorshare(rs.getFloat("totalexhibitorshare"));
	            	collectionBean.setTodaydistributorshare(rs.getFloat("todaydistributorshare"));
	            	collectionBean.setTotaldistributorshare(rs.getFloat("totaldistributorshare"));
	            	collectionBean.setCollectionmorning(rs.getFloat("collectionmorning"));
	            	collectionBean.setCollectionmatinee(rs.getFloat("collectionmatinee"));
	            	collectionBean.setCollectionfirst(rs.getFloat("collectionfirst"));
	            	collectionBean.setCollectionsecond(rs.getFloat("collectionsecond"));
	            	collectionBean.setCollectionbenifit(rs.getFloat("collectionbenifit"));
	            	collectionBean.setCollectiospecial(rs.getFloat("collectionspecial"));
	            	collectionBean.setAudiencemorning(rs.getInt("audiencemorning"));
	            	collectionBean.setAudiencematinee(rs.getInt("audiencematinee"));
	            	collectionBean.setAudiencefirst(rs.getInt("audiencefirst"));
	            	collectionBean.setAudiencesecond(rs.getInt("audiencesecond"));
	            	collectionBean.setAudiencebenifit(rs.getInt("audiencebenifit"));
	            	collectionBean.setAudiencespecial(rs.getInt("audiencespecial"));
	            	collectionBean.setSlab(rs.getFloat("slab"));
	            	collectionBean.setShowTax(rs.getFloat("showTax"));
	            	collectionBean.setBatta(rs.getFloat("batta"));
	            	collectionBean.setOd(rs.getFloat("od"));
	            	collectionBean.setMc(rs.getFloat("mc"));
	            	collectionBean.setTheatorid(rs.getInt("theatorid"));
	            	collectionBean.setStartingdate(rs.getString("startingdate"));
	            	double sum=rs.getFloat("collectionmorning")+rs.getFloat("collectionmatinee") +rs.getFloat("collectionfirst")+rs.getFloat("collectionsecond")+
	            	rs.getFloat("collectionbenifit")+rs.getFloat("collectionspecial");
	            	System.out.println("toatl"+sum);
	            	collectionBean.setEndingdate(rs.getString("endingdate"));
	            	collectionBean.setTermname(rs.getString("termname"));
	            	collectionBean.setTermtype(rs.getString("termtype"));
	            	collectionBean.setAmount(rs.getLong("amount"));
	            	collectionBean.setNarration(rs.getString("narration"));
	            	collectionBean.setExhibitorshare(rs.getFloat("exhibitorshare"));
	            	collectionBean.setDistributorshare(rs.getFloat("distributorshare"));
	                movies.add(collectionBean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return movies;
	    }
	}