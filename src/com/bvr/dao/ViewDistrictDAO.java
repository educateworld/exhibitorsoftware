package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.DistrictBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewDistrictDAO {
	public List getAllDistrict() throws Exception {
        List districts = new ArrayList();
        try {
                String sql = "SELECT * FROM district";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              DistrictBean districtBean = new DistrictBean();
              districtBean.setDistrictId(rs.getInt("districtId"));
              districtBean.setStateId(rs.getInt("stateId"));
              districtBean.setDistrictName(rs.getString("districtName"));
                districts.add(districtBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return districts;
    }
	public void removeDistrict(String stateName) throws Exception {
        try {
                String sql = "DELETE FROM district WHERE stateName=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, stateName);
            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }


}
