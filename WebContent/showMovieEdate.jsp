<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%
 String buffer="<select name='edate'><option value='-1'>Select End Date</option>";  
 try{
 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement(); 
 String[] ss = request.getParameter("mname").split("_");
ResultSet rsq = stmt.executeQuery("Select da from collection where mname='"+ss[0]+"'and da>'"+ss[1]+"'");  
   while(rsq.next()){
	   //System.out.println(rsq.getString("da"));
   buffer=buffer+"<option value='"+rsq.getString("da")+"'>"+rsq.getString("da")+"</option>";
   }  
 buffer=buffer+"</select>";  
 //System.out.println(buffer);
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 } 
 %>