package com.HostelMs.service;

import java.util.List;

import com.HostelMs.DTO.roomDTO;
import com.HostelMs.EXCEPTION.globalException;
import com.HostelMs.MODEL.room;

public interface roomService {

	public room addRoom(roomDTO r1);
	public List<room> getRoom();
	public room updateRoom(roomDTO r1);
	public String deleteRoom(int roomid) throws globalException;
	
}
