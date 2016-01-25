<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员登入界面</title>

  </head>
 <link href="images/login.css" rel="stylesheet" type="text/css"> 
  <body background="images/Mgbg.gif">
<!--  用于显示addActionError的信息-->

 <font color="white" ><s:actionerror/></font> 
  	
      <form action="ManagerLoginAction" method="post">
      <center >
		<div style="position:absolute;width:20%;height:200px;top:200px;left:300px">
		<div class="text-type">	
      <table border="0" cellspacing="2" cellpadding="2" width="521px" height="213px" background="images/MGtableGBH.jpg" >
				<tr>
				<td width="173px"></td>
				<td width="86px" align="center" valign="bottom">账户:</td>
					<td colspan="2" align="left" valign="bottom">
						<input type="text" name="managerName" size="25"/>
					</td>
				</tr>
				<tr>
				 <td width="173px"></td>
				 <td width="86px" align="center" valign="middle">密码:</td>
					<td  colspan="2" align="left" valign="middle">
						<input type="password" name="password" size="25"/>
					</td>
				</tr>
		</table>
   </div>
   <table border="0" cellspacing="2" cellpadding="2" width="521px" height="57px" background="images/MGtableGBF.jpg">
   	<tr>
	           <td align="center" colspan="2">
               <input type="submit" value="提交"> 
                </td>
                 <td align="center" colspan="2">
                  <a href="MG_Registration.jsp" >注册</a>
             </td>
     </tr>	
     </table>         
     </div>
     </center>
     </form>
  </body>
</html>
