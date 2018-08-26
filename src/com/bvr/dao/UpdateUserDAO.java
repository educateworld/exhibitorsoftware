package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.RegisterBean;
import com.bvr.driverconnection.ConnectionProvider;

public class UpdateUserDAO {

	public void editUser(RegisterBean state) {
		try {
        	
            String sql = "update register set username=?,password=?,emailed=?,mobileno=?,address=? WHERE userid=?";
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
          
            ps.setString(1, state.getUserName()); 
            ps.setString(2, state.getPassword()); 
            ps.setString(3, state.getEmailId()); 
            ps.setLong(4 ,state.getMobileNo()); 
            ps.setString(5, state.getAddress()); 
            
            ps.setInt(6, state.getUserId()); 
        
        
  
        ps.executeUpdate();            

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
		
	
	public List getAllUsers() {
		 List states = new ArrayList();
	        try {
	                String sql = "SELECT * FROM register";
	                Connection conn=ConnectionProvider.getConnection();
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	 RegisterBean Bean = new  RegisterBean ();                  
	                   Bean.setUserId(rs.getInt("userid"));
	                   Bean.setRandom(rs.getString("random"));
	                  Bean.setUserName(rs.getString("username")); 
	                  Bean.setPassword(rs.getString("password")); 
	                  Bean.setEmailId(rs.getString("emailed")); 
	                  Bean.setMobileNo(rs.getLong("mobileno"));
	                 Bean.setAddress(rs.getString("address"));
	                  Bean.setStatus(rs.getString("status"));
	                   
	                states.add(Bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return states;
	    }

	
	public RegisterBean getStateByUserId(int userId) {
		RegisterBean Bean = new RegisterBean();
        try {
                String sql = "SELECT * FROM register WHERE userid=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	 Bean.setUserId(rs.getInt("userid"));
                 Bean.setRandom(rs.getString("random"));
                Bean.setUserName(rs.getString("username")); 
                Bean.setPassword(rs.getString("password")); 
                Bean.setEmailId(rs.getString("emailed")); 
                Bean.setMobileNo(rs.getLong("mobileno"));
               Bean.setAddress(rs.getString("address"));
                Bean.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Bean;
    }
}
