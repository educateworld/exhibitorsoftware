<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String theator=request.getParameter("date");
 String buffer="<select name='theator'><option value='-1'>Select</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from collection where tname='"+theator+"'");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString("da")+"'>"+rs.getString("da")+"</option>";
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }
 %>
