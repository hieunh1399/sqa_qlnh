<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Book Management</title>
<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>
<body id="page-top">
	<div id="wrapper">
		<!-- Sidebar -->
		<jsp:include page="Admin/Sidebar.jsp"></jsp:include>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<!-- Topbar -->
				<jsp:include page="Admin/Topbar.jsp"></jsp:include>
				
				<!-- Add book -->
				<div class="modal fade" id="addadminprofile" tabindex="-1"
					role="dialog" aria-labelledby="exampleModalLabel"
					aria-hidden="true">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">Chi tiết khách hàng</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<form action="code.php" method="POST">

								<div class="modal-body">

									<div class="form-group">
										<label> Name </label> <input type="text" name="username"
											class="form-control" placeholder="Enter Username">
									</div>
									<div class="form-group">
										<label>Instock</label> <input type="email" name="email"
											class="form-control checking_email" placeholder="Enter Email">
										<small class="error_email" style="color: red;"></small>
									</div>
									<div class="form-group">
										<label>Price</label> <input type="password" name="password"
											class="form-control" placeholder="Enter Password">
									</div>
									<div class="form-group">
										<label>Confirm Password</label> <input type="password"
											name="confirmpassword" class="form-control"
											placeholder="Confirm Password">
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-dismiss="modal">Close</button>
									<button type="submit" name="registerbtn"
										class="btn btn-primary">Save</button>
								</div>
							</form>
						</div>
					</div>
				</div>
				
				<!-- Table book -->
				<div class="container-fluid">
					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">List Book</h1>
					<button type="button" class="btn btn-primary" data-toggle="modal"
						data-target="#addadminprofile">Add Admin Profile</button>
					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-bordered" id="dataTable" width="100%"
									cellspacing="0">
									<thead>
										<tr>
											<th>Name</th>
											<th>Position</th>
											<th>Office</th>
											<th>Age</th>
											<th>EDIT</th>
											<th>DELETE</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Tiger Nixon</td>
											<td>System Architect</td>
											<td>Edinburgh</td>
											<td>61</td>
											<td>
												<button type="submit" class="btn btn-success">EDIT</button>
											</td>
											<td>
												<button type="submit" class="btn btn-danger">DELETE</button>
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript" src="vendor/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script type="text/javascript" src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script type="text/javascript" src="js/sb-admin-2.min.js"></script>
	<!-- Custom scripts for all pages-->
	<script type="text/javascript" src="js/sb-admin-2.js"></script>
	


</body>
</html>