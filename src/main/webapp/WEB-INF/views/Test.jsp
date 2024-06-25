<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<%-- EL을 사용하여 현재 컨텍스트 경로 출력 --%>
    <p>웹 애플리케이션의 루트 경로 (EL 사용): ${pageContext.request.contextPath}</p>

    <%-- 스크립트릿을 사용하여 현재 컨텍스트 경로 출력 --%>
    <%
        String contextPath = request.getContextPath();
    %>
    <p>웹 애플리케이션의 루트 경로 (스크립트릿 사용): <%= contextPath %></p>


</body>
</html>