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
	
	$(document).ready(function(){
		$('#accListBtn').click(function(){
			location.href = "${ pageContext.request.contextPath }/accountList"
		})
	})
	
	$(document).ready(function(){
		$('#transferBtn').click(function(){
			location.href = "${ pageContext.request.contextPath }/transfer"
		})
	})
</script>
<style>
    table.history {
        width: 50%;
        border-collapse: collapse;
    }
    table.history th, table.history td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }
    table.history th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
	<div align="center">
		<h1>거래 내역 전체 조회</h1>
		<hr>
		<table class="history">
			<tr>
				<th width="15%">계좌 번호</th>
				<th width="10%">거래 날짜</th>				
				<th width="15%">거래자 명</th>				
				<th width="10%">분류</th>
				<th width="15%">거래 금액</th>
			</tr>
			<c:forEach items="${ historyAll }" var="his">
				<tr>
					<td>${ his.accNo }</td>
					<td>${ his.date }</td>
					<td>${ his.name }</td>
					<td>${ his.category }</td>
					<td>${ his.amount }</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<br><button id="mainBtn">메인페이지</button>
		<button id="accListBtn">내 계좌 보기</button>
	</div>
</body>
</html>