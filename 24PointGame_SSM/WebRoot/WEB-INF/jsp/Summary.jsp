<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Summary.jsp</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<center>
		<h3>游戏历史记录数据</h3>
		<table border="2" width="80%" style="height: 23px; ">
			
			<c:forEach items="${resList}" var="res">
				

				<tr>
					<td><center>${res.resno}</center></td>
					<td><center>${res.str}</center></td>
					<td><center>${res.value}</center></td>
					<td><center>${res.result}</center></td>
				</tr>

			</c:forEach>
		</table>
</body>
</html>
