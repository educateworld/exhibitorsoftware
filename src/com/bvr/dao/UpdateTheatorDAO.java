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


public class UpdateTheatorDAO {
	public void editTheator(TheatorBean theator) {           
        try {
        	
                String sql = "update theator set centerId=?,theatorName=?,housefulCapacity=?,theatreDescription=?,ownerName=?,contactNumber=?,theatreRent=?, distributorShare=?, slab=?,showTax=?, batta=?, inr=?, mc=? WHERE theatorId=?";
                Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,theator.getCenterName());
                ps.setString(2, theator.getTheatorName()); 
                ps.setInt(3, theator.getHousefulCapacity());
    			ps.setString(4, theator.getTheatreDescription());
    			ps.setString(5, theator.getOwnerName());
    			ps.setString(6, theator.getContactNumber());
    			ps.setFloat(7, theator.getTheatreRent());
    			ps.setFloat(8, theator.getDistributorShare());
    			ps.setFloat(9, theator.getSlab());
    			ps.setFloat(10, theator.getShowTax());
    			ps.setFloat(11,theator.getBatta());
    			ps.setFloat(12, theator.getInr());
    			ps.setFloat(13, theator.getMc());
                
            ps.setInt(14, theator.getTheatorId());
         System.out.println("theatorName" +theator.getTheatorName());
            System.out.println("theatorId" +theator.getTheatorId());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
	public List getAllTheators() throws Exception {
        List theators = new ArrayList();
        try {
                String sql = "SELECT * FROM theator";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	TheatorBean theator = new TheatorBean();
            	theator.setTheatorName(rs.getString("theatorName"));
            	theators.add(theator);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return theators;
    }
	public TheatorBean getTheatorBytheatorId(int theatorId) {
		TheatorBean theator = new TheatorBean();
        try {
                String sql = "SELECT * FROM theator WHERE theatorId=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, theatorId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	theator.setTheatorId(rs.getInt("theatorId"));
            	theator.setCenterName(rs.getString("centerId"));
            	theator.setTheatorName(rs.getString("theatorName"));
            	theator.setHousefulCapacity(rs.getInt("housefulCapacity"));
            	theator.setTheatreDescription(rs.getString("theatreDescription"));
            	theator.setOwnerName(rs.getString("ownerName"));
            	theator.setContactNumber(rs.getString("contactNumber"));
            	theator.setTheatreRent(rs.getFloat("theatreRent"));
            	theator.setDistributorShare(rs.getFloat("distributorShare"));
            	theator.setSlab(rs.getFloat("slab"));
            	theator.setShowTax(rs.getFloat("showTax"));
            	theator.setBatta(rs.getFloat("batta"));
            	theator.setInr(rs.getFloat("inr"));
            	theator.setMc(rs.getFloat("mc"));
            	
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return theator;
    }
       
}
