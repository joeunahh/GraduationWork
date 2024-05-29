<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="graduation.project.vo.CustomerVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원정보 수정</title>
	

</head>
<body> 
		CustomerVO user = new CustomerVO();
	 <div style="padding: 20px;">
        
        <h3>회원정보 수정</h3>
        <hr />
        <form th:action="@{/member/update}" method="post">
        <!-- 아이디, 비밀번호, 이름, 전화번호, 주민번호 -->

            아이디: <input type="text" name="id" th:value="${user.getId}" readonly /> <br />
            비밀번호 : <input type="text" name="pwd" th:value="${user.getPwd}" /> <br />
            이름: <input type="text" name="name" th:value="${user.getName}" /> <br />
            전화번호 : <input type="text" name="phone" th:value="${user.getPhone}" /> <br />
            주민번호 : <input type="text" name="register_num" th:value="${user.getRegister_num}" /> <br />
            <input type="submit" value="수정" />
			</form>
		
		</fieldset>
	</div>
</body>
</html>