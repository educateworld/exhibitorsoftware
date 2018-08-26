package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertDistributorBean;

public class DistributorInsertDao {

	public void insertDistributor(InsertDistributorBean user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO distributor(distname,distmobileno,distaddress)" +
	      " VALUES (?,?,?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getDistributorName());
			ps.setString(2, user.getMobileNumber());
			ps.setString(3, user.getAddress());
			ps.executeUpdate();
	}

}
