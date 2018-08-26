<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
 String buffer="<select name='da'><option value='-1'>Select Start Date</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement(); 
  //System.out.println(theator);
 ResultSet rsq = stmt.executeQuery("Select * from collection where tname='"+request.getParameter("mname")+"'");  
   while(rsq.next()){
	   //System.out.println(rsq.getString("da"));
   buffer=buffer+"<option value='"+rsq.getString("tname")+"_"+rsq.getString("da")+"'>"+rsq.getString("da")+"</option>";
   }  
 buffer=buffer+"</select>";  
 //System.out.println(buffer);
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 } 
 %>