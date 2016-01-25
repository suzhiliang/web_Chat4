<%@ page contentType="text/html; utf-8" language="java"%>
<%@ page import="java.util.*" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<TITLE>欢迎光临风沙聊天室</TITLE>
</HEAD>
<% 
	//使当前session失效
	session.invalidate();
%>
<BODY bgcolor="#DFFDFF">
<h1 align="center">欢迎下次光临</h1>
<p align="center"><input type="button" name="btn" value="关闭窗口" onClick="javascript:window.close()"></p>
</BODY>
</HTMl>