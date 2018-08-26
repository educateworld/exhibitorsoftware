package com.bvr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bvr.bean.RegisterBean;
import com.bvr.driverconnection.ConnectionProvider;

public class UpdateDao {

	public String updateUser(RegisterBean rb) {
		// TODO Auto-generated method stub
		final String SUCCESS = "success";
		final String FAILURE = "failure";
		String result = null;
		PreparedStatement stmtUpdate = null;
		
		//Create a Database Connection
		Connection con = ConnectionProvider.getConnection();
		try{
			con.setAutoCommit(false);
					
			StringBuffer sbUpdate = new StringBuffer();
			
			sbUpdate.append("UPDATE register SET ");	
			sbUpdate.append(" username = '" + rb.getUserName() + "',");
			sbUpdate.append(" password = '" + rb.getPassword() + "',");
			sbUpdate.append(" emailed = '" + rb.getEmailId() + "',");
			sbUpdate.append(" mobileno = '" +rb.getMobileNo() + "'");
			sbUpdate.append(" address = '" +rb.getAddress() + "'");
			sbUpdate.append(" status = '" +rb.getStatus() + "'");
			sbUpdate.append(" random= '" +rb.getRandom() + "'");
			sbUpdate.append(" where userid  = " + rb.getUserId());
			
			stmtUpdate = con.prepareStatement(sbUpdate.toString());
			
			int rows = stmtUpdate.executeUpdate();
			

			if (rows != 1){
				result = FAILURE;
				
				throw new SQLException(
					"executeUpdate return value: "
					+ rows);
			}	
			result = SUCCESS;
			
		}catch (SQLException ex){
			result = FAILURE;
			
			
		}
		
		return result;	
	}

}
