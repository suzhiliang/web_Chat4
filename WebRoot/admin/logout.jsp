<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="java.util.*" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<TITLE>��ӭ����������</TITLE>
</HEAD>
<% 
	//��ȡ��ǰ�û���Ϣ
	String sUserName = (String) session.getAttribute("UserName");
	String sNickName = (String) session.getAttribute("NickName");
	//��ȡ�����û���Ϣ
	Hashtable userList = (Hashtable) application.getAttribute("userList");
	//�����û��б�ɾ����ǰ�û�
	userList.remove(sUserName);            
	//�����û�application�е��б�
	application.setAttribute("userList",userList);
	//����Ϣ������ǰ�û��Ѿ��뿪������
	Vector vChat = (Vector) application.getAttribute("vChat");	
	String slogout = "<font color=red>"+sNickName+"</font> �뿪�������ң�<br>";
	vChat.add(slogout);
	//ʹ��ǰsessionʧЧ
	session.invalidate();
%>
<BODY bgcolor="#DFFDFF">
<h1 align="center">��ӭ�´ι���</h1>
<p align="center"><input type="button" name="btn" value="�رմ���" onClick="javascript:window.close()"></p>
</BODY>
</HTMl>