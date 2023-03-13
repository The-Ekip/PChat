package com.ekip.pchat.service.concrete;

import com.ekip.pchat.dao.RoomRepository;
import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import com.ekip.pchat.service.abstracts.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RoomManager implements RoomService {
    private final RoomRepository repository;

    @Override
    public Room add(Room room) {
        return repository.save(room);
    }

    @Override
    public Room getOneRoomById(Long roomId) {
        return repository.findById(roomId).orElseThrow(()->  new EntityNotFountException("Entity not found with "+roomId+" id."));
    }
}
