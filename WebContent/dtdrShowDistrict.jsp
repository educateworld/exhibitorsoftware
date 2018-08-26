<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
 String buffer="<select name='dtdrdistrictId'><option value='-1'>--SelectDistrict--</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement(); 
  //System.out.println(theator);
 ResultSet rsq = stmt.executeQuery("Select * from district where stateId='"+request.getParameter("mname")+"'");  
   while(rsq.next()){
	   //System.out.println(rsq.getString("districtName"));
   buffer=buffer+"<option value='"+rsq.getString("districtId")+"'>"+rsq.getString("districtName")+"</option>";
   }  
 buffer=buffer+"</select>";  
 //System.out.println(buffer);
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 } 
 %>