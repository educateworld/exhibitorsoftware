package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertMovieBean;

public class MovieInsertDao {

	public void insertMovie(InsertMovieBean user) throws SQLException {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO movie (mname) VALUES (?)";
		 System.out.println("movie1");
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setString(1,user.getTheatorName());
			ps.setString(1,user.getMovieName());
			 System.out.println("movie3");
			ps.executeUpdate();
	}

}
