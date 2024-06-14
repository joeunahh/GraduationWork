<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>현재 계정 : ${ logVO.name }</h1>
	<c:if test="${ empty logVO }">
		<a href="${ pageContext.request.contextPath }/signUp">회원가입</a><br>
	</c:if>
	<c:if test="${ empty logVO }">
		<a href="${ pageContext.request.contextPath }/login">로그인</a><br>
	</c:if>
	<c:if test="${ not empty logVO }">
		<a href="${ pageContext.request.contextPath }/logout">로그아웃</a><br>
	</c:if>
	
	<c:if test="${ not empty logVO }">
		<a href="${ pageContext.request.contextPath }/updateForm">회원정보수정</a><br>
	</c:if> <!-- 연결 안됨 -->
	<c:if test="${ not empty logVO }">
		<a href="${ pageContext.request.contextPath }/deleteForm">회원탈퇴</a><br>
	</c:if> <!-- 연결 안됨 -->
	
	<c:if test="${ not empty logVO }">
		<br><a href="${ pageContext.request.contextPath }/accountOpen">계좌 개설</a>
	</c:if>
	<c:if test="${ not empty logVO }">
		<br><a href="${ pageContext.request.contextPath }/accountList">내 계좌 보기</a>
	</c:if>
	<c:if test="${ not empty logVO }">
<<<<<<< HEAD
		<a href="${ pageContext.request.contextPath }/transfer">계좌 이체</a><br>
	</c:if> <!-- 연결 안됨 -->
=======
		<br><a href="${ pageContext.request.contextPath }/accHistory">거래내역 한눈에 보기</a>
	</c:if>
>>>>>>> 1f162aa5e9f0a01092573c177074b984c87b86d2
</body>
</html>
