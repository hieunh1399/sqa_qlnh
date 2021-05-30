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
			<span >Chi tiết khách hàng gửi</span>
		</div>
	<div class="form-group" style="padding-top:25px">
	<fieldset>
		<label>Tên khách hàng:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.tenKH }'/>" name="TenKH" disabled />
	</fieldset>
	
	<fieldset>
		<label>Số CMT:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.soCMT }'/>" name="SoCMT" disabled/>
	</fieldset>
	<fieldset>
		<label>Số điện thoại:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.sdt }'/>" name="SoDienTHoai" disabled/>
	</fieldset>
	<fieldset >
		<label>Địa chỉ:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.diaChi }'/>" name="TenKH" disabled/>
	</fieldset>
	<fieldset>
		<label>Email:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.email }'/>" name="Email" disabled/>
	</fieldset>
	<fieldset>
		<label>Số hợp đồng gửi:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.soHD }'/>" name="SoHopDongTK" disabled/>
	</fieldset>
	<fieldset>
		<label>Hình thức gửi:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.cauhinhgui.hinhThucGui }'/>"
			name="HinhThucTK" disabled/>
	</fieldset>
	<fieldset>
		<label>Số tiền gửi:</label> <input type="float" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.soTien }'/>" name="SoTienTK" disabled/>
	</fieldset>
	<fieldset>
		<label>Kỳ hạn:</label> <input type="text" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.kyHan }'/>" name="KyHan" disabled/>
	</fieldset>
	<fieldset>
		<label>Ngày phát hành:</label> <input type="date" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.tuNgay }'/>" name="NgayPhatHanh" disabled/>
	</fieldset>
	<fieldset>
		<label>Ngày hết hạn:</label> <input type="date" class="form-control" style="width:500px; height:30px"
			value="<c:out value='${cusg.denNgay }'/>"
			name="NgayHetHan" disabled />
	</fieldset>
	</div>
	</div>
</body>
</html>