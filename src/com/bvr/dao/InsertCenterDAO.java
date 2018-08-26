package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertCenterBean;

public class InsertCenterDAO {
	public void insertCenter(InsertCenterBean user) throws Exception {
		// TODO Auto-generated method stub
		try{
		  String sql = "INSERT INTO center(districtId,centerName)" +
	      " VALUES (?,?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getDistrictName());
			ps.setString(2, user.getCenterName());
			ps.executeUpdate();
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
