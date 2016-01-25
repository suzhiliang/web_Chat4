package com.szl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Room entity.
 * kind is Room type
 * description ∑øº‰√Ë ˆ
 */
@Entity
@Table(name="room")
public class Room implements java.io.Serializable {

	// Fields

	private String roomId;
	private String roomName;
	private Integer kind;
	private String description;

	// Constructors
//
//	/** default constructor */
//	
//	/** minimal constructor */
	public Room(){
		
	}
	public Room(String roomId, String roomName) {
		this.roomId = roomId;
		this.roomName = roomName;
	}

	/** full constructor */
	public Room(String roomId, String roomName, Integer kind,
			String description) {
		this.roomId = roomId;
		this.roomName = roomName;
		this.kind = kind;
		this.description = description;
	}

	// Property accessors
    @Id
    @GeneratedValue
    @Column(name="roomID")
	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
    @Column(name="roomName",length=20)
   	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	@Column(name="kind")
	public Integer getKind() {
		return this.kind;
	}

	public void setKind(Integer kind) {
		this.kind = kind;
	}
	@Column(name="description",length=300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}