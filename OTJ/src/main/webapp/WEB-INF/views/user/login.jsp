<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var='root' value="${pageContext.request.contextPath }/"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INNOBL사원관리 : 로그인</title>

<style>
body{
	height: 100%;
}

.logo_panel{
}

.logo_panel .main_logo{
	font-size:50px;
	color:red;
	margin-bottom: 10px;
}

.logo_panel .sub_logo{
	margin: 5px;
}


.login_panel {
	padding: 20px 28px;
	border: 1px solid #c6c6c6;
	border-radius: 6px;
	display: inline-block;
}

.id_pw_wrap {
	display: flex;
    flex-direction: column;
    box-sizing: border-box;
    width : 390px;
    height: 80px;
}

.id_pw_wrap .input_row{
	border:1px solid black;
	height: 50%;
	padding: 10px;
}

.id_pw_wrap #pw_line{
	margin-top: -1px;
}

.id_pw_wrap .input_text{
	width:100%;
	border:none;
}

.id_pw_wrap .input_text:focus{
	outline:none;
}


.input_panel .login_button_wrap{
	width:390px;
	height: 50px;
	border:1px solid black;
	box-sizing: border-box;
	margin-top: 50px;
}

.input_panel .login_button_wrap #login_btn{
	width:100%;
	height: 100%;
	border:none;
	spadding:0;
}



</style>

</head>
<body>
	<div class="logo_panel">
		<h1 class="main_logo">
			INNOBL
		</h1>
		<h1 class="sub_logo">
			사원관리시스템
		</h1>
	</div>
	<div class="login_panel">
		<form:form action="${root}user/login_pro" method="post" modelAttribute="tempLoginEmployeeBean">
			<div class="input_panel">
				<div class="id_pw_wrap">
					<div class="input_row" id="id_line">
						<form:input path="emp_id" class="input_text" placeholder="아이디"/>
					</div>
					<div class="input_row" id="pw_line">
						<form:input path="emp_pw" class="input_text" placeholder="비밀번호"/>
					</div>
				</div>
				<div class="login_error_wrap" id="err_empty_id">
					<form:errors path="emp_id" style="color:red"/>
				</div>
				<div class="login_error_wrap" id="err_empty_pw">
					<form:errors path="emp_pw" style="color:red"/>
				</div>
				<div class="login_error_wrap" id="err_login">
					<c:choose>
						<c:when test="${loginFail==true}">
							아이디와 비밀번호를 확인해주세요
						</c:when>
					</c:choose>
				</div>
						
				<div class="login_button_wrap">
					<form:button type="submit" id="login_btn">
						<span id="btn_text">로그인</span>
					</form:button>
				</div>			
			</div>
		</form:form>
	</div>
</body>
</html>