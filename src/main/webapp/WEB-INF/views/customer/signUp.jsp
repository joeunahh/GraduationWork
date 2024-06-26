<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
	var url = "<%= request.getContextPath() %>"
	let checkId = function(id){
		console.log(id)
		$.ajax({
			url : url + '/checkId',
			type : 'POST',
			data : { id: id },
			dataType : 'json',
			success : function(result){
				console.log(result)
				if(result === true){
					alert('사용가능한 아이디입니다.')
				}else{
					alert('이미 사용중인 아이디입니다.')
				}
			}, error : function(){
				alert('아직 개발중입니다.')
			}
		})
	}
</script>
<style>
	.error, .txt{
		color: red;
		font-size: 50%;
		font-weight: bold;
	}
</style>
</head>
<body>
	<div align="center">
		<h1>회원가입</h1>
		<hr>
		<form:form method="post" modelAttribute="customerVO" autocomplete="off">
			<table border="1" style="width: 30%">
				<tr>
					<th></th>
					<td align="right"><small class="txt">* 표시는 필수 항목입니다.</small></td>
				</tr>
				<tr>
					<th width="25%">아이디*</th>
					<td>
						<form:input path="id" name="id"/>
						<button onclick="checkId(id)">중복 체크</button>
						<form:errors path="id" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">비밀번호*</th>
					<td>
						<form:password path="pwd"/>
						<form:errors path="pwd" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">이름*</th>
					<td>
						<form:input path="name"/>
						<form:errors path="name" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">전화번호*</th>
					<td>
						<form:input path="phone"/>
						<form:errors path="phone" class="error"/>
					</td>
				</tr>
				<tr>
					<th width="25%">주민번호*</th>
					<td>
						<form:input path="register_num"/>
						<form:errors path="register_num" class="error"/>
					</td>
				</tr>
			</table>
			<br>
			<button type="submit">가입</button><br>
		</form:form>
		<br>
		<button id="mainBtn">메인화면으로</button>
	</div>
</body>
</html>