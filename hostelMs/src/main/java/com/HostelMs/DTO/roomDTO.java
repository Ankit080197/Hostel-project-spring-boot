package com.HostelMs.DTO;

import javax.validation.constraints.NotNull;

import com.HostelMs.MODEL.room;
import com.HostelMs.MODEL.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class roomDTO {

	@NotNull(message="room id NOT null")
	private int roomId;
	@NotNull(message="room name NOT be null")
	private String roomName;
	@NotNull(message="room type NOT be null")
	private String roomType;
	
}
