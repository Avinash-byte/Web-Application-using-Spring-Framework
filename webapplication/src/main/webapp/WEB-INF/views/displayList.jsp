<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.avinash.spring.webapplication.dto.Employee,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display List Of Object</title>
</head>
<body>
<%
List<Employee> employees=(List<Employee>)request.getAttribute("employees");
for(Employee e:employees){
	out.println(e.getId());
	out.println(e.getName());
	out.println(e.getSalary());
}
%>
</body>
</html>