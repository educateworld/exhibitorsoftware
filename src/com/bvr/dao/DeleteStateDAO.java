package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.StateBean;
import com.bvr.bean.TermBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteStateDAO {
	public void removeState(String stateName) throws Exception {
		// TODO Auto-generated method stub
		 try {
            String sql = "DELETE FROM state WHERE stateName=?";
            Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = conn
                .prepareStatement(sql);
        ps.setString(1, stateName);
        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
		
		
	}

	public List getAllState() {
		List users = new ArrayList();
       try {
             String sql = "SELECT * FROM state";
             Connection conn = ConnectionProvider.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
              StateBean Bean = new StateBean();
              Bean.setStateId(rs.getInt("stateId"));
              Bean.setStateName(rs.getString("stateName"));
              
                                         
               users.add(Bean);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

       return users;
	}
}