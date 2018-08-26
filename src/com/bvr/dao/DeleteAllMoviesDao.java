package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.MoviesBean;
import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteAllMoviesDao {

	public void removeMovie(int uid) {
		// TODO Auto-generated method stub
		try {
            String sql = "DELETE FROM movie WHERE mid=?";
            Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = conn
                .prepareStatement(sql);
        ps.setInt(1, uid);
        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
	}

	public Object getAllMovies() {
		List users = new ArrayList();
        try {
              String sql = "SELECT * FROM movie";
              Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               MoviesBean Bean = new MoviesBean();
               Bean.setMovieId(rs.getInt("mid"));
              // Bean.setTheatorName(rs.getString("theatorId"));
               Bean.setMovieName(rs.getString("mname"));
            
                users.add(Bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
	}


}
