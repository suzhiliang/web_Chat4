<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>欢迎光临亮仔聊天室</title>

	</head>
				<!-- 显示框架页 -->
				<FRAMESET  COLS="180,*">
					<FRAME SRC="user_info.jsp" NAME="User" noresize  frameborder=0 >								
					<FRAMESET ROWS="*,120">
						<FRAME SRC="display_info.jsp" NAME="Display" noresize frameborder=0 >
						<FRAME SRC="send_info.jsp" NAME="Send"  noresize frameborder=0>
					</FRAMESET>
				</FRAMESET>		
				<noframes>
					<BODY bgcolor="#DFFDFF">
					<H1>浏览器要求支持框架集</H1>
					</BODY>
				</noframes>
			
</html>
