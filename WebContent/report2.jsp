<%@page import="java.sql.*"%>
<%@page import="com.bvr.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>

<%

String report1=request.getParameter("report1");  
System.out.println("gf"+report1);
String buffer="<select name='mname'><option value='-1'>Select</option>";
 try{
	 Connection conn3 = ConnectionProvider.getConnection();
	 Statement st3 = conn3.createStatement();
	 String query3 = "select * from collection where da='"+report1+"'";
	 ResultSet rs3 = st3.executeQuery(query3);
	 while(rs3.next()){
		 buffer=buffer+"<option value='"+rs3.getString(4)+"'>"+rs3.getString(4)+"</option>"; 
		 System.out.println("movie"+rs3.getString(4));
	 }
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }

 %>
 