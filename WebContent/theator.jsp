<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String center=request.getParameter("state");  
 String buffer="<select name='theatorName' onchange='showMovie(this.value);'><option value='-1'>Select</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();  
 Connection con =ConnectionProvider.getConnection();
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from theator where centerId='"+center+"' ");  
 System.out.println("gu"+center);
   while(rs.next()){
	  
	   buffer=buffer+"<option value='"+rs.getString(1)+"_"+rs.getString(3)+"'>"+rs.getString(3)+"</option>";  
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }

 %>
 
 