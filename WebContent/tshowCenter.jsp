<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
 String buffer="<select name='centerId'><option value='-1'>--Select Center--</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement(); 
  //System.out.println(theator);
 ResultSet rsq = stmt.executeQuery("Select * from center where districtId='"+request.getParameter("mname")+"'");  
   while(rsq.next()){
   buffer=buffer+"<option value='"+rsq.getString("centerId")+"_"+rsq.getString("centerName")+"'>"+rsq.getString("centerName")+"</option>";
   }  
 buffer=buffer+"</select>";  
 //System.out.println(buffer);
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 } 
 %>