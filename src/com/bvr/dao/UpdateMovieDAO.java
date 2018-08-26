package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.MoviesBean;
import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class UpdateMovieDAO {

	public void editMovie(MoviesBean state) {
try {
        	
            String sql = "update movie set mname=? WHERE mid=?";
            Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
          
            ps.setString(1, state.getMovieName()); 
           // ps.setString(2, state.getTheatorName()); 
            ps.setInt(2, state.getMovieId()); 
         
        
  
        ps.executeUpdate();            

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

	public List getAllMovies() {
		 List states = new ArrayList();
	        try {
	                String sql = "SELECT * FROM movie";
	                Connection conn=ConnectionProvider.getConnection();
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	 MoviesBean Bean = new MoviesBean();                  
	            	  MoviesBean movieBean = new MoviesBean();
	                  movieBean.setMovieId(rs.getInt("mid"));
	                 // movieBean.setTheatorName(rs.getString("theatorId"));
	                  movieBean.setMovieName(rs.getString("mname"));
	                  
	                states.add(Bean);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return states;
	    }

	public MoviesBean getStateByMovieId(int mId) {
		MoviesBean Bean = new MoviesBean();
		try {
            String sql = "SELECT * FROM movie WHERE mid=?";
            Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, mId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
        	                  
       	  MoviesBean movieBean = new MoviesBean();
             movieBean.setMovieId(rs.getInt("mid"));
             //movieBean.setTheatorName(rs.getString("theatorId"));
             movieBean.setMovieName(rs.getString("mname"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return Bean;
}
}


