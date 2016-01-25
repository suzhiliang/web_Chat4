package com.szl.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.szl.interceptor.AuthenticationInterceptor;
import com.szl.model.Room;
import com.szl.model.User;
import com.szl.service.IRoomService;
import com.szl.util.Constants;

public class IndexAction extends ActionSupport implements SessionAware{

	IRoomService roomService;
	
	private List<Room> rooms;

	private List<Room> temporaryRooms;
    private Map session;
	private User user;
	
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public void setTemporaryRooms(List<Room> temporaryRooms) {
		this.temporaryRooms = temporaryRooms;
	}

	
	public List<Room> getRooms() {
		return rooms;
	}
	public IRoomService getRoomService() {
		return roomService;
	}
	
	public List<Room> getTemporaryRooms() {
		return temporaryRooms;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String index()throws Exception{
		rooms = roomService.getByKind(Constants.PUBLIC_ROOM);
    	temporaryRooms = roomService.getByKind(Constants.TEMPORARY_ROOM);
	
		user =(User)session.get(AuthenticationInterceptor.USER_SESSION_KEY);
		return SUCCESS;
	}

	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}

	public void setSession(Map session) {
		this.session = session;
	}

}
