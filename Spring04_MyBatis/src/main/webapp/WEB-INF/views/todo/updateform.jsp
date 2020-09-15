<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/updateform.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h1>할일 수정 폼입니다.</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num }" />
		<div class="form-group">
			<label for="num">번호</label>
			<input type="text" id="num" class="form-control" value="${dto.num }" disabled/>
		</div>
		<div class="form-group">
			<label for="content">할일</label>
			<input type="text" id="content" name="content" class="form-control"
				value="${dto.content }" />
		</div>
		<input type="hidden" name="regdate" value="${dto.regdate }" />
		<div class="form-group">
			<label for="regdate">날짜</label>
			<input type="text" id="regdate" class="form-control" value="${dto.regdate }" disabled/>
		</div>
		<button type="submit" class="btn btn-primary">수정 확인</button>
		<button type="button" class="btn btn-danger" onclick="location.href='list.do'">취소</button>
	</form>
</div>
</body>
</html>