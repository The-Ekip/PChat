package com.ekip.pchat.service.concrete;

import com.ekip.pchat.api.dto.MessageAddRequest;
import com.ekip.pchat.dao.MessageRepository;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.service.abstracts.MessageService;
import com.ekip.pchat.service.abstracts.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MessageManager implements MessageService {
    private final MessageRepository repository;



    @Override
    public List<Message> getAllMessageByUserId(Long userId) {
        return repository.findAllByAppUser_UserId(userId);
    }

    @Override
    public List<Message> getAllMessageByRoomId(Long roomId) {
        return repository.findAllByRoom_RoomId(roomId);
    }

    @Override
    public Message addMessage(Message message) {
        return repository.save(message);
    }


}
