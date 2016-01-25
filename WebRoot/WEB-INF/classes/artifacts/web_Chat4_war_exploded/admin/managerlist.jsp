<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		管理员列表
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
	<!-- 配置房间列表action -->
		<s:form action="Roomlist" >	
		<table width="75%" border="1" align="center">
			<tr align="right">
				<td colspan="4">
				    <a href="adminindex.jsp">首页</a>			
				</td>
			</tr>
			<tr align="center"  bgcolor="#0099CC" >
				<td width="25%" colspan="1">
					管理员名称
				</td>
				<td width="25%" colspan="1">
				          联系电话
				</td>
				<td width="25%" colspan="1">
					QQ
				</td>
				
			</tr>
		   <!-- 循环显示管理员记录记录 -->
			<s:iterator value="managers">
			 <tr align="center">
				<td width="25%" align="center">
					<s:property value="managerName"/>
				</td>
			    <td width="25%" align="center">
				   <s:property value="phone"/>
				</td>
			    <td width="25%" align="center">
					   <s:property value="QQ"/>
				</td>
			</tr>
			</s:iterator>	 
		</table>
		</s:form>	
	</div>		
		
</body>

