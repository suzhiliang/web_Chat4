package com.szl.dto;


public class RoomDto {
	
	public String kindName;
	
    private String roomID;
	
	private String roomName;

	private Integer kind;

	private String description;

	public String getDescription() {
		return description;
	}

	public Integer getKind() {
		return kind;
	}

	public String getKindName() {
		return kindName;
	}

	public String getRoomID() {
		return roomID;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setKind(Integer kind) {
		this.kind = kind;
	}
	
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	

}
