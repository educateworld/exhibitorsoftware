package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertTermBean;

public class TermInsertDAO {

	public void insertTerm(InsertTermBean user) throws SQLException {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO term(termname)" +
         " VALUES (?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getTermname());
			
			ps.executeUpdate();
		
	}

}
