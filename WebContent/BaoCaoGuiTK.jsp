<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý thông tin khách hàng vay nợ</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<jsp:include page="Admin/Menu.jsp"></jsp:include>
	<div class="container">
		<div class="header" style="width:100%; height:100px;text-align:center;padding-top:25px;font-size:30px">
			<span	>Danh sách khách hàng gửi TK quá hạn</span>
		</div>
	<div class="main-content">
		<form action="searchKHV" method=GET style="margin-top:25px">
			<div class="input-group mb-3" >
				<input type="text" class="form-control" name="key" placeholder="Nhap so hop dong">
			<div class="input-group-append">
				<button class="btn btn-outline-secondary" type="Submit">Search</button>
			</div>
			</div>
		</form>
	
	<form action="excel-report-saving" method="post">
	<table border=1 style="width: 100%; border-collapse: collapse;margin-top:25px">
		<thead>
			<tr>
				<th>Id</th>
				<th>Tên khách hàng</th>
				<th>Số chứng minh thư</th>
				<th>Số hợp đồng gửi</th>
				<th>Hình thức gửi</th>
				<th>Trạng thái</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cusg" items="${listCusGR}">
				<tr>
					<td><c:out value="${cusg.id }" /></td>
					<td><c:out value="${cusg.tenKH }" /></td>
					<td><c:out value="${cusg.soCMT }"></c:out></td>
					<td><c:out value="${cusg.soHD }"></c:out></td>
					<td><c:out value="${cusg.cauhinhgui.hinhThucGui }"></c:out></td>
					<td style="color:red">Quá hạn</td>		
					<td> <a href="<%=request.getContextPath()%>/chitietKHG?id=<c:out value='${cusg.id}'/>">Xem chi tiết</a>&nbsp;&nbsp;
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
	<div class="input-group-append">
				<button class="btn btn-outline-secondary" type="submit">Xuất báo cáo</button>
	</div>
	</form>
	</div>
	</div>	
</body>
</html>