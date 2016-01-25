<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

</head>
<body background="images/roombg.jpg"> 
  <center>
    <s:form action="index">  
    
     <table align="center" >
        <tr  bgcolor="#0099CC" >
          <td>房间列表：</td>
          <s:iterator value="rooms">
             <td><a href="<s:url action="messageAction"><s:param name="chatcounts" value="roomId"/></s:url>"><s:property value="roomName"/></a></td>
          </s:iterator>
        </tr>
        <tr  bgcolor="#0099CC">
          <td>临时房间列表：</td>
          <s:iterator value="temporaryRooms">
             <td><a href="<s:url action="messageAction"><s:param name="chatcounts" value="roomId"/></s:url>"><s:property value="roomName"/></a></td>
          </s:iterator>
           <td><a href="mbroomadd.jsp">新建临时房间</a></td>
        </tr>
     </table>
     </s:form>
     
      <s:hidden name="chatcounts"/>
	  昵称:
	  <input type="text" name="username" value="<s:property value="user.username"/>" class="names"/>  
	  <br>
	  </center>
</body>
</html>