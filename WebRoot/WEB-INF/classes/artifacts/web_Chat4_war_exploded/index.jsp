<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<head>

	<title>
		用户登录
	</title>
</head>
<link href="images/login.css" rel="stylesheet" type="text/css">
<body background="images/bluebg.jpg" >
	<s:actionerror/>
	<form action="UserLoginAction.action" method="post">
		<center >
		<div style="position:absolute;width:20%;height:200px;top:200px;left:300px">
		<div class="text-type">	
			<table border="0" cellspacing="2" cellpadding="2" width="443px" height="194px" background="images/tableBGH.jpg" >
				<tr >
				<td width="100px"></td>
				<td width="100px" align="center" valign="bottom">用户:</td>
					<td colspan="2" align="left" valign="bottom">
						<input type="text" name="username" size="16"/>
					</td>
				</tr>
				<tr>
				 <td width="100px"></td>
				 <td width="100px" align="center" valign="middle">密码:</td>
					<td  colspan="2" align="left" valign="middle">
						<input type="password" name="password" size="16"/>
					</td>
				</tr>
	         <tr>
	         <td width="100px">
	         
	         </td>
		         <td align="right" colspan="2" width="70px">
					<A href="registration.jsp">
							注册
						</A>
					</td>
				<td  align="left" colspan="2">
					 <A href="admin/admin.jsp">管理员登录</A>
				</td>
			 </tr>
		</table>
		</div>
		<table border="0" cellspacing="2" cellpadding="2" width="443px" height="46px" background="images/tableBGF.jpg">
		<tr>
					<td align="center" colspan="2">
						<input type="submit" value="登录"/>                
					</td>
					<td align="center" colspan="2">
						<input type="button"  value="退出系统" onClick="javascript:window.close()"/>                
					</td>
				</tr>	
		</table>		
		
		</div>

		</center>
		
	</form>
</body>