package com.bvr.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CollectionBean;
import com.bvr.driverconnection.ConnectionProvider;



public class DeleteCollectionDao {
	public void removeCollection(String date) {
        try {
                String sql = "DELETE FROM collection WHERE da=?";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,date);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }
	public List<CollectionBean> getAllCollection() {
        List<CollectionBean> collection = new ArrayList<CollectionBean>();
        try {
                String sql = "SELECT * FROM collection";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CollectionBean collectionBean = new CollectionBean();
            	
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
                collection.add(collectionBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return collection;
    }

}
