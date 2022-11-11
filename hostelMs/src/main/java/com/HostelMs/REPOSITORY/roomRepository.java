package com.HostelMs.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.HostelMs.MODEL.room;

@Repository
public interface roomRepository extends JpaRepository<room,Integer> {

	@Query(value="select * from room where room_id=?1",nativeQuery=true)
	room findByRoomId(int roomid);
}
