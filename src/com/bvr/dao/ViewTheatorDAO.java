package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CenterBean;
import com.bvr.bean.TheatorBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewTheatorDAO {
	public List getAllTheators() throws Exception {
        List theators = new ArrayList();
        try {
                String sql = "SELECT * FROM theator";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	TheatorBean tb = new TheatorBean();
            	tb.setTheatorId(rs.getInt("theatorId"));
            	tb.setCenterName(rs.getString("centerId"));
            	tb.setTheatorName(rs.getString("theatorName"));
            	tb.setHousefulCapacity(rs.getInt("housefulCapacity"));
            	tb.setTheatreDescription(rs.getString("theatreDescription"));
            	tb.setOwnerName(rs.getString("ownerName"));
            	tb.setContactNumber(rs.getString("contactNumber"));
            	tb.setTheatreRent(rs.getFloat("theatreRent"));
            	tb.setDistributorShare(rs.getFloat("distributorShare"));
            	tb.setSlab(rs.getFloat("slab"));
            	tb.setShowTax(rs.getFloat("showTax"));
            	tb.setBatta(rs.getFloat("batta"));
            	tb.setInr(rs.getFloat("inr"));
            	tb.setMc(rs.getFloat("mc"));
            	
            	
            	
            	
            	
            	theators.add(tb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return theators;
    }
	public void removeTheator(String centerName) throws Exception {
        try {
                String sql = "DELETE FROM theator WHERE centerId=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, centerName);
            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

	}
}
