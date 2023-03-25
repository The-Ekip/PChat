package com.ekip.pchat.dao;

import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.room.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {



}
