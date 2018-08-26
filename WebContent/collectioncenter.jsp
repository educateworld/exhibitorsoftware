<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String theator=request.getParameter("movie");  
 String buffer="<select name='cname' ><option value='-1'>Select Center</option>";  
 try{
 //Class.forName("com.mysql.jdbc.Driver").newInstance();  
 Connection con = ConnectionProvider.getConnection();  
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from collection where collectionId='"+theator+"'");  
   while(rs.next()){
   buffer=buffer+"<option value='"+rs.getString(1)+"_"+rs.getString(3)+"'>"+rs.getString(3)+"</option>"; 
   System.out.println("gu"+theator);
   }  
 buffer=buffer+"</select>";  
 response.getWriter().println(buffer); 
 }
 catch(Exception e){
     System.out.println(e);
 }
 %>
 