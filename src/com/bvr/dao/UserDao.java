package com.bvr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bvr.bean.RegisterBean;
import com.bvr.driverconnection.ConnectionProvider;
import com.mysql.jdbc.Statement;

public class UserDao {

	public String checkUser(RegisterBean ub) {
		// TODO Auto-generated method stub
		String result = null;
		//final String SUCCESS = "success";
		//final String FAILURE = "failure";
						
		//Create a Database Connection
		Connection conn = ConnectionProvider.getConnection();
		Statement st = null;
		ResultSet rs = null;
	
		
		try{
			conn.setAutoCommit(false);
			st = (Statement) conn.createStatement();
	
			rs = st.executeQuery("select * from register  where username  = '"+ ub.getUserName() +
					"' and password  = '"+ ub.getPassword()+ "'") ;
					
			while (rs.next())
			{		
				System.out.println("not ok");
				ub.setUserName(rs.getString("username"));
				ub.setPassword(rs.getString("password"));
				/*ub.setEmailid(rs.getString("emailid"));
				ub.setMobileno(rs.getInt("mobileno"));
				ub.setAddress(rs.getString("address"));*/
			
				result = "success";
				
			}
		}catch (SQLException ex){
			System.out.println("exceptionDAo");
			result = "FAILURE";
			
			ex.printStackTrace();
			//log.error(ex);
		}catch (Exception e){
			result = "FAILURE";
			e.printStackTrace();
		}
		
		return result;	
	}

}
