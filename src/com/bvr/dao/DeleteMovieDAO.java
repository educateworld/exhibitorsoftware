package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CenterBean;
import com.bvr.bean.DistrictBean;
import com.bvr.bean.MoviesBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteMovieDAO {
	

	public List getAllMovies() throws Exception {
        List movies = new ArrayList();
        try {
                String sql = "SELECT * FROM movie";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              MoviesBean movieBean = new MoviesBean();
             // movieBean.setTheatorName(rs.getString("theatorId"));
              movieBean.setMovieName(rs.getString("mname"));
              movies.add(movieBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movies;
    }

	public void removeMovie(int uid) {
		// TODO Auto-generated method stub
		  try {
              String sql = "DELETE FROM movie WHERE mid=?";
              Connection conn=ConnectionProvider.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setInt(1,uid);
          
          ps.executeUpdate();

      } catch (SQLException e) {
          e.printStackTrace();
      }
	}
	
}