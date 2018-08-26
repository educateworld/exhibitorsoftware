package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.bean.AccountsBean;
import com.bvr.driverconnection.ConnectionProvider;

public class InsertAccount2DAO {

	public void insertAccount(AccountsBean user) {
		// TODO Auto-generated method stub
		String random = "";
     	double l = Math.random();
     	int[] str = { 9, 9, 9, 9, 9 ,9};

     	int d = 0;
     	for (int i = 0; i < str.length; i++) {
     		d = (int) (Math.random() * str[i]);
     		random += Integer.toString(d);
     	}
		try{
			  String sql = "INSERT INTO accountsth(theatorName,date,termname,termtype,amount,voucherNo,Narration) VALUES (?,?,?,?,?,?,?)";
				Connection conn = ConnectionProvider.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, user.getTheatorName());
				ps.setString(2, user.getDate());
				ps.setString(3, user.getTermname());
				ps.setInt(4, user.getTermtype());
				
				ps.setInt(5, user.getAmount());
				ps.setString(6, random);
				ps.setString(7, user.getNarration());
				ps.executeUpdate();
			
			}
			catch (SQLException e) {
	            e.printStackTrace();
	        }	
	}

}
