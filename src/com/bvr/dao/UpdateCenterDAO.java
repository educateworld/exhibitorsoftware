package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CenterBean;
import com.bvr.driverconnection.ConnectionProvider;


public class UpdateCenterDAO {
	public void editCenter(CenterBean center) {           
        try {
        	
                String sql = "update center set centerName=? WHERE centerId=?";
                Connection conn = ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, center.getCenterName());    
            ps.setInt(2, center.getCenterId());
            System.out.println("centerName" +center.getCenterName());
            System.out.println("centerId" +center.getCenterId());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
	public List getAllCenters() throws Exception {
        List centers = new ArrayList();
        try {
                String sql = "SELECT * FROM center";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CenterBean center = new CenterBean();
            	center.setCenterName(rs.getString("centerName"));
            	centers.add(center);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return centers;
    }
	public CenterBean getCenterBycenterId(int centerId) {
		CenterBean center = new CenterBean();
        try {
                String sql = "SELECT * FROM center WHERE centerId=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, centerId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	center.setCenterId(rs.getInt("centerId"));
            	center.setDistrictId(rs.getInt("districtId"));
            	center.setCenterName(rs.getString("centerName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return center;
    }
       
}
