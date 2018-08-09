<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login for Example</title>
</head>
<body bgcolor="white">
	<br>
	<% java.util.Map errors =zcu.xutil.web.Webutil.getError(request); %>
	<br>
	<form method="POST" action='<%=response.encodeURL("login.jsp")%>'>
		<table>
			<tr>
				<th align="right">Username:</th>
				<td align="left"><input type="text" name="j_username"></td>
			</tr>
			<tr>
				<th align="right">Password:</th>
				<td align="left"><input type="password" name="j_password"></td>
				<td align="center"><%=errors.get("j_password")%></td>
			</tr>
			<% 
				if(request.getAttribute("xweb_captcha_required")!=null){
			%>
			<tr>
				<th align="right">Captcha</th>
				<td align="left"><input type="text" name="j_captcha"></td>
				<td align="center"><%=errors.get("j_captcha")%></td>
				<td align="right">	
					<img src="captcha.gif" style="vertical-align: middle;"	title="看不清 notsee"	onclick="this.src='captcha.gif?'+Math.random();" />
				</td>
			</tr>
			<%} %>
			<tr>
				<td align="right"><input type="submit" value="Log In"></td>
				<td align="left"><input type="reset"></td>
			</tr>
		</table>
	</form>

</body>
</html>