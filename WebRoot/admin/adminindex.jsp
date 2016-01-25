<%@ page contentType="text/html;charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		管理选项页面
	</title>
</head>
<link href="images/myStyleClass.css" rel="stylesheet" type="text/css">
<body>
	
	<div align="center">
		<h2>
			<a href="<s:url action='Userlist'/>">用户管理</a>
		</h2>
		<h2>
			<a href="<s:url  action="Roomlist"/>">房间管理</a>
		</h2>
		<h2>
			<a href="<s:url  action="ManagerAction!list"/>">管理员列表</a>
		</h2>
		<h2>
			<input type="button" value="退出系统" onClick="javascript:window.close()">
		</h2>
	</div>

</body>
