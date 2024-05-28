<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="graduation.project.vo.CustomerVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		if(document.fr.pass.value == ""){
			alert("비밀번호를 입력하세요! ");
			document.fr.pass.focus();
			return false;
		}
	}	

</script>
</head>
<body>
	<h1>WebContent/member/updateForm.jsp</h1>
	
	<%
	//세션값 제어
	String id = (String)session.getAttribute("id");
	
	if(id == null){
		response.sendRedirect("login.jsp");
	}
	
	//해당 회원의 모든 정보를 가져와서 화면에 출력
	CustomerVO user = new CustomerVO(); 
	
	%>
 
	<h2> 회원정보수정 </h2>
		<fieldset>
			<legend> 은행 회원정보 수정 </legend>
			<!--  아이디, 비밀번호, 이름, 전화번호, 주민번호 -->
			<form action="login.jsp" method="post" name="fr" onsubmit="return check();">
				아이디 : <input type="text" name="id" value="<%=user.getId()%>" readonly="readonly"><br>
				비밀번호 : <input type="text" name="pass" placeholder="비밀번호를 입력하시오." ><br>
				이름 : <input type="text" name="name" value="<%=user.getName()%>"><br>
				전화번호 : <input type="text" name="phone" value="<%=user.getPhone()%>"><br>
				주민번호 : <input type="text" name="register_num" value="<%=user.getRegister_num() %>" readonly="readonly"><br>
				
				<input type="submit" value="회원수정">
				<input type="reset" value="초기화">
			</form>
		
		</fieldset>
		
		

</body>
</html>