<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test02.jsp</title>
<link rel="stylesheet" href="../resources/css/bootstrap.css" />
<!-- angularjs 로딩 시키기 -->
<script src="${pageContext.request.contextPath }/resources/js/angular.min.js"></script>
</head>
<!-- body에서 일어나는 일은 angular로 관리를 하겠다는 의미 -->
<body ng-app>
<%
	request.setAttribute("myName", "김구라");
	String[] friend={"cat","dog","elephant"};
	request.setAttribute("friends", friend);
%>
<div class="container">
	<p>내이름은 ${myName}</p>
	<c:forEach var="tmp" items="${friends }">
		<p>${tmp }</p>
	</c:forEach>
	<h1 ng-init="a='btn-primary'">클래스 속성 조작하기</h1>
	<input type="text" ng-model="b" /><br /> <!-- $scope.b라는 저장소가 생성   ato bind -->
	<button class="btn btn-primary">버튼1</button>
	<button class="btn {{a}}">버튼2</button>
	<button class="btn {{b}}">버튼3</button>
	<button ng-class="['btn', 'btn-primary']">버튼4</button>
	<button ng-class="{'btn':true, 'btn-primary':true}">버튼5</button>
	<br />
	<input type="checkbox" ng-model="isLarge" />
	<button class="btn btn-success" ng-class="{'btn-lg':isLarge}">버튼 6</button>
</div>
</body>
</html>