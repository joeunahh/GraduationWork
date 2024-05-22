<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('#mainBtn').click(function(){
			location.href = "${ pageContext.request.contextPath }"
		})
	})
</script>
<style>
	.error{
		color: red;
		font-size: 50%;
		font-weight: bold;
	}
</style>
</head>
<body>
	<div align="center">
		<h1>회원가입</h1>
		<hr>
		<form:form method="post" modelAttribute="customerVO">
			<table border="1" style="width: 30%">
				<tr>
					<th width="25%">아이디</th>
					<td>
						<form:input path="id"/>
						<form:errors path="id" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">비밀번호</th>
					<td>
						<form:password path="pwd"/>
						<form:errors path="pwd" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">이름</th>
					<td>
						<form:input path="name"/>
						<form:errors path="name" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">전화번호</th>
					<td>
						<form:input path="phone"/>
						<form:errors path="phone" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">주민번호</th>
					<td>
						<form:input path="register_num"/>
						<form:errors path="register_num" class="error"/>
					</td>
				</tr>
			</table>
			<br>
			<button type="submit" class="btn btn-outline-dark">가입</button><br>
		</form:form>
		<br>
		<button id="mainBtn" class="btn btn-outline-dark">메인화면으로</button>
	</div>
</body>
</html>