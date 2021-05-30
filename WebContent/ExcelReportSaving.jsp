<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="Model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý thông tin khách hàng gửi tiết kiệm</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Xuất báo cáo</title>
   </head>
   <body>
      <h1>Danh sách khách hàng gửi TK quá hạn</h1>
	
	<table border=1 cellpadding="1"  cellspacing="1" bordercolor="gray" style="width: 100%;margin-top:25px">
		<thead>
			<tr>
				<th>Id</th>
				<th>Tên khách hàng</th>
				<th>Số chứng minh thư</th>
				<th>Số điện thoại</th>
				<th>Địa chỉ</th>
				<th>Email</th>
				<th>Số hợp đồng gửi</th>
				<th>Hình thức gửi</th>
				<th>Số tiền gửi</th>
				<th>Kỳ hạn</th>
				<th>Ngày phát hành</th>
				<th>Ngày hết hạn</th>
				<th>Trạng thái</th>
			</tr>
		</thead>
		<tbody>
		<%
            List<Customer_Saving> lstCus  = (List<Customer_Saving>)request.getAttribute("listCusGR");
                  if (lstCus != null) {
                      response.setContentType("application/vnd.ms-excel");
                      response.setHeader("Content-Disposition", "inline; filename="+ "Report-Customer-Saving.xls");
                  }
            %>
			<c:forEach var="cusg" items="${listCusGR}">
				<tr>
					<td><c:out value="${cusg.id }" /></td>
					<td><c:out value="${cusg.tenKH }" /></td>
					<td><c:out value="${cusg.soCMT }"></c:out></td>
					<td><c:out value="${cusg.sdt }"></c:out></td>
					<td><c:out value="${cusg.diaChi }"></c:out></td>
					<td><c:out value="${cusg.email }"></c:out></td>
					<td><c:out value="${cusg.soHD }"></c:out></td>
					<td><c:out value="${cusg.cauhinhgui.hinhThucGui }"></c:out></td>
					<td><c:out value="${cusg.soTien }"></c:out></td>
					<td><c:out value="${cusg.kyHan }"></c:out></td>
					<td><c:out value="${cusg.tuNgay }"></c:out></td>
					<td><c:out value="${cusg.denNgay }"></c:out></td>
					<td style="color:red">Quá hạn</td>			
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>