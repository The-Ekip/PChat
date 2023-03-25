package com.ekip.pchat.dao;

import com.ekip.pchat.domain.message.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

    List<Message> findAllByAppUser_UserId(Long userId);
    List<Message> findAllByRoom_RoomId(Long roomId);

}
