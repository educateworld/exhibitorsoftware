package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertDistrictBean;

public class InsertDistrictDAO {
	public void insertDistrict(InsertDistrictBean user) throws Exception {
		// TODO Auto-generated method stub
		try{
		  String sql = "INSERT INTO district(stateId,districtName)" +
	      " VALUES (?,?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getStateName());
			ps.setString(2, user.getDistrictName());
			ps.executeUpdate();
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
