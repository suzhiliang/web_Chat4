<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		新增房间
	</title>
</head>
<link href="images/myStyleClass.css" rel="stylesheet" type="text/css">
<body>
	<div align="center">
	<table>
		<tr>
			<td>
				<img 
					src="<%=request.getContextPath()%>/images/logo2.gif" 
					align="middle" 
					alt="<s:actionmessage key="image.adrlogo"/>"
				/>
			</td>
		</tr>
	</table>
	<hr>
</div> 
	<s:form action="Roomupdate" >
	   <s:hidden name="room.roomId"/>
		<table width="80%" border="1" align="center">
			<tr>
				<td align="center" bgcolor="#00CCFF">
					编辑房间
				</td>
			</tr>
			<tr>
				<td align="center">			
					<s:textfield name="room.roomName" theme="simple" label="房间名："/>
					性质：
					<select size=1 name="room.kind">
						<option value="1">
							临时
						</option>
						<option value="0">
							公开
						</option>						
					</select>
				
					<s:textfield name="room.description" theme="simple" label="描述"/>
					<a href="<s:url action="Roomdelete" ><s:param name="roomID" value="room.roomId"/></s:url>">
					删除
					</a>
					<input type="submit" name="Submit" value="提交">
				</td>
			</tr>
		</table>
	</s:form>
	
</body>

