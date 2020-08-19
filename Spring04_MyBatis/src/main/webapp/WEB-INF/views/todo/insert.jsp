<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/insert.jsp</title>
</head>
<body>
<script>
	alert("${param.content} 내용이 추가됬습니다.")
	location.href="list.do"
</script>
</body>
</html>