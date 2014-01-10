<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="time" scope="application" class="time.TimeBean"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Example: current time</title>
</head>
<body>
	<h1><jsp:getProperty property="time" name="time"/></h1>
</body>
</html>