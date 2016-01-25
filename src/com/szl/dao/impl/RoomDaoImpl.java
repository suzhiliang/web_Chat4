package com.szl.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.szl.dao.IRoomDao;
import com.szl.model.Room;

public class RoomDaoImpl  implements IRoomDao {
	  private HibernateTemplate hibernateTemplate;
	public void save(Room room) {
		hibernateTemplate.saveOrUpdate(room);
	}
	
	public List<Room> getAll(){
		return hibernateTemplate.loadAll(Room.class);
	}
	
	public Room getByRoomID(String roomID){
		return (Room)hibernateTemplate.get(Room.class,roomID);
	}
	
	public void delete(Room room){
		hibernateTemplate.delete(room);
	}
	
	public List<Room> getByKind(Integer kindID){
		return hibernateTemplate.find("from Room where kind=?",kindID);
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

}
