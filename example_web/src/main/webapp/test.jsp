<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
             你好:<%=request.getRemoteUser() %>  <br>
            usernamr:<%=request.getParameter("j_username") %>  <br>
             password:<%=request.getParameter("j_password") %>  <br>
	test ==== jvm0    jsp  <br>
		<jsp:include page="register.b.html" flush="true"/>
		  <%/*request.setAttribute("username", "includeUser");
		request.setAttribute("password", "includepass");
		*/%>
		<jsp:include page="doreg.b.html" flush="true" />
		<jsp:include page="index.html" flush="true"/>
	<%=request.getAttribute("hellword") %> <br>
	<%=request.getAttribute("async") %> <br>
	<li><a href="logout">LOGOUT</a></li>

</body>
</html>