<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>
	<div class="col-lg-8">
		<form:form modelAttribute="p" action="${pageContext.request.contextPath}
			/product/register" method="post"></div>
		<form:hidden path="productNum" />
		
	<div class="col-lg-6 mb-4">
		<label for="light-300"><b>가입 대상</b></label>
		<form:radiobutton path="productTarget" value="0" label="개인" />
		<form radiobutton path="productTarget" value="1" label="법인" />
	</div>
	<div class="col-lg-6 mb-4">
		<div class="form-floating">
			<form:input path="productName" type="text" class="form-control form-control-lg light-300"/>
			<form label for="light-300" path="productName">상품명 : </form>			
		</div>
	</div>
	<div class="col-lg-6 mb-4">
		<div class="form-floating">
			<form:textarea class="form-control form-control-lg light-300" style="height:120px" path="description" /> 
			<form:label for="light-300" path="description">상품 설명 : </form:label>	
		</div>
	</div>
	<div class="col-lg-6 mb-4">
		<div class="form-floating">
			<form:input class="form control form-control-lg light-300" path="interestRate" />
			<form:label for="light-300" path="interestRate">금리(%):</form:label> 
		</div>
	</div>
	<div class="col-lg-6 mb-4">
		<div class="form-floating">
			<form:input class="form-control form-control-lg light-300" path="initialDeposit" />
			<form:label for="light-300" path="initialDeposit">초기 가입금액(원): </form:label>
		</div>
	</div>
	<div class="col-lg-6 mb-4">
		<div class="form-floating">
			<form:input class="form-control form-control-lg light-300" path="dateOfDeposit" />
			<form:label for="light-300"  path="dateOfDeposit">가입 기간(개월):</form:label>
		</div>
	</div>
	<div class="col-lg-6 mb-4">
		<form:label for="light-300" path="available"><p>신규 가입 가능 여부: </p></form:label>
		<form:radiobutton path="available" value="1" label="가능" />
		<form:radiobutton path="available" value="0" label="불가능" />
	</div>
		<button type="submit" class="btn btn-secondary rounded-pill px-md-5 px-4 py-2 radius-0 text-light light-300">등록하기</button>
           	</form:form>
	</div>
		

</body>
</html>