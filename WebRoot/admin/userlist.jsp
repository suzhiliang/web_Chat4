<%@ page contentType="text/html;charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		用户管理
	</title>
</head>
<link href="images/myStyleClass.css" rel="stylesheet" type="text/css">
<body>
		<div align="center">
	<table>
		<tr>
			<td>
				<img 
					src="<%=request.getContextPath()%>/images/logo2.jpg" 
					align="middle" 
					alt="<s:actionmessage key="image.adrlogo"/>"
				/>
			</td>
		</tr>
	</table>
	<hr>
</div> 
	<div align="center">
		<table width="80%" border="1" align="center">
			<tr align="right">
				<td colspan="3">
					<A href="adminindex.jsp">
						首页&nbsp;
					</A>
				</td>
			</tr>
			<tr align="center">
				<td colspan="3">
					用户管理
				</td>
			</tr>
			<tr align="center" bgcolor="#0099CC">
				<td width="25%">
					用户名
				</td>
				<td width="25%">
					性质
				</td>
				<td width="25%">
					编辑
				</td>
			</tr>
			<s:iterator value="users">
			<tr align="center">
				<td>
					<s:property value="username"/>
				</td>
				<td>
				<s:set var="gradeName" value="grade"/>
				<s:if test="#gradeName==0">普通用户</s:if>
				<s:elseif test="#gradeName==1">黑户</s:elseif>
				<s:else>VIP 用户</s:else>
				</td>
				<td>
  			
					<a href="<s:url action="Useredit"><s:param name="userNumber" value="userNumber"/></s:url>">
						编辑
					</a>
					
					
				</td>				
			</tr>
			</s:iterator>
			
		</table>
	</div>
	
</body>

