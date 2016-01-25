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
//	������Ϣ
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
	//ʵ��roomkey userList vChat �ĳ�ʼ��
	public String execute()throws Exception{
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		//�������roomid�赽application��
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		if(roomKey == null)
		{
			roomKey = new Hashtable();
		}
		if(chatcounts!=null){
			roomKey.put(user.getUsername(), chatcounts);
			application.put("roomKey", roomKey);
		}
		//ʹ��roomKey��Ӧ���û�����Ӧ��roomid��Ϊ�û�list�ļ�
		String userKey=(String)roomKey.get(user.getUsername());
		//����һ��Hashtable�����Դ洢�����û���Ϣ
		Hashtable userList = (Hashtable)application.get(userKey);
		if(userList == null)
		 {
	    	userList = new Hashtable();
		 }
		 //����ǰ��¼�û���Ϣ��ӵ������û��б���	
		userList.put(user.getUsername(),user.getUsername()+"**"+user.getSex()+"***");
		application.put(userKey,userList);
		//ʹ��roomKey��Ӧ���û�����Ӧ��roomid+"chatKey"�ַ�����Ϊ��������list�ļ�
		String chatKey=(String)roomKey.get(user.getUsername())+"chatKey";
		Vector vChat = (Vector) application.get(chatKey);
		if(vChat == null){
			vChat = new Vector();
		}
		//���û����������ҵ���Ϣ����������Ϣ��
		String sWel = "<font color=red>"+user.getUsername()+"</font> �����������ң�<br>";
		vChat.add(sWel);
		application.put(chatKey,vChat);
		return "success";
	}
	
	//ˢ���û���Ϣ
	public String  userinfo(){
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		//ʹ��roomKey��Ӧ���û�����Ӧ��roomid��Ϊ�û�list�ļ�
		String userKey=(String)roomKey.get(user.getUsername());
		//����һ��Hashtable�����Դ洢�����û���Ϣ
		Hashtable userList = (Hashtable)application.get(userKey);
		//����ǰ��¼�û���Ϣ��ӵ������û��б���
		userList.put(user.getUsername(),user.getUsername()+"**"+user.getSex()+"***");
		application.put(userKey,userList);
		return "userinfo";
		
	}
	
	//�������Ϣ
	public String  send(){
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		//ʹ��roomKey��Ӧ���û�����Ӧ��roomid+"chatKey"�ַ�����Ϊ��������list�ļ�
		String chatKey=(String)roomKey.get(user.getUsername())+"chatKey";
		Vector vChat = (Vector) application.get(chatKey);	
		//��ȡ������Ϣ
		String sContent = this.Content;
		String sTo = this.To;
		String sAction = this.Action;
		//�ж����������Ƿ�Ϊ�գ������Ϊ�վͽ�������Ϣ���浽Vector������
		if(sContent != null && sContent != "")
			{
				
				String sTotal = "<font color=blue>"+user.getUsername() +"</font> "+ sAction + " �� <font color=red>"+sTo +"</font> ˵��"+ sContent +"<br>";
				vChat.add(sTotal);
			}
		return "send";
	}
	public String logout(){
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		Hashtable roomKey = (Hashtable)application.get("roomKey");
		//ʹ��roomKey��Ӧ���û�����Ӧ��roomid��Ϊ�û�list�ļ�
		String userKey=(String)roomKey.get(user.getUsername());
		String chatKey=userKey+"chatKey";
		Hashtable userList = (Hashtable)application.get(userKey);
		//�����û��б�ɾ����ǰ�û�
		userList.remove(user.getUsername());            
		//�����û�application�е��б�
		application.put(userKey,userList);  
		//����Ϣ������ǰ�û��Ѿ��뿪������
		Vector vChat = (Vector) application.get(chatKey);	
		String slogout = "<font color=red>"+user.getUsername()+"</font> �뿪�������ң�<br>";
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
