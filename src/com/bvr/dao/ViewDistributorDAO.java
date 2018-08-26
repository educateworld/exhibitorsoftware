package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bvr.bean.DistributorBean;
import com.bvr.driverconnection.ConnectionProvider;

public class ViewDistributorDAO {
	public List getAllDistributors() throws Exception {
        List Distributors = new ArrayList();
        try {
                String sql = "SELECT * FROM distributor";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	DistributorBean disb = new DistributorBean();
            	disb.setDistributorId(rs.getInt("distid"));
            	disb.setDistributorName(rs.getString("distname"));
            	disb.setMobileNumber(rs.getString("distmobileno"));
            	disb.setAddress(rs.getString("distaddress"));
            	Distributors.add(disb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Distributors;
    }
	public void removeDistributor(String distributorName) throws Exception {
        try {
                String sql = "DELETE FROM distributor WHERE distributorName=?";
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, distributorName);
            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	}
