<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/javaweb/productServlet?cmd=input">进入新增界面</a><br/>
	<table cellpadding="10" cellspacing="0" border="1" width="1200px" style="text-align: center;">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>年龄</th>
			
		</tr>	
		<c:forEach items="${list}" var="user" varStatus="vs">
			<tr>
				<td>${vs.count}</td>
				<td>${user.username}</td>
				<td>${user.age}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>