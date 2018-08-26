<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String state=request.getParameter("state"); 
System.out.println("stateid"+state);
 String buffer="<select name='districtName' onchange='showCenter(this.value);'><option value='-1'>Select</option>";  
 try{
 
 Connection con =ConnectionProvider.getConnection(); 
 Statement stmt = con.createStatement();  
 ResultSet rs = stmt.executeQuery("Select * from district where stateId='"+state+"' ");  
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
 