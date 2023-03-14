package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.domain.room.Room;

public interface RoomService {

    Room add(Room room);

    Room getOneRoomById(Long roomId);
}
