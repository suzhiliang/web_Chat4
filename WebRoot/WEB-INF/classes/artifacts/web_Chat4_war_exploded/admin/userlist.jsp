<%@ page contentType="text/html;charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		�û�����
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
						��ҳ&nbsp;
					</A>
				</td>
			</tr>
			<tr align="center">
				<td colspan="3">
					�û�����
				</td>
			</tr>
			<tr align="center" bgcolor="#0099CC">
				<td width="25%">
					�û���
				</td>
				<td width="25%">
					����
				</td>
				<td width="25%">
					�༭
				</td>
			</tr>
			<s:iterator value="users">
			<tr align="center">
				<td>
					<s:property value="username"/>
				</td>
				<td>
				<s:set var="gradeName" value="grade"/>
				<s:if test="#gradeName==0">��ͨ�û�</s:if>
				<s:elseif test="#gradeName==1">�ڻ�</s:elseif>
				<s:else>VIP �û�</s:else>
				</td>
				<td>
  			
					<a href="<s:url action="Useredit"><s:param name="userNumber" value="userNumber"/></s:url>">
						�༭
					</a>
					
					
				</td>				
			</tr>
			</s:iterator>
			
		</table>
	</div>
	
</body>

