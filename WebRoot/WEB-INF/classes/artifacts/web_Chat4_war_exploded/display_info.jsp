<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ page import="java.util.*" %>
<%@ page import="com.szl.model.User" %>
<%@ page import="com.szl.interceptor.AuthenticationInterceptor" %>
<%
User user =(User)session.getAttribute(AuthenticationInterceptor.USER_SESSION_KEY);
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta  http-equiv =refresh content= "5">
<title>欢迎光临亮仔聊天室</title>
</head>
<BODY bgcolor="#DFFDFF">
<h1 align="center">欢迎 <font color="#0000FF"><%=user.getUsername() %></font> 光临亮仔聊天室</h1>
<hr>

<%  
    
    Hashtable roomKey = (Hashtable)application.getAttribute("roomKey");
    String chatKey=(String)roomKey.get(user.getUsername())+"chatKey";
	//获取所有聊天信息
	Vector vChat =(Vector) application.getAttribute(chatKey);
	if (vChat != null)
	{ 
		//显示所有聊天信息
		Object[] objWords = vChat.toArray();
		int iLen=objWords.length;
		for (int i=iLen-1;i>=0;i--) 
		{
			out.println(objWords[i]);
		}
	}
%>

</body>
</html>
