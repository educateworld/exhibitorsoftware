<%@page import="com.bvr.driverconnection.ConnectionProvider"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./ExcelServlet">
<table border="1">
     <tr><td>Theater Name</td>
<td>Total Audience</td>
<td>Total Gross</td>
<td>Collection Morning</td>
<td>Collection Matinee</td>
<td>Collection First</td>
<td>Collection Second</td>
<td>Collection Special</td> </tr>


   <%
 Connection con = ConnectionProvider.getConnection(); 
 String bb=request.getParameter("da");
 String bb1=request.getParameter("movie");
 
 String[] ss = bb.split("-");
 String name=ss[1];
 System.out.println(bb);
 System.out.println(bb1);
 PreparedStatement pstmt;
 ResultSet rs;
 pstmt = con.prepareStatement(
   "SELECT * FROM collection WHERE month(da)=? and mname=?"); 
 System.out.println(pstmt);
                                   
 pstmt.setString(1,name);
 pstmt.setString(2,bb1);

 rs = pstmt.executeQuery();

  while(rs.next()){
     %>
     
     
    <tr><td><%=rs.getString("tname")%></td>
<td><%=rs.getString("totalaudiance")%></td>
<td><%=rs.getString("totalgross")%></td>
<td><%=rs.getString("collectionmorning")%></td>
<td><%=rs.getString("collectionmatinee")%></td>
<td><%=rs.getString("collectionfirst")%></td>
<td><%=rs.getString("collectionsecond")%></td>
<td><%=rs.getString("collectionspecial")%></td> </tr>
                   
      <%
 }
     %>
     <input type="submit" value="Excel Sheet">
     </table>
     </form>
</body>
</html>