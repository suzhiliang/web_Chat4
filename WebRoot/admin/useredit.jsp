<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>修改用户</title>
</head>

<link href="images/myStyleClass.css" rel="stylesheet" type="text/css">

<body>
	
	<s:form action="Userupdate" method="post">
		<s:hidden name="user.userNumber" />
		<table width="60%" border="1" align="center">
			<tr>
				<td colspan="2" align="center">
					<A href="javascript:history.go(-1);"> 返回上一页 </A>
				</td>
			</tr>
			<tr>
				<td width="70%">
				  <!-- 隐藏主键不能被修改 -->
				
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="user.username" label="用户"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="user.password" label="密码"></s:textfield>
				</td>
			</tr>
		
			<tr>
				<td>
					<s:radio list="{'男','女'}" name="user.sex"  value="user.sex" label="性别" ></s:radio>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="user.email" label="email"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="user.qq" label="QQ"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="user.signature" label="介绍"></s:textfield>
				</td>
			</tr>
			<tr>
			    <td>性质：</td>
				<td>				
					<select size=1 name="user.grade">
						<option value="0">
							普通用户
						</option>
						<option value="1">
							黑名单
						</option>	
						<option value="2">
							VIP 用户
						</option>					
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				  <!-- 绑定更新数据的方法 -->
					 	<input type="submit" name="Submit" value="提交">
				</td>
			</tr>
		</table>
	</s:form>
	
</body>

