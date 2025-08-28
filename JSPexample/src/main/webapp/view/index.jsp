<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<!-- Gọi thanh menu -->
	<jsp:include page="topbar.jsp"></jsp:include>

	<h2>Chào mừng bạn đến với hệ thống!</h2>

	<c:if test="${sessionScope.account != null}">
		<p>
			Bạn đang đăng nhập với tài khoản: <b>${sessionScope.account.fullName}</b>
		</p>
	</c:if>
</body>
</html>