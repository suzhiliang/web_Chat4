<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		房间管理
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
		<table width="80%" border="1" align="center">
			<tr align="right">
				<td colspan="4">
				    <a href="adminindex.jsp">首页</a>
					<a href="roomadd.jsp">新建房间</a>
					<a href="<s:url action='admin/Roomlist'/>">房间列表</a>				
				</td>
			</tr>
			<tr align="center">
				<td colspan="4">
					房间管理
				</td>
			</tr>
			
			<tr align="center"  bgcolor="#0099CC" >
				<td width="25%" colspan="1">
					房名
				</td>
				<td width="25%" colspan="1">
					性质
				</td>
				<td width="40%" colspan="1">
					描述
				</td>
				<td width="15%" colspan="1">
					编辑
				</td>
				
			</tr>
		   <!-- 循环显示用户记录 -->
			<s:iterator value="rooms">
			 <tr align="center">
				<td width="25%" align="center">
					<s:property value="roomName"/>
				</td>
				<td width="25%">
				<s:set var="kindname" value="kind"></s:set>
					<s:if test="#kindname==1">临时</s:if>
					<s:else>公开</s:else>
				</td>
			    <td width="40%">
					<s:property value="description"/>
				</td>
			    <td width="15%">
					 <a href="<s:url action="Roomedit" ><s:param name="roomID" value="roomId"/></s:url>">
						编辑
					</a>
				</td>
			</tr>
			</s:iterator>	 
		</table>
		</s:form>	
	</div>		
		
</body>

