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
	<hr>
	<form:form method="post" modelAttribute="accVO"	autocomplete="off">
    <table>
        <tr>
            <td><label for="fromAccount">보내는 분 계좌번호 :</label></td>
            <td><form:input path="fromAccount" id="fromAccount" required readonly="true" />${ accVO.accNo }</td>
        </tr>
        <tr>
            <td><label for="toAccount">받는 분 계좌번호 :</label></td>
            <td><form:input path="toAccount" id="toAccount" required /></td>
        </tr>
        <tr>
            <td><label for="amount">보낼 금액 :</label></td>
            <td><form:input path="amount" id="amount" type="number" step="0.01" required/></td>
        </tr>
        <tr>
            <td><label for="name">거래 대상 :</label></td>
            <td><form:input path="name" id="name" type="text" step="0.01" required/></td>
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