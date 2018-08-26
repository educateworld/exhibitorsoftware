<%@page import="java.sql.*"%>
<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%
String center=request.getParameter("mname");
System.out.println("theater:"+center);
 String buffer="<select name='dtdrtname' onchange='showMoviemapping(this.value);'><option value='-1'>Select Theatre</option>";  
 try{
	  Connection conn=ConnectionProvider.getConnection();
	 Statement stmt = conn.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from theator where centerId='"+center+"' ");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString("theatorName")+"'>"+rs.getString("theatorName")+"</option>";  
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }

 %>
 