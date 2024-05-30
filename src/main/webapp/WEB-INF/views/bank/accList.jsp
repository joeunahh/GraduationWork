<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 계좌 보기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('#mainBtn').click(function(){
			location.href = "${ pageContext.request.contextPath }"
		})
	})
</script>
<style>
    table.account {
        width: 50%;
        border-collapse: collapse;
    }
    table.account th, table.account td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }
    table.account th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
	<div align="center">
		<h1>내 계좌 보기</h1>
		<hr>
		<table class="account">
			<tr>
				<th width="10%">예금주</th>
				<th>계좌 번호</th>
				<th width="15%">계좌 이름</th>
				<th width="8%">잔액</th>
				<th width="25%">개설일</th>				
			</tr>
			<c:forEach items="${ account }" var="acc">
				<tr>
					<td>${ acc.name }</td>
					<td>${ acc.accNo }</td>
					<td>${ acc.accName }</td>
					<td>${ acc.balance }</td>
					<td>${ acc.date }</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<button id="mainBtn">메인페이지</button>
	</div>
</body>
</html>