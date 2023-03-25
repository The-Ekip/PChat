package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.api.dto.MessageAddRequest;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.room.Room;

import java.util.List;

public interface RoomService {
    Room createRoom(Room room);
    Room getOneRoomById(Long roomId);
    List<Message> getAllMessageByRoomId(Long roomId);
    Message createMessage(MessageAddRequest messageAddRequest, Long roomId);


}
