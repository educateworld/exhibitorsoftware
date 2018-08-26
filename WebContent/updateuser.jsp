<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.bvr.dao.ViewAllUsersDao"%>
<%@page import="java.util.List"%>
<%@page import="com.bvr.bean.RegisterBean"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>
  <form name="myFormA" method="post" action="controller">
      <input type="hidden" name="form_action" value="UPDATEUSER" /> 
      <input type="hidden" name="action" value="update" /> 
<%
//UserBean user = new UserBean();
ViewAllUsersDao dao = new ViewAllUsersDao();
List<RegisterBean> userList = dao.viewAllusers();
//Iterator<UserBean> itr = userList.iterator();
%>
<table border="1">
<tr>
<th>user id</th>
<th>Random</th>
<th>User Name</th>
<th>password</th>
<th>emailid</th>
<th>mobileno</th>
<th>address</th>
<th>status</th>
</tr>
<tr>
<%
/*while(itr.hasNext())
{
System.out.println(user.getId());*/
for (RegisterBean user : userList) {
%>
<td><%=user.getUserId()%></td>
<td><%=user.getRandom()%></td>
<td><%=user.getUserName()%></td>
<td><%=user.getPassword()%></td>
<td><%=user.getEmailId()%></td>
<td><%=user.getMobileNo()%></td>
<td><%=user.getAddress()%></td>
<td><%=user.getStatus()%></td>
<td>
</tr>
<tr><td><input type="submit" name="update" value="Update"/></td>
</tr>

<%
}
//}
%>
</table>
</form>
</body>
</html>