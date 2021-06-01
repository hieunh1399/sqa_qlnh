<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
		<div class="header" style="width:100%; height:100px;background-color:#EF3A23;text-align:center;padding-top:15px;font-size:40px">
		<a id ="logoutsubmit" href="<%=request.getContextPath()%>/logout" style="margin-left:1000px; font-size:15px">Logout</a>
			<span style="color:#FFFFFF">Trang chủ quản lý ngân hàng</span>
		</div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="width:100%">
			        <a  class="nav-link" style="color:#FFFFFF" href="<%=request.getContextPath()%>/listKHV">Danh sách khách hàng vay</a>
			        <a 	class="nav-link" style="color:#FFFFFF" href="<%=request.getContextPath()%>/listKHG">Danh sách khách hàng gửi TK</a>
			        <a 	class="nav-link" style="color:#FFFFFF" href="<%=request.getContextPath()%>/listCH">Cấu hình vay nợ</a>
			        <a 	class="nav-link" style="color:#FFFFFF" href="<%=request.getContextPath()%>/listCHG">Cấu hình gửi TK</a>
			        <a 	class="nav-link" style="color:#FFFFFF" href="<%=request.getContextPath()%>/customer-loan-report">Báo cáo vay nợ </a>
			        <a 	class="nav-link" style="color:#FFFFFF" href="<%=request.getContextPath()%>/customer-saving-report">Báo cáo gửi TK </a>
			</nav>
</div>