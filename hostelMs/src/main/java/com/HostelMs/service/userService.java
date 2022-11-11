package com.HostelMs.service;

import java.util.List;

import com.HostelMs.DTO.userDTO;
import com.HostelMs.EXCEPTION.globalException;
import com.HostelMs.MODEL.user;

public interface userService {

	public user addUser(userDTO u1);
	public List<user> getUser();
	public user updateUser(userDTO u1);
	public String deleteUser(int userid) throws globalException;
	public String updatePhone(int userid,String phone)throws globalException;
	public String allotRoom(int userid,int roomid)throws globalException;
	public String updateFee(int userid,int userfee)throws globalException;
}
