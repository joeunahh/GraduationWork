<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개좌 개설</title>
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
		<h1>개좌 개설</h1>
		<hr>
		<form:form method="post" modelAttribute="accVO">
			<table border="1" style="width: 30%">
				<tr>
					<th width="25%">이름</th>
					<td>
						<form:input path="name" readonly="true" />
					</td>
				</tr>
				<tr>
					<th width="25%">비밀번호</th>
					<td>
						<form:password path="accPwd" name="pwdCheck"/>
						<form:errors path="accPwd" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">계좌 별명<br>
						<small>별명은 선택입니다.</small>
					</th>
					<td>
						<form:input path="accName"/>
					</td>
				</tr>
			</table>
			<br>
			<button type="submit" class="btn btn-outline-dark">개설</button><br>
		</form:form>
		<br><button id="mainBtn" class="btn btn-outline-dark">메인 화면</button>
	</div>
</body>
</html>