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
	let url = "<%= request.getContextPath() %>"
	let isIdAvailable = false
	let isPasswordMatched = false
	
	$(document).ready(function(){
		$('#signupBtn').click(function(event){
			if(!isIdAvailable){
				$('#idStatus').text('중복체크를 해주세요.').css('color', 'red')
				event.preventDefault()
				return
			}
			if(!isPasswordMatched){
                $('#passwordStatus').text('비밀번호가 일치하지 않습니다.').css('color', 'red')
                event.preventDefault()
                return
            }
		})
	})
	
	$('#pwd, #confirmPwd').on('keyup blur', function () {
		checkPwd()
	})
	
	let checkPwd = function(){
        if ($('#pwd').val().equals($('#confirmPwd').val())) {
            $('#passwordStatus').text('✔️ 비밀번호가 일치합니다.').css('color', 'green')
            isPasswordMatched = true
        } else {
            $('#passwordStatus').text('❌ 비밀번호가 일치하지 않습니다.').css('color', 'red')
            isPasswordMatched = false
        }
	}
	
	let checkId = function(){
		let id = $('#id').val()
		$.ajax({
			url : url + '/checkId?id=' + id,
			type : 'GET',
			dataType : 'json',
			success : function(result){
				console.log(result)
				if(result == true){
					$('#idStatus').text('✔️ 사용 가능한 아이디입니다.').css('color', 'green')
					isIdAvailable = true
				}else{
					$('#idStatus').text('❌ 이미 사용 중인 아이디입니다.').css('color', 'red')
					isIdAvailable = false
				}
			}, error : function(error, status, xhr){
				alert('중복체크중 오류가 발생했습니다.')
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
		<form:form id="signupForm" method="post" modelAttribute="customerVO" autocomplete="off">
			<table border="1" style="width: 30%">
				<tr>
					<th></th>
					<td align="right"><small class="txt">* 표시는 필수 항목입니다.</small></td>
				</tr>
				<tr>
					<th width="25%">아이디*</th>
					<td>
						<form:input path="id" id="id"/>
						<button  type="button" onclick="checkId()">중복 체크</button>
						<span id="idStatus"></span>
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
		            <th width="30%">비밀번호 확인*</th>
		            <td>
		                <input type="password" id="confirmPwd"/>
		                <span id="passwordStatus"></span>
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
			<button id="signupBtn" type="submit">가입</button><br>
		</form:form>
		<br>
		<button id="mainBtn">메인화면으로</button>
	</div>
</body>
</html>