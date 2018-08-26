package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertUserBean;
public class RegisterDAO {

public void insertUser(InsertUserBean user) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("ok1");
        String sql = 
        "INSERT INTO register(logintype,username,password,emailed,mobileno,address,status)" +
        " VALUES (?,?,?,?,?,?,?)";
        System.out.println("ok2");

		Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        System.out.println("ok3");
        ps.setString(1,"pending");
        ps.setString(2,user.getUserName());
        ps.setString(3,user.getPassword());
        ps.setString(4,user.getEmailId());
        ps.setString(5,user.getMobileNo());
        ps.setString(6,user.getAddress());
        ps.setString(7,"pending");
        ps.executeUpdate();        
	}

}
