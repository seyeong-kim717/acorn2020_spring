<<<<<<< HEAD
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
>>>>>>> refs/remotes/origin/irene
<%
	String name=request.getParameter("name");
	String addr=request.getParameter("addr");
	System.out.println(name+"|"+addr);
%>
{"isSuccess":true}