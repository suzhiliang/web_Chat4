<%@ page contentType="text/html;charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<head>
	<title>
		����ѡ��ҳ��
	</title>
</head>
<link href="images/myStyleClass.css" rel="stylesheet" type="text/css">
<body>
	
	<div align="center">
		<h2>
			<a href="<s:url action='Userlist'/>">�û�����</a>
		</h2>
		<h2>
			<a href="<s:url  action="Roomlist"/>">�������</a>
		</h2>
		<h2>
			<a href="<s:url  action="ManagerAction!list"/>">����Ա�б�</a>
		</h2>
		<h2>
			<input type="button" value="�˳�ϵͳ" onClick="javascript:window.close()">
		</h2>
	</div>

</body>
