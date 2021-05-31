<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý thông tin cấu hình vay nợ</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="Admin/Menu.jsp"></jsp:include>
	<div class="container">
		<div class="header"
			style="width: 100%; height: 100px; text-align: center; padding-top: 25px; font-size: 30px">
			<span>Chi tiết cấu hình</span>
		</div>
		<div class="form-group" style="padding-top: 25px">
			<form action="editCH" method="post">
				<fieldset>
					 <input type="hidden"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.id}'/>" name="id" />
				</fieldset>
				<fieldset>
					<label>Hình thức vay:</label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.hinhThucVay }'/>" name="hinhThucVay" disabled="disabled"/>
				</fieldset>
				<fieldset>
					<label>Số tiền vay tối đa: </label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.soTienToiDa }'/>" name="soTienToiDa" />
						<a type="text" class="form-control" style="width:500px; height:30px">
						<fmt:formatNumber type = "number"
         				maxFractionDigits = "3" value = '${chv.soTienToiDa }'/> 
         				</a>
				</fieldset>
				<fieldset>
					<label>Thời hạn vay tối đa:</label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.thoiHan }'/>" name="thoiHan" />
				</fieldset>
				<fieldset>
					<label>Lãi suất/Tháng:</label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.laiSuat }'/>" name="laiSuat" />
				</fieldset>
				<fieldset>
					<label>Số tiền phải trả lãi vay:</label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.soTienPhaiTra }'/>"
						name="soTienPhaiTra" disabled="disabled"/>
				</fieldset>
				<fieldset>
					<label>Tổng số tiền phải trả: </label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.tong }'/>" name="tong" disabled="disabled" />
				</fieldset>
				<fieldset>
					<label>Đơn vị tiền tệ</label> <input type="text"
						class="form-control" style="width: 500px; height: 30px"
						value="<c:out value='${chv.donVi }'/>" name="donVi" disabled="disabled" />
				</fieldset>
				<div class="input-group-append">
					<button class="btn btn-outline-secondary" type="submit">Chỉnh
						sửa</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>