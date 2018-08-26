<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String movie=request.getParameter("movie"); 
System.out.println("collection date movie"+movie);
 String buffer="<select name='da' onchange='showTheator(this.value);'><option value='-1'>Select Date</option>";  
 try{
 
 Connection con =ConnectionProvider.getConnection(); 
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from collection where mname='"+movie+"' ");  
   while(rs.next()){
	   buffer=buffer+"<option value='"+rs.getString("mname")+"_"+rs.getString("da")+"'>"+rs.getString("da")+"</option>"; 
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }
 %>
 