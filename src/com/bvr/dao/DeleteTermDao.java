package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteTermDao {

	public void removeTerm(int uid) {
		// TODO Auto-generated method stub
		 try {
             String sql = "DELETE FROM term WHERE termid=?";
             Connection conn = ConnectionProvider.getConnection();
         PreparedStatement ps = conn
                 .prepareStatement(sql);
         ps.setInt(1, uid);
         ps.executeUpdate();

     } catch (Exception e) {
         e.printStackTrace();
     }
		
		
	}

	public List getAllTerm() {
		List users = new ArrayList();
        try {
              String sql = "SELECT * FROM term";
              Connection conn = ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               TermBean Bean = new TermBean();
               Bean.setTermId(rs.getInt("termid"));
               Bean.setPercentage(rs.getInt("percentage"));
               Bean.setMarginProfit(rs.getInt("mg"));
               Bean.setAdvance(rs.getInt("advance"));
                                          
                users.add(Bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
	}

}
