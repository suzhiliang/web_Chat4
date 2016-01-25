package com.szl.service.impl;

import java.util.List;

import com.szl.dao.IRoomDao;
import com.szl.model.Room;
import com.szl.service.IRoomService;

public class RoomServiceImpl  implements IRoomService{

	private IRoomDao roomDao;
	
	public IRoomDao getRoomDao() {
		return roomDao;
	}

	public void save(Room room) {
		roomDao.save(room);
	}
	
	public List<Room> getAll(){
		return roomDao.getAll();
	}
	
	public Room getByRoomID(String roomID){
		return roomDao.getByRoomID(roomID);
	}
	
	public void delete(Room room){
		roomDao.delete(room);
	}

	public void setRoomDao(IRoomDao roomDao) {
		this.roomDao = roomDao;
	}
	
	public List<Room> getByKind(Integer kindID){
		return roomDao.getByKind(kindID);
	}

}
