<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>거래 내역</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('#mainBtn').click(function(){
			location.href = "${ pageContext.request.contextPath }"
		})
	})
</script>
</head>
<body>
	<div align="center">
		<h1>거래 내역</h1>
		<hr>
		<table>
			<tr>
				<th width="25%">거래 날짜</th>				
				<th width="10%">거래자 명</th>				
				<th width="20%">분류</th>
				<th width="15%">거래 금액</th>
			</tr>
			<c:forEach items="${ history }" var="his">
				<tr>
					<td>${ his.date }</td>
					<td>${ his.name }</td>
					<td>${ his.category }</td>
					<td>${ his.amount }</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<button id="mainBtn">메인페이지</button>
	</div>
</body>
</html>