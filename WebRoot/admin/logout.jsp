<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="java.util.*" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<TITLE>欢迎光临聊天室</TITLE>
</HEAD>
<% 
	//获取当前用户信息
	String sUserName = (String) session.getAttribute("UserName");
	String sNickName = (String) session.getAttribute("NickName");
	//获取在线用户信息
	Hashtable userList = (Hashtable) application.getAttribute("userList");
	//在线用户列表删除当前用户
	userList.remove(sUserName);            
	//更新用户application中的列表
	application.setAttribute("userList",userList);
	//发消息表明当前用户已经离开聊天室
	Vector vChat = (Vector) application.getAttribute("vChat");	
	String slogout = "<font color=red>"+sNickName+"</font> 离开了聊天室！<br>";
	vChat.add(slogout);
	//使当前session失效
	session.invalidate();
%>
<BODY bgcolor="#DFFDFF">
<h1 align="center">欢迎下次光临</h1>
<p align="center"><input type="button" name="btn" value="关闭窗口" onClick="javascript:window.close()"></p>
</BODY>
</HTMl>