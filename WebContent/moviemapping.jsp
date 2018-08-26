<%@page import="java.sql.*"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%
String theator=request.getParameter("center");  
System.out.println("movie mapping:"+theator);
 String buffer="<select name='movie'><option value='-1'>Select Movie</option>";  
 try{
	 Connection con=ConnectionProvider.getConnection();
	  Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from movie where theatorId='"+theator+"' ");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString(1)+"_"+rs.getString(2)+"'>"+rs.getString(2)+"</option>";  
   System.out.println("showmoviemap:"+rs.getString(1));
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }
 %>
