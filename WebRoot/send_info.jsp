<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ page import="java.util.*" %>
<%@ page import="com.szl.model.User"%>
<%@ page import="com.szl.interceptor.AuthenticationInterceptor" %>
<%
User user =(User)session.getAttribute(AuthenticationInterceptor.USER_SESSION_KEY);
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
	<HEAD>
	    <base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<TITLE>欢迎光临亮仔聊天室</TITLE>
<%--		<meta http-equiv="refresh" content="20;url=messageAction!send">--%>
	</HEAD>
	<BODY bgcolor="#DFFDFF">
	
	<BR>  
	<form name="form1" action="messageAction!send" method="post" target="_self">
		&nbsp;&nbsp;<%=user.getUsername() %> &nbsp;
		<input type="text" name="Content" size="30" maxlength="50">&nbsp;&nbsp;
		<input type="submit" name="sub" value="发言">&nbsp;&nbsp;
		<a href="messageAction!logout" target="_top">退出聊天室</a>
		<br>
		<br>
		&nbsp;&nbsp;对
		<select name="To">
		<option value="所有人" selected>所有人</option>
	<%
		//获取当前在线的用户信息
		//User user =(User)session.getAttribute(AuthenticationInterceptor.USER_SESSION_KEY);
        Hashtable roomKey = (Hashtable)application.getAttribute("roomKey");
      //使用roomKey对应的用户所对应的roomid作为用户list的键
		String userKey=(String)roomKey.get(user.getUsername());
		Hashtable userList = (Hashtable) application.getAttribute(userKey);
		Enumeration e = userList.elements();
		while(e.hasMoreElements())
		{
			String sInfo = (String) e.nextElement();
			int i = sInfo.indexOf("**");
			if(i != -1)
			{
				sInfo =sInfo.substring(0,i); 
			}
			out.println("<option value=\""+sInfo+"\">"+sInfo+"</option>");	
		}
	%>		
	</select>
	&nbsp;动作表情&nbsp;
	<select name="Action">
	<option value="" selected>无表情</option>
	<option value="微笑着">微笑</option>
	<option value="脸红红地">脸红</option>
	<option value="恶狠狠地">凶恶</option>
	<option value="依依不舍地">告别</option>
	<option value="热情地">打招呼</option>
	</select> 		
	</form>
	</BODY>
</HTML>
