<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
.aaa {
	color: red;
}
</style>
</head>
<body>
	<h1>Form người dùng</h1><br/>
	<c:url value="/hello/them-nguoi-dung" var="urlAddUser"/>
	<form:form modelAttribute="userDTO" method="post" action="${urlAddUser }">
		<form:hidden path="id" class="aaa" />
		Name <form:input path="name" /><br/>
		<form:errors path="name" class="aaa"/><br/>
		Password <form:password path="password" /><br/>
		<form:errors path="password" class="aaa"/><br/>
		So thich <br/>
		<form:checkbox path="soThich" value="dua xe" label="Đua xe"/><br/>
		<form:checkbox path="soThich" value="nghe nhac" label="Nghe nhạc"/><br/>
		<form:checkbox path="soThich" value="xem phim" label="Xem phim"/><br/>
		
		Gioi tinh
		<form:select path="gender"><br/>
			<form:option value="Nam">Nam</form:option>
			<form:option value="Nu">Nu</form:option>
		</form:select>
		<br/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>