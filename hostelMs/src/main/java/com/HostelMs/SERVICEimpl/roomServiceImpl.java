package com.HostelMs.SERVICEimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HostelMs.DTO.roomDTO;
import com.HostelMs.EXCEPTION.globalException;
import com.HostelMs.MODEL.room;
import com.HostelMs.REPOSITORY.roomRepository;
import com.HostelMs.UTIL.valueMapper;
import com.HostelMs.service.roomService;

@Service
public class roomServiceImpl implements roomService {

	@Autowired
	private roomRepository roomrepo;
	
	public room addRoom(roomDTO r1) {
		
		room r2=valueMapper.convertoRoom(r1);
		return roomrepo.save(r2);
		
	}
	
	public List<room> getRoom(){
		return roomrepo.findAll();
	}
	
	
	public room updateRoom(roomDTO r1) {
		
		room r2=valueMapper.convertoRoom(r1);
		return roomrepo.save(r2);	
	}
	
	public String deleteRoom(int roomid) throws globalException {
		room r2=roomrepo.findByRoomId(roomid);
		if(r2!=null) {
			roomrepo.deleteById(roomid);
			return "deleted";
		}
		else {
			throw new globalException("Room Notfound");
		}
	}
	
	
	
	
	
	
	
}
