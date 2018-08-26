package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewAllTermDao {

	public List viewAllTerm() {
		// TODO Auto-generated method stub
		List users = new ArrayList();
        try {
              String sql = "SELECT * FROM term";
              Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               TermBean Bean = new TermBean();
               Bean.setTermId(rs.getInt("termid"));
               Bean.setTermname(rs.getString("termname"));
              
                users.add(Bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
	}
	}


