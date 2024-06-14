<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>계좌 이체</h2>
	<form action="${pageContext.request.contextPath}/transfer" method="post">
		<div> 
			<label for="fromAccount">보내는 분 계좌번호 :</label>
			<input type="text" id="fromAccount" name="fromAccount" required>
		</div>
		<div>
			<label for="toAccount">받는 분 계좌번호 :</label>
			<input type="text" id="toAccount" name="toAccount" required>
		</div>
		<div>
			<label for="amount">보낼 금액 : </label>
			<input type="number" id="amount" name="amount" step="0.01" required>
		</div>
		<div>
			<button type="submit">Transfer</button>
		</div>
		<c:if test="${not empty message}">
			<div class="message">
				${message}
			</div>
		</c:if>
	</form>
</body>
</html>