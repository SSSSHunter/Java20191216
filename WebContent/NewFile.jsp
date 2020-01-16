<%@page import="java.util.ArrayList"%>
<%@page import="com.woniuxy.entiy.User"%>
<%@page import="java.util.List"%>
<%@page import="com.woniuxy.entiy.Test"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="qwer"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
测试：<%=session.getAttribute("Session名称") %>
<%
	request.setAttribute("s.a", "test");
	application.setAttribute("BBB", "QWER");
	session.setAttribute("AAA", "QQQ");
	request.setAttribute("nihao", new Test(1,2));

%>
${requestScope["s.a"] }
${applicationScope.BBB}
${sessionScope.AAA }
${request.nihao}
${header.Host}

<form action="Test">
	<input type="text" name="userName"/>
	<input type="text" name="userName"/>
	<input type="submit" value="提交	"/>



</form>
<%int a = 5;  %>
<%int v = 6;  %>
<%
	request.setAttribute("a", a);
	request.setAttribute("v", v);

%>
<qwer:if test="${requestScope.a<requestScope.v }">
	${requestScope.a }
</qwer:if>
<qwer:choose>
	<qwer:when test="${requestScope.a<requestScope.v }">
	
	小
	</qwer:when>
	<qwer:when test="${requestScope.a>requestScope.v }">
	大
	
	</qwer:when>
</qwer:choose>


<%
List<User> l = new ArrayList<User>();
l.add(new User("admin1","11111"));
l.add(new User("admin2","11111"));
l.add(new User("admin3","11111"));
l.add(new User("admin4","11111"));
l.add(new User("admin5","11111"));
request.setAttribute("jihe", l);
%>
<qwer:forEach items="${requestScope.jihe }" var="asd">
${asd.userName}



</qwer:forEach>

</body>
</html>