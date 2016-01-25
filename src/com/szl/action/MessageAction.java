package com.szl.action;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.szl.interceptor.AuthenticationInterceptor;
import com.szl.model.User;

public class MessageAction extends ActionSupport implements SessionAware,ApplicationAware{
    private String chatcounts;
	private User user=null;
    private Map session;
	private Map application;
//	聊天信息
	private String Content;
	private String To;
	private String  Action;
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	//实现roomkey userList vChat 的初始化
	public String execute()throws Exception{
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		//将房间的roomid设到application中
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		if(roomKey == null)
		{
			roomKey = new Hashtable();
		}
		if(chatcounts!=null){
			roomKey.put(user.getUsername(), chatcounts);
			application.put("roomKey", roomKey);
		}
		//使用roomKey对应的用户所对应的roomid作为用户list的键
		String userKey=(String)roomKey.get(user.getUsername());
		//构建一个Hashtable对象，以存储在线用户信息
		Hashtable userList = (Hashtable)application.get(userKey);
		if(userList == null)
		 {
	    	userList = new Hashtable();
		 }
		 //将当前登录用户信息添加到在线用户列表中	
		userList.put(user.getUsername(),user.getUsername()+"**"+user.getSex()+"***");
		application.put(userKey,userList);
		//使用roomKey对应的用户所对应的roomid+"chatKey"字符创作为聊天内容list的键
		String chatKey=(String)roomKey.get(user.getUsername())+"chatKey";
		Vector vChat = (Vector) application.get(chatKey);
		if(vChat == null){
			vChat = new Vector();
		}
		//将用户进入聊天室的消息加入聊天信息中
		String sWel = "<font color=red>"+user.getUsername()+"</font> 进入了聊天室！<br>";
		vChat.add(sWel);
		application.put(chatKey,vChat);
		return "success";
	}
	
	//刷新用户信息
	public String  userinfo(){
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		//使用roomKey对应的用户所对应的roomid作为用户list的键
		String userKey=(String)roomKey.get(user.getUsername());
		//构建一个Hashtable对象，以存储在线用户信息
		Hashtable userList = (Hashtable)application.get(userKey);
		//将当前登录用户信息添加到在线用户列表中
		userList.put(user.getUsername(),user.getUsername()+"**"+user.getSex()+"***");
		application.put(userKey,userList);
		return "userinfo";
		
	}
	
	//聊天的信息
	public String  send(){
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		//使用roomKey对应的用户所对应的roomid+"chatKey"字符创作为聊天内容list的键
		String chatKey=(String)roomKey.get(user.getUsername())+"chatKey";
		Vector vChat = (Vector) application.get(chatKey);	
		//获取聊天信息
		String sContent = this.Content;
		String sTo = this.To;
		String sAction = this.Action;
		//判断聊天内容是否为空，如果不为空就将聊天信息保存到Vector对象中
		if(sContent != null && sContent != "")
			{
				
				String sTotal = "<font color=blue>"+user.getUsername() +"</font> "+ sAction + " 对 <font color=red>"+sTo +"</font> 说："+ sContent +"<br>";
				vChat.add(sTotal);
			}
		return "send";
	}
	public String logout(){
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		//使用roomKey对应的用户所对应的roomid作为用户list的键
		String userKey=(String)roomKey.get(user.getUsername());
		String chatKey=userKey+"chatKey";
		Hashtable userList = (Hashtable)application.get(userKey);
		//在线用户列表删除当前用户
		userList.remove(user.getUsername());            
		//更新用户application中的列表
		application.put(userKey,userList);  
		//发消息表明当前用户已经离开聊天室
		Vector vChat = (Vector) application.get(chatKey);	
		String slogout = "<font color=red>"+user.getUsername()+"</font> 离开了聊天室！<br>";
		vChat.add(slogout);
		System.out.println(userList.size());
		if(userList.size()==0){
			userList.clear();
			vChat.clear();
		}
		return "logout";
	}
	public String getChatcounts() {
		return chatcounts;
	}
	public void setChatcounts(String chatcounts) {
		this.chatcounts = chatcounts;
	}
	public void setSession(Map session) {
		this.session = session;
	}

	public void setApplication(Map application) {
		this.application = application;
	}
	
}
