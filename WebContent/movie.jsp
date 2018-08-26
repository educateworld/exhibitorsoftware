<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String theator=request.getParameter("state");  
 String buffer="<select name='mname' ><option value='-1'>Select</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance();  
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from movie where theatorId='"+theator+"'");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString(1)+"_"+rs.getString(2)+"'>"+rs.getString(2)+"</option>"; 
   System.out.println("gu"+theator);
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }
 %>