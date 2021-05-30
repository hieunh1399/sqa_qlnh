<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="Model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý thông tin khách hàng vay nợ</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Xuất báo cáo</title>
   </head>
   <body>
      <h1>Danh sách khách hàng trả nợ quá hạn</h1>
	
	<table border=1 cellpadding="1"  cellspacing="1" bordercolor="gray" style="width: 100%;margin-top:25px">
		<thead>
			<tr>
				<th>Id</th>
				<th>Tên khách hàng</th>
				<th>Số chứng minh thư</th>
				<th>Số điện thoại</th>
				<th>Địa chỉ</th>
				<th>Email</th>
				<th>Số hợp đồng vay</th>
				<th>Hình thức vay</th>
				<th>Số tiền vay nợ</th>
				<th>Kỳ hạn</th>
				<th>Từ ngày</th>
				<th>Đến ngày</th>
				<th>Trạng thái</th>
			</tr>
		</thead>
		<tbody>
		<%
            List<Customer_Loan> lstCus  = (List<Customer_Loan>)request.getAttribute("listCusR");
                  if (lstCus != null) {
                      response.setContentType("application/vnd.ms-excel");
                      response.setHeader("Content-Disposition", "inline; filename="+ "Report-Customer-Loan.xls");
                  }
            %>
			<c:forEach var="cus" items="${listCusR}">
				<tr>
					<td><c:out value="${cus.id }" /></td>
					<td><c:out value="${cus.tenKH }" /></td>
					<td><c:out value="${cus.soCMT }"></c:out></td>
					<td><c:out value="${cus.sdt }" /></td>
					<td><c:out value="${cus.diaChi }" /></td>
					<td><c:out value="${cus.email }" /></td>
					<td><c:out value="${cus.soHD }"></c:out></td>
					<td><c:out value="${cus.cauhinhvay.hinhThucVay }"></c:out></td>	
					<td><c:out value="${cus.soTienVayNo }" /></td>
					<td><c:out value="${cus.kyHan }" /></td>
					<td><c:out value="${cus.tuNgay }" /></td>
					<td><c:out value="${cus.denNgay }" /></td>
					<td style="color:red">Quá hạn</td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>