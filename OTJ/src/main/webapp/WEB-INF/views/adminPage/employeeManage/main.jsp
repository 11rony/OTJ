<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<style>
	body{
		 margin: 0; /* 기본 margin 제거 */
		 padding: 0; /* 기본 padding 제거 */
		 height: 100vh;
		 font-size
	}

	.wrap{
		display: grid;
		height:100%;
		grid-template-areas:
		      "header header"
		      "nav main";
		grid-template-columns: 200px 1fr;
		grid-template-rows:70px 1fr;
	}

	header{
	  grid-area: header;
	  border:1px solid red;
	  
	}
	
	nav{
	  border:1px solid blue;
	  grid-area: nav;     
	}
	
	.nav_list{
		display: flex;
		flex-direction: column;
		padding: 10px 20px 10px 20px;
	}
	.nav_item{
		margin-bottom: 10px;
	}
	
	main{
	  grid-area:  main;
	  border:1px solid black;  
	  padding:50px;
	}
	
	.content{
		border: 1px solid black;
		height: 100%;
		display: flex;
		flex-direction: column;
	}
	
	.search_requirement{
		border: 1px solid green;
		min-height : 220px;
	}
	
	.search_result{
		border: 1px solid red;
		min-height: 300px;
	}
	
	.result_table{
		width: 100%;
		text-align: center;
	}
</style>

<script>
	$(document).ready(function(){
		makelist()
		
	})

	makelist(var resultEmpBeans){
		
	}
</script>

<body>
	<div class="wrap">
		<header>
		
		</header>
		<nav>
			<div class="nav_list">
				<span class="nav_item">사원관리</span>
				<span class="nav_item">프로젝트관리</span>
			</div>
		</nav>
		<main>
			<div class="content">
				<div class="search_requirement">
					<form action="">
						<input type="text" />
						<select name="" id="">
							<option value="">선택</option>
							<c:forEach items="${searchDetailBeans}" var="searchDetailBean">
								<c:if test="${searchDetailBean.domain_cd=='RK01'}">
									<option value="">${searchDetailBean.detail_cd_nm}</option>
								</c:if>
							</c:forEach>
						</select>
						<select name="" id="">
							<option value="">선택</option>
							<c:forEach items="${searchDetailBeans}" var="searchDetailBean">
								<c:if test="${searchDetailBean.domain_cd=='SG01'}">
									<option value="">${searchDetailBean.detail_cd_nm}</option>
								</c:if>
							</c:forEach>
						</select>
						<input type="date" /> ~ <input type="date" />
						<c:forEach items="${searchDetailBeans}" var="searchDetailBean">
							<c:if test="${searchDetailBean.domain_cd=='WS01'}">
								${searchDetailBean.detail_cd_nm}<input type="checkbox" />
							</c:if>
						</c:forEach>	
						<button type="submit">조회</button>
						<button type="reset">초기화</button>			
					</form>				
				</div>
				<div class="search_result">
					<div class="result_nav">
						<span>검색결과:N/${totalList}</span>	
						<select name="" id="">
							<option value="">5개씩</option>
							<option value="">10개씩</option>
							<option value="">15개씩</option>
						</select>
					</div>
					<div class="result_content">
						<table class="result_table" style="border:1px solid black;">
							<tr>
								<th><input type="checkbox" /></th>
								<th>사원명</th>
								<th>입사일</th>
								<th>직급</th>
								<th>기술등급</th>
								<th>재직구분</th>
								<th>상세정보</th>
								<th>프로젝트</th>
							</tr>
							<c:forEach items="${resultEmpBeans}" var="resultEmpBean">
								<tr>
									<td><input type="checkbox" /></td>
									<td>${resultEmpBean.emp_name}</td>
									<td>${resultEmpBean.emp_enter_date}</td>
									<td>${resultEmpBean.rank_cd}</td>
									<td>${resultEmpBean.skill_rank_cd}</td>
									<td>${resultEmpBean.work_status_cd}</td>
									<td><button>상세정보</button></td>
									<td><button>프로젝트</button></td>				
								</tr>
							</c:forEach>
						</table>
					</div>
					<div class="result_extrabtn">
						<button>추가</button>
						<button>삭제</button>
					</div>
					<div>
					
					</div>
				</div>
			</div>
		</main>	
	</div>	
</body>
</html>