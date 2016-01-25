package com.szl.service;

import java.util.List;

import com.szl.model.Room;

public interface IRoomService {
	
	public void save(Room room);
	
	public List<Room> getAll();
	
	public Room getByRoomID(String roomID);
	
	public void delete(Room room);
	
	public List<Room> getByKind(Integer kindID);

}
