<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 이체</title>
</head>
<body>
	<div align="center">
	<h2>계좌 이체</h2>
	<form action = "${pageContext.request.contextPath}/transfer" method="post">
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
	<hr>
	<form:form method="post" modelAttribute="accVO"	autocomplete="off">
    <table>
        <tr>
            <td><label>보내는 분 계좌번호 :</label></td>
            <td><form:input path="fromAccount" id="fromAccount" required="true" readonly="true" />${ accVO.accNo }</td>
        </tr>
        <tr>
            <td><label>받는 분 계좌번호 :</label></td>
            <td><form:input path="toAccount" id="toAccount" required="true" /></td>
        </tr>
        <tr>
            <td><label>보낼 금액 :</label></td>
            <td><form:input path="amount" id="amount" type="number" step="0.01" required="true"/></td>
        </tr>
        <tr>
            <td><label>거래 대상 :</label></td>
            <td><form:input path="name" id="name" type="text" step="0.01" required="true"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">이체하기</button>
            </td>
        </tr>
    </table>
    <c:if test="${not empty message}">
        <div class="message">
            ${message}
        </div>
    </c:if>
	</form:form>
	</div>
</body>
</html>