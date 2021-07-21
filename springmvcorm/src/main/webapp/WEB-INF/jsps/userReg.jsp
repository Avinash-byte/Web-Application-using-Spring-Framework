<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
$("#id").change(function(){
	$.ajax(
			{
				url:"validateEmail",
				data:{id:$("#id").val()},
				success:function(responseText){
				$("#errMsg").text(responseText);
				if(responseText!=null){
					$("#id").focus();
				}
				}
			});
});	
});
</script>
<title>Registration</title>
</head>
<body>
<form action="registerUser" method="post">
<pre>
ID:<input type="text" name="id" id="id"/><span id="errMsg"></span>
Name:<input type="text" name="name"/>
Email:<input type="text" name="email"/>
<input type="submit" name="submit"/>
</pre>
</form>
</br>${result }
</body>
</html>