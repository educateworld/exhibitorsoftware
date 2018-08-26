package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.bvr.bean.RegisterBean;
import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewAllUsersDao {

	public List viewAllusers() {
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
                  Bean.setMobileNo(rs.getLong("mobileno"));
                 Bean.setAddress(rs.getString("address"));
                  Bean.setStatus(rs.getString("status"));
                   
             
                users.add(Bean);
               }
            
        }
            
            
        catch (Exception e) {
            e.printStackTrace();
        }
            
        return users;
	
	}
}


