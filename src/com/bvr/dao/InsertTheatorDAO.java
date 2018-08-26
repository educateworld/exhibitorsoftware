package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bvr.driverconnection.ConnectionProvider;
import com.bvr.insertbean.InsertTheatorBean;

public class InsertTheatorDAO {
	public void insertTheator(InsertTheatorBean user) throws Exception {
		// TODO Auto-generated method stub
		  String sql = "INSERT INTO theator(stateName, districtName,centerId , theatorName ,housefulCapacity,theatreDescription,ownerName,contactNumber,theatreRent,distributorShare,slab,showTax ,batta ,inr ,mc )" +
	      " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getStateName());
			ps.setString(2, user.getDistrictName());
			ps.setString(3, user.getCenterName());
			ps.setString(4, user.getTheatorName());
			ps.setInt(5, user.getHousefulCapacity());
			ps.setString(6, user.getTheatreDescription());
			ps.setString(7, user.getOwnerName());
			ps.setString(8, user.getContactNumber());
			ps.setFloat(9, user.getTheatreRent());
			ps.setFloat(10, user.getDistributorShare());
			ps.setFloat(11, user.getSlab());
			ps.setFloat(12, user.getShowTax());
			ps.setFloat(13,user.getBatta());
			ps.setFloat(14, user.getInr());
			ps.setFloat(15, user.getMc());
			
			
			
			
			ps.executeUpdate();
	}
}
