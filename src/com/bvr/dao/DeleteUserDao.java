package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.RegisterBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteUserDao {

	public void removeUser(int uid) {
		// TODO Auto-generated method stub
		 try {
             String sql = "DELETE FROM register WHERE userid=?";
             Connection conn = ConnectionProvider.getConnection();
         PreparedStatement ps = conn
                 .prepareStatement(sql);
         ps.setInt(1, uid);
         ps.executeUpdate();

     } catch (Exception e) {
         e.printStackTrace();
     }
		
	}

	public List getAllUsers() {
		// TODO Auto-generated method stub
		List users = new ArrayList();
        try {
              String sql = "SELECT * FROM register";
              Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               RegisterBean Bean = new  RegisterBean ();                  
                   Bean.setUserId(rs.getInt("userid"));
                   Bean.setRandom(rs.getString("random"));
                  Bean.setUserName(rs.getString("username")); 
                  Bean.setPassword(rs.getString("password")); 
                  Bean.setEmailId(rs.getString("emailed")); 
                  Bean.setMobileNo(rs.getInt("mobileno"));
                 Bean.setAddress(rs.getString("address"));
                  Bean.setStatus(rs.getString("status"));
                   
             
                users.add(Bean);
               }
            
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
		return users;
	}

}
