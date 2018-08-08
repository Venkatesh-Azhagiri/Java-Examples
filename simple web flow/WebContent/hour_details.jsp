<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
String s = request.getParameter("m");
System.out.println("Session value hh from jsp***"+s);
%>
</head>
<body bgcolor = "#808080">
<%
try {
if(!s.equalsIgnoreCase("mm"))
	response.sendRedirect("error.jsp");
}
catch(Exception e) {
	response.sendRedirect("error.jsp");
}
%>
<jsp:useBean id="state" class="service.TaskDetails"/> 
<center><b>Task Management</b></center>
<form action ="/" method = "POST">
<table border="5" width="400" align = "center" bgcolor = "#82CAFA">
<tr>
<th>Task</th>
<th>Activity</th>
<th>Hours</th>
<th>Description</th>
</tr>
<tr>
<td>
	<Select name="task">
	<c:forEach items="${state.task}" var="s">
	 <option value="${s.task}"><c:out value="${s.task}"/></option>
	</c:forEach>
	</Select>
</td>
<td>
	<Select name="activity">
	<c:forEach items="${state.activity}" var="a">
	 <option value="${a.activites}"><c:out value="${a.activites}"/></option>
	</c:forEach>
	</Select>
</td>
<td>
<Select name="hours">
<c:forEach begin="1" end="12" var ="i">
<option value="${s.prj}"><c:out value="${i}"/></option>
</c:forEach>
</Select>
</td>
<td>
	<input type = "text" name = "description"/>
</td>
</tr>
</table>
</form>
<center><input type ="submit" value = "submit"/></center>  
</body>

</html>