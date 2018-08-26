package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.DistrictBean;
import com.bvr.driverconnection.ConnectionProvider;


public class UpdateDistrictDAO {
	public void editDistrict(DistrictBean districtBean) {           
        try {
        	
                String sql = "update district set districtName=? WHERE districtId=?";
                Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, districtBean.getDistrictName());    
            ps.setInt(2, districtBean.getDistrictId());
            System.out.println("districtname" +districtBean.getDistrictName());
            System.out.println("districtid" +districtBean.getDistrictId());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
	public List getAllDistrict() throws Exception {
        List districts = new ArrayList();
        try {
                String sql = "SELECT * FROM district";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	DistrictBean districtBean = new DistrictBean();
            	districtBean.setDistrictName(rs.getString("districtName"));
            	districts.add(districtBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return districts;
    }
	public DistrictBean getDistrictBydistrictId(int districtId) {
		DistrictBean districtBean = new DistrictBean();
        try {
                String sql = "SELECT * FROM district WHERE districtId=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, districtId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	districtBean.setDistrictId(rs.getInt("districtId"));
            	districtBean.setStateId(rs.getInt("stateId"));
            	districtBean.setDistrictName(rs.getString("districtName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return districtBean;
    }
       
}
