<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WebContent/member/updatePro.jsp</h1>

	<%
		//한글처리 (form태그 정보를 post방식 전달)
		request.setCharacterEncoding("UTF-8");
	
	%>
	
	<jsp:setProperty property="*" name="mb" />
	<%
		//System.out.println("수정할 데이터: " + mb);
		//MemberVO user = new MemberVO();
		//int result = user.updateMember(user);
	
	%>
	

</body>
</html>