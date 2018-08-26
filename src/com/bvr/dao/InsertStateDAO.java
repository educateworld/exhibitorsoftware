package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertStateBean;

public class InsertStateDAO {
	public void insertState(InsertStateBean user) throws Exception {
		// TODO Auto-generated method stub
		try{
		  String sql = "INSERT INTO state(stateName)" +
          " VALUES (?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getStateName());
			ps.executeUpdate();
			
			conn.close();
		}
		catch (NumberFormatException e) {
            e.printStackTrace();
        }
		
	} 
}
