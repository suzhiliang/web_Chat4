<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>新建用户</title>
</head>

<link href="images/myStyleClass.css" rel="stylesheet" type="text/css">
<body  background="images/register.jpg"><br>
	<div align="center">
	<table>
		<tr>
			<td height="40">
				
			</td>
		</tr>
	</table>
	<hr>
</div> 
	<s:form action="Useradd">
		<table width="60%" border="1" align="center">
			<tr>
				<td colspan="2" align="center">
					<A href="javascript:history.go(-1);"> 返回上一页 </A>
				</td>
			</tr>
			<tr>				
				<td width="30%">
					 <s:textfield name="username" label="用户名"/>
				</td>
			</tr>
			<tr>				
				<td>
					<s:password name="password" label="密码"/>
				</td>
			</tr>

			<tr>
				<td align="left">
					性别:
				</td>
				<td>
					<input name="sex" type="radio" value="1">
					男
					<input name="sex" type="radio" value="0" checked>
					女
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="email" label="Email"/>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="qq" label="QQ"></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="signature" label="介绍"/>
				</td>
			</tr>
			<tr>
				<td colspan="1" align="center">
					<s:submit value="Submit" align="center"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>

