package com.ekip.pchat.service.concrete;

import com.ekip.pchat.api.dto.MessageAddRequest;
import com.ekip.pchat.dao.RoomRepository;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.domain.room.RoomStatus;
import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import com.ekip.pchat.service.abstracts.AppUserService;
import com.ekip.pchat.service.abstracts.MessageService;
import com.ekip.pchat.service.abstracts.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RoomManager implements RoomService {
    private final RoomRepository repository;
    final private MessageService messageService;
    final private AppUserService appUserService;

    @Override
    public Room createRoom(Room room) {
        Room room1 = new Room ();
        room1.setRoomType(room.getRoomType());
        room1.setRoomStatus(RoomStatus.IN_USE);
        room1.setCreatedAt(LocalDateTime.now());
        room1.setMaxCapacity(room.getMaxCapacity());
        room1.setUserRoom(null);
        return repository.save(room1);
    }

    @Override
    public Room getOneRoomById(Long roomId) {
        return repository.findById(roomId).orElseThrow(()->  new EntityNotFountException("Entity not found with "+roomId+" id."));
    }

    @Override
    public List<Message> getAllMessageByRoomId(Long roomId) {
        return messageService.getAllMessageByRoomId(roomId);
    }
    // TODO USER TOKEN TARAFINDAN ALINACAK
    @Override
    public Message createMessage(MessageAddRequest messageAddRequest, Long roomId) {
        Message message = MessageAddRequest.messageFromDto(messageAddRequest);
        message.setAppUser(appUserService.getById(1L));
        message.setCreatedAt(LocalDateTime.now());
        message.setRoom(this.getOneRoomById(roomId));

        return messageService.addMessage(message);

    }
}
