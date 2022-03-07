<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<title>'24 PointGame' page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- <script type="text/javascript" src="js/ajaxRequest.js"></script>  -->

</head>
<body>
	<center>
		<form action="/24PointGame_SSM/GameController/PlayGame" method="post"
			name="myform">
			<br>24点游戏<br>
			<br /> 请输入一组数，中间用逗号隔开： <br />
			<br /> <input type="text" id="str" value="" name="str" /><br /> <br />
			<br /> 请输入value值： <br />
			<br /> <input type="text" id="value" value="" name="value" /> <br />
			<br />
			<br /> <input type="button" value="计算" /> <input type="reset"
				value="清除" /> <br>
			<hr>

		</form >
		<form action="/24PointGame_SSM/GameController/SelectAllResult" 
			name="myform2">
			结果是：<br> <input type="text" name="result" id="result"><br />
			<a href="http://localhost:8080/24PointGame_SSM/Summary.jsp"> <input
				type="submit" value="汇总"></a>
		</form>
		<br>
	</center>
</body>
</html>
















