<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý cấu hình vay nợ</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<jsp:include page="Admin/Menu.jsp"></jsp:include>
	<div class="container">
		<div class="header" style="width:100%; height:100px;text-align:center;padding-top:25px;font-size:30px">
			<span>Quản lý cấu hình vay nợ</span>
		</div>
	
	<table border=1 style="width: 100%; border-collapse: collapse;margin-top:25px">
		<thead>
			<tr>
				<th>Id</th>
				<th>Hình thức vay</th>
				<th>Số tiền tối đa</th>
				<th>Thời hạn vay tối đa</th>
				<th>Lãi suất/Tháng</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${lstchv}">
				<tr>
					<td><c:out value="${c.id }" /></td>
					<td><c:out value="${c.hinhThucVay}" /></td>
					<td><c:out value="${c.soTienToiDa }"></c:out></td>
					<td><c:out value="${c.thoiHan }"></c:out></td>
					<td><c:out value="${c.laiSuat }"></c:out></td>
					<td> <a id = "detailCHV" href="<%=request.getContextPath()%>/chitietCH?id=<c:out value='${c.id}'/>">Xem chi tiết</a>&nbsp;&nbsp;				
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>