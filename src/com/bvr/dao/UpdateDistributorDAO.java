package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.DistributorBean;
import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class UpdateDistributorDAO {

	public void editDistributor(DistributorBean state) {
try {
        	
            String sql = "update distributor set distname=?,distmobileno=?,distaddress=? WHERE distid=?";
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
          
            ps.setString(1, state.getDistributorName()); 
            ps.setString(2, state.getMobileNumber()); 
            ps.setString(3, state.getAddress()); 
            ps.setInt(4, state.getDistributorId()); 
            
         
        
        
  
        ps.executeUpdate();            

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
		


	public List getAllDistributor() {
		// TODO Auto-generated method stub
		List states = new ArrayList();
        try {
                String sql = "SELECT * FROM distributor";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	 DistributorBean disb = new  DistributorBean ();                  
            		disb.setDistributorId(rs.getInt("distid"));
                	disb.setDistributorName(rs.getString("distname"));
                	disb.setMobileNumber(rs.getString("distmobileno"));
                	disb.setAddress(rs.getString("distaddress"));
                	states.add(disb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return states;
    }

public DistributorBean getStateBydistributorId(int distId) {
	DistributorBean disb = new DistributorBean();
    try {
            String sql = "SELECT * FROM distributor WHERE distId=?";
            Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, distId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
        	disb.setDistributorId(rs.getInt("distid"));
        	disb.setDistributorName(rs.getString("distname"));
        	disb.setMobileNumber(rs.getString("distmobileno"));
        	disb.setAddress(rs.getString("distaddress"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return disb;
}
}


