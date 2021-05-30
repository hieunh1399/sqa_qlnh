<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>User Management Application</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        <body>
</head>
<body>
	<div class="container" style="margin-top:200px; padding-left:320px">
		<c:if test="${mistake != null }">
		<div class="alert alert-danger" role="alert">
			<c:out value="${mistake}"></c:out>
		</div>
		</c:if>
		<form action="/SQA_QLNH/checklogin" method="post">
		<span>Tên đăng nhập :</span>
		<input type="text" name="username" class="form-control" 
		style="width:50%;margin-left:10%">
		<br>
		<c:if test="${mistakeP != null }">
		<div class="alert alert-danger" role="alert">
			<c:out value="${mistakeP}"></c:out>
		</div>
		</c:if>
		<span>Mật khẩu :</span>
		<input type="password" name="password" class="form-control" 
		style="width:50%;margin-left:10%">
		<br>
		<br>
		<button type="submit" class="btn btn-success" style="margin-left:30%">Đăng nhập</button>
		</form>
	</div>
</body>
</html>