<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>project_git</title>
	<style>
		body { font-family: "맑은 고딕", sans-serif; background: #f5f7fa; margin: 0; padding: 0; }
		.wrap { max-width: 720px; margin: 80px auto; padding: 40px 48px; background: #fff;
			border-radius: 12px; box-shadow: 0 4px 24px rgba(0,0,0,0.06); }
		h1 { color: #2c5282; margin-top: 0; }
		.msg { padding: 16px 20px; background: #ebf8ff; border-left: 4px solid #3182ce;
			color: #2a4365; border-radius: 4px; }
		.meta { margin-top: 24px; color: #718096; font-size: 14px; }
	</style>
</head>
<body>
	<div class="wrap">
		<h1>Welcome to project_git</h1>
		<p class="msg">${message}</p>
		<p class="meta">Spring MVC + eGovFrame 4.1 / Tomcat</p>
	</div>
</body>
</html>
