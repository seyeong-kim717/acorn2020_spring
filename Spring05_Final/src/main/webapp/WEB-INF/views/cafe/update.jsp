<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/cafe/update.jsp</title>
=======
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/cafe/update.js</title>
>>>>>>> refs/remotes/origin/irene
</head>
<body>
<script>
	alert("글을 수정했습니다.");
	location.href="${pageContext.request.contextPath }/cafe/detail.do?num=${param.num}";
</script>
</body>
</html>