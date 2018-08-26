package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CenterBean;
import com.bvr.bean.DistrictBean;
import com.bvr.driverconnection.ConnectionProvider;

public class DeleteCenterDAO {
	public void removeCenter(int districtId) throws Exception {
		// TODO Auto-generated method stub
		 try {
            String sql = "DELETE FROM center WHERE districtId=?";
            Connection conn = ConnectionProvider.getConnection();
        PreparedStatement ps = conn
                .prepareStatement(sql);
        ps.setInt(1, districtId);
       
        ps.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
		
		
	}

	public List getAllCenters() {
		List users = new ArrayList();
       try {
             String sql = "SELECT * FROM center";
             Connection conn = ConnectionProvider.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
              CenterBean centerBean = new CenterBean();
              centerBean.setCenterId(rs.getInt("centerId"));
              
              centerBean.setDistrictId(rs.getInt("districtId"));
              centerBean.setCenterName(rs.getString("centerName"));
              
                                         
               users.add(centerBean);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

       return users;
	}
}