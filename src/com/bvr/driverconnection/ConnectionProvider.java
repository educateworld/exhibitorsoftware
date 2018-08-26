package com.bvr.driverconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class DBConnection
 */
@WebServlet("/ConnectionProvider")
public class ConnectionProvider extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ConnectionProvider() {
    	super();
       
        // TODO Auto-generated constructor stub
    }
    static Connection conn = null;
	/**
	 * @param args
	 */ 
	static ResourceBundle resource=null;
	public static Connection getConnection() {
		  resource = ResourceBundle.getBundle("dbConnection");
		 
		try {
			String url=(String) resource.getObject("url");
			String dbName = (String) resource.getObject("dbName");
			String driver = (String) resource.getObject("driver");
			String userName = (String) resource.getObject("userName"); 
			String password = (String) resource.getObject("password");	
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url+dbName,userName,password);
		}
		catch (Exception e) {
			 e.printStackTrace();
			}
		return conn;
		// TODO Auto-generated method stub

	}

}
