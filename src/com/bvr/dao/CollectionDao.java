package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.bean.CollectionBean;
import com.bvr.driverconnection.ConnectionProvider;

public class CollectionDao {

	public void collection(CollectionBean collectionBean) throws SQLException {
		try {
			Connection conn = ConnectionProvider.getConnection();
			String sql = "update collection set tname=?,cname=?,mname=?,da=?,totaldays=?,todayaudiance=?,totalaudiance=?,todaygross=?,totalgross=?,todaynet=?,totalnet=?,todayshows=?,totalshows=?,todayexhibitorshare=?,totalexhibitorshare=?,todaydistributorshare=?,totaldistributorshare=?,collectionmorning=?,collectionmatinee=?,collectionfirst=?,collectionsecond=?,collectionbenifit=?,collectionspecial=?,audiencemorning=?,audiencematinee=?,audiencefirst=?,audiencesecond=?,audiencebenifit=?,audiencespecial=?,slab=?,showTax=?,batta=?,od=?,mc=? where collectionId=? and da=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, collectionBean.getTname());
			ps.setString(2, collectionBean.getCname());
			ps.setString(3, collectionBean.getMname());
			ps.setString(4, collectionBean.getDa());
			ps.setInt(5, collectionBean.getTotaldays());
			ps.setInt(6, collectionBean.getTodayaudiance());
			ps.setInt(7, collectionBean.getTotalaudiance());
			ps.setFloat(8, collectionBean.getTodaygross());
			ps.setFloat(9, collectionBean.getTotalgross());
			ps.setFloat(10, collectionBean.getTodaynet());
			ps.setFloat(11, collectionBean.getTotalnet());
			ps.setFloat(12, collectionBean.getTodayshows());
			ps.setFloat(13, collectionBean.getTotalshows());
			ps.setFloat(14, collectionBean.getTodayexhibitorshare());
			ps.setFloat(15, collectionBean.getTotalexhibitorshare());
			ps.setFloat(16, collectionBean.getTodaydistributorshare());
			ps.setFloat(17, collectionBean.getTotaldistributorshare());
			ps.setFloat(18, collectionBean.getCollectionmorning());
			ps.setFloat(19, collectionBean.getCollectionmatinee());
			ps.setFloat(20, collectionBean.getCollectionfirst());
			ps.setFloat(21, collectionBean.getCollectionsecond());
			ps.setFloat(22, collectionBean.getCollectionbenifit());
			ps.setFloat(23, collectionBean.getCollectiospecial());
			ps.setInt(24, collectionBean.getAudiencemorning());
			ps.setInt(25, collectionBean.getAudiencematinee());
			ps.setInt(26, collectionBean.getAudiencefirst());
			ps.setInt(27, collectionBean.getAudiencesecond());
			ps.setInt(28, collectionBean.getAudiencebenifit());
			ps.setInt(29, collectionBean.getAudiencespecial());
			ps.setFloat(30, collectionBean.getSlab());
			ps.setFloat(31, collectionBean.getShowTax());
			ps.setFloat(32, collectionBean.getBatta());
			ps.setFloat(33, collectionBean.getOd());
			ps.setFloat(34, collectionBean.getMc());
			/*
			 * ps.setInt(36,collectionBean.getTheatorid()); ps.setInt(37,
			 * collectionBean.getCollectionId()); ps.setString(38,
			 * collectionBean.getTname());
			 */
			ps.setInt(35, collectionBean.getCollectionId());
			ps.setString(36, collectionBean.getDa());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
