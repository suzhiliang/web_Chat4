<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
  </head>
  
  <body background="images/register.jpg">
  <div align="center">
	<table>
		<tr>
			<td height="40">
				
			</td>
		</tr>
	</table>
	<hr>
</div> 
  <s:actionerror/>
   <s:form action="ManagerAction!add">
		<table width="60%" border="1" align="center">
			<tr>
				<td colspan="2" align="center">
					<A href="javascript:history.go(-1);"> 返回上一页 </A>
				</td>
			</tr>
			<tr>				
				<td width="30%">
					 <s:textfield name="ManagerName" label="用户名"/>
				</td>
			</tr>
			<tr>				
				<td>
					<s:textfield name="phone" label="电话"/>
				</td>
			</tr>
			<tr>				
				<td>
					<s:textfield name="QQ" label="QQ"/>
				</td>
			</tr>
			<tr>				
				<td>
					<s:password name="password" label="密码"/>
				</td>
			</tr>
			<tr>				
				<td>
					<s:password name="password2" label="确认密码"/>
				</td>
			</tr>
			<tr>				
				<td>
					<s:password name="MGCommon" label="口令"/>
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
</html>
