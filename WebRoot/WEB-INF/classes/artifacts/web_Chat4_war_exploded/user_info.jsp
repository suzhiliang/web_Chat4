<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ page import="java.util.*" %>
<%@ page import="com.szl.model.User"%>
<%@ page import="com.szl.interceptor.AuthenticationInterceptor" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%!
	//定义变量
	int iUserNum = 0;
	String sUserName = null;
	
	String sSex = null;
	String sInfo = null;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
	<HEAD>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<meta http-equiv="refresh" content="5" >
	
	<TITLE>欢迎光亮仔聊天室</TITLE>
	</HEAD>
	<BODY bgcolor="#DFFDFF">
	<%
	    User user =(User)session.getAttribute(AuthenticationInterceptor.USER_SESSION_KEY);
        Hashtable roomKey = (Hashtable)application.getAttribute("roomKey");
    	//使用roomKey对应的用户所对应的roomid作为用户list的键
		String userKey=(String)roomKey.get(user.getUsername());
		//获取Hashtable对象信息
		Hashtable userList = (Hashtable)application.getAttribute(userKey);
		Enumeration e = userList.elements();
		//获取在线人数
		iUserNum=userList.size();
	%>
	<div align=center>
	[<A href="messageAction!userinfo" target="_self">刷新用户列表</A>]
	</div>
	<BR>
	在线人数：<font color="#FF0000"><%= iUserNum %></font>&nbsp;人
	<HR>
	<% 
		//循环显示所有在线用户的信息
		while(e.hasMoreElements())
		{
			//获取某个用户的信息
			sInfo = (String) e.nextElement();
			//获取用户名
			int i = sInfo.indexOf("**");
			if(i != -1)
			{
				sUserName = sInfo.substring(0,i);
				sInfo =sInfo.substring(i+2); 
			}
			//获取性别		
			i = sInfo.indexOf("***");
			if(i != -1)
			{
				sSex = sInfo.substring(0,i);
				sInfo =sInfo.substring(i+3); 
			}
				
	%>
	<!-- 根据性别显示相应图片 -->
	<img src="images/
	<% if (sSex.equals("男"))out.print("gg"); else out.print("mm");%>.gif">
	<font color="#0000FF" size="2"><%= sUserName%></font>
	<br>
	<%  
		 }
	%>
	</BODY>
</HTML>
