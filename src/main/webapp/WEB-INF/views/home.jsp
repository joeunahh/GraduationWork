<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<a href="${ pageContext.request.contextPath }/signUp">회원가입</a><br>
	<c:if test="${ empty logVO }">
		<a href="${ pageContext.request.contextPath }/login">로그인</a><br>
	</c:if>
	<c:if test="${ not empty logVO }">
		<a href="${ pageContext.request.contextPath }/logout">로그아웃</a>
	</c:if>
</body>
</html>
