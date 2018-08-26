package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.AddBean;

public class AddDAO {

	public void insertAdd(AddBean user) throws SQLException {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO addition(stateName,districtName,centerName,theatorName,mname,percentage,distname)" + "values(?,?,?,?,?,?,?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
     
    
			ps.setString(1, user.getState());
			ps.setString(2, user.getDistrict());
			ps.setString(3, user.getCenter());
			ps.setString(4, user.getTheator());
			ps.setString(5, user.getMovie());
			ps.setInt(6, user.getTerm());
			ps.setString(7, user.getDistributor());
			ps.executeUpdate();
		
	}

}
