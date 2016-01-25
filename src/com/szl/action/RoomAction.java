package com.szl.action;

import java.util.ArrayList;

import java.util.List;

import com.szl.util.Constants;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.szl.dto.RoomDto;
import com.szl.model.Room;
import com.szl.service.IRoomService;

public class RoomAction extends ActionSupport implements ModelDriven{
	
	private  RoomDto roomVo=new RoomDto();
	private  Room room;

	private List<Room> rooms;
	
	private IRoomService roomService;
	
	//ɾ��
	public String delete()throws Exception{
		room = roomService.getByRoomID(roomVo.getRoomID());
		roomService.delete(room);
		return SUCCESS;
	}
	
	//���ĳ��room���б༭
	public String edit()throws Exception{
		room = roomService.getByRoomID(roomVo.getRoomID());
		return "edit";
	}
	
	//����
	public String update()throws Exception{
		roomService.save(room);
		return SUCCESS;
	}
	
	//����
	public String list()throws Exception{
		
		//Room room=new Room();
		List<Room> dtolist = new ArrayList<Room>();
		dtolist=roomService.getAll();	
	    rooms = dtolist;
		return "list";
	}

	//�洢
	public String save()throws Exception{
		Room room = new Room();
		room.setRoomName(roomVo.getRoomName());
		room.setKind(roomVo.getKind());
		room.setDescription(roomVo.getDescription());
		roomService.save(room);
		return SUCCESS;
	}
	//�½���ʱ����
	public String mbroomadd()throws Exception{
		Room room = new Room();
		room.setRoomName(roomVo.getRoomName());
		room.setKind(Constants.TEMPORARY_ROOM);
		room.setDescription(roomVo.getDescription());
		roomService.save(room);
		return "mbroomadd";
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return roomVo;
	}
	
	public RoomDto getRoomVo() {
		return roomVo;
	}
	
	public Room getRoom() {
		return room;
	}

	public List<Room> getRooms() {
		return rooms;
	}



	public void setRoomVo(RoomDto roomVo) {
		this.roomVo = roomVo;
	}

	public IRoomService getRoomService() {
		return roomService;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public void setRoomService(IRoomService roomService) {
		this.roomService = roomService;
	}
	

}
