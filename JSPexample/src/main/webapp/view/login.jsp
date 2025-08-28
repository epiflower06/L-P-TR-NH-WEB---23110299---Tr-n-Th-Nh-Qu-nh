<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Login</title>
</head>
<body>
	<form action="login" method="post">
		<h2>Tạo tài khoản mới</h2>
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<section>
			<label>Tài khoản</label> <input type="text" name="username"
				class="form-control" placeholder="Tài khoản" /> <label>Mật
				khẩu</label> <input type="password" name="password" class="form-control"
				placeholder="Mật khẩu" /> <input type="checkbox" name="remember">
			Ghi nhớ đăng nhập <br>

			<button type="submit">Đăng nhập</button>
		</section>
</body>
</html>