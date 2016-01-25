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
					src="<%=request.getContextPath()%>/images/logo2.jpg" 
					align="middle" 
					alt="<s:actionmessage key="image.adrlogo"/>"
				/>
			</td>
		</tr>
	</table>
	<hr>
</div> 
	<s:form action="Roomsave" >
		<table width="80%" border="1" align="center">
			<tr>
				<td align="center" bgcolor="#00CCFF">
					新增房间
				</td>
			</tr>
			<tr>
				<td align="center">
					房间名：
					<input type="text" name="roomName" size="15" maxlength="50">
					性质：
					<select size=1 name="kind">
						<option value="1">
							临时
						</option>
						<option value="0">
							公开
						</option>						
					</select>
					描述：
					<input type="text" name="description" size="40" maxlength="50">
					<input type="submit" name="Submit" value="提交">
				</td>
			</tr>
		</table>
	</s:form>
	
</body>

