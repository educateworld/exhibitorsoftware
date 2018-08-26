package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.CenterBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewCenterDAO {
	public List getAllCenters() throws Exception {
        List centers = new ArrayList();
        try {
                String sql = "SELECT * FROM center";
                Connection conn=ConnectionProvider.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
              CenterBean centerBean = new CenterBean();
              centerBean.setCenterId(rs.getInt("centerId"));
              centerBean.setDistrictId(rs.getInt("districtId"));
              centerBean.setCenterName(rs.getString("centerName"));
              centers.add(centerBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return centers;
    }
	public void removeCenter(int districtId) throws Exception {
        try {
                String sql = "DELETE FROM center WHERE districtId=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, districtId);
            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }


}
