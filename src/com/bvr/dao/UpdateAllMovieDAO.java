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

public class UpdateAllMovieDAO {
	public MoviesBean  getStateByMovieId(int movieId) {
		MoviesBean Bean = new MoviesBean();
        try {
                String sql = "SELECT * FROM movie WHERE mid=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, movieId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	 Bean.setMovieId(rs.getInt("mid"));
               //  Bean.setTheatorName(rs.getString("theatorId"));
                 Bean.setMovieName(rs.getString("mname"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Bean;
	}

	public void editMovie(MoviesBean state) {
		// TODO Auto-generated method stub
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

}
