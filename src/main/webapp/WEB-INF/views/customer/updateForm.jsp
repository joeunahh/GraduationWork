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
	 <div style="padding: 20px;">
        
        <h3>회원정보 수정</h3>
        <hr />
        <form th:action="@{/member/update}" method="post">

            아이디: <input type="text" name="id" th:value="${member.id}" readonly /> <br />
            이름: <input type="text" name="name" th:value="${member.name}" /> <br />
             <br />
            <input type="submit" value="수정" />
			</form>
		
		</fieldset>
	</div>
</body>
</html>