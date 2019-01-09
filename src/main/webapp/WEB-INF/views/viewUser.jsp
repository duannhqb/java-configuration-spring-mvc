<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thong tin người dùng</h1><br/>
	<p>ID: ${user.id }</p><br/>
	<p>Name: ${user.name }</p><br/>
	<p>Password: ${user.password }</p><br/>
	<p>soThich: </p>
	<c:forEach items="${user.soThich }" var="item">
		${item }
	</c:forEach>
	<br/>
	<p>gender: ${user.gender }</p>
</body>
</html>