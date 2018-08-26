<%@page import="com.bvr.dao.UpdateMovieDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.bvr.bean.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit state</title>
</head>
<body background="./Images/back2.jpg" >
<%
MoviesBean state = new MoviesBean();
%>
<%
UpdateMovieDAO dao = new UpdateMovieDAO();
%>
<form method="get" action='UpdateMovieHandler' name="editMovie">
<input type="hidden" name="action" value="updateMovie" /> 
<%
String uid = request.getParameter("movieId");
System.out.println("th"+uid);
if (!((uid) == null)) {
int mId = Integer.parseInt(uid);
state = dao.getStateByMovieId(mId);
%>
<h1 align="center">Movie Details</h1>
<table align="center">
<tr>
<td>Movie ID</td>
<td><input type="text" name="mid" readonly="readonly"
value="<%=state.getMovieId()%>"></td>
</tr>
<%-- <tr>
<td>Theator Id</td>
<td><input type="text" name="theatorId" readonly="readonly" value="<%=state.getTheatorName()%>"/></td>
</tr> --%>
<tr>
<td>Movie Name</td>
<td><input type="text" name="mname" value="<%=state.getMovieName()%>"/></td>
</tr>
<tr>

<td><input type="submit" value="Update" /></td>
<td><a href="Distributor.jsp"><input type="button" value="cancel"></a></td>
</tr>
</table>
<%
} else
out.println("ID Not Found");
%>
</form>
</body>
</html>