package com.HostelMs.UTIL;

import com.HostelMs.DTO.roomDTO;
import com.HostelMs.DTO.userDTO;
import com.HostelMs.MODEL.room;
import com.HostelMs.MODEL.user;

public class valueMapper {

	
	public static user convertoUser(userDTO u1) {
		user u2=new user(u1.getUserId(), u1.getUserName(),u1.getUserPassword(),u1.getUserPhone(),u1.getUserEmail(),u1.getUserRole(),u1.getUserFee(),u1.getUserRoom());
		
		return u2;	
	}
	
	public static room convertoRoom(roomDTO r1) {
		
		room r2=new room(r1.getRoomId(),r1.getRoomName(),r1.getRoomType());
		return r2;
	}
	
	
}
