package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.AddBean;

public class ViewAllAddDao {

	public List viewAll() {
		// TODO Auto-generated method stub
		List users = new ArrayList();
        try {
              String sql = "SELECT * FROM addition";
              Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               AddBean Bean = new AddBean();
               Bean.setState(rs.getString("stateName"));
               Bean.setDistrict(rs.getString("districtName"));
               Bean.setCenter(rs.getString("centerName"));
               Bean.setTheator(rs.getString("theatorName"));
               Bean.setMovie(rs.getString("mname"));
               Bean.setTerm(rs.getInt("percentage"));
               Bean.setDistributor(rs.getString("distname"));
                                         
                users.add(Bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
	}
	}


