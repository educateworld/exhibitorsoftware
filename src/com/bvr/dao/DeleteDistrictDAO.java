package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.DistrictBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteDistrictDAO {
	public void removeDistrict(int stateName) throws Exception {
		// TODO Auto-generated method stub
		 try {
            String sql = "DELETE FROM district WHERE stateId=?";
            Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = conn
                .prepareStatement(sql);
        ps.setInt(1, stateName);
       
        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
		
		
	}

	public List getAllDistrict() {
		List users = new ArrayList();
       try {
             String sql = "SELECT * FROM district";
             Connection conn = ConnectionProvider.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
              DistrictBean Bean = new DistrictBean();
              Bean.setDistrictId(rs.getInt("districtId"));
              Bean.setStateName(rs.getString("stateId"));
              Bean.setDistrictName(rs.getString("districtName"));
              
                                         
               users.add(Bean);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

       return users;
	}
}