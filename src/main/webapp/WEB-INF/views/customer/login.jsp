<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script>
	let checkForm = function(){
		let f = document.loginForm
		let id = f.id
		let pwd = f.pwd
		
		if(id.value === ''){
			alert('아이디를 입력하세요.')
			id.focus()
			return false
		}else if(pwd.value === ''){
			alert('비밀번호를 입력하세요.')
			pwd.focus()
			return false
		}
		return true
		})
	})
}
</script>
</head>
<body>
	<div align="center">
		<h1>로그인</h1>
		<hr>
		<form method="post" onsubmit="return checkForm()" name="loginForm" autocomplete="off">
			<table border="1">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd"></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="로그인">
		</form>
	</div>
</body>
</html>