package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.api.dto.MessageAddRequest;
import com.ekip.pchat.domain.message.Message;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MessageService {


    List<Message> getAllMessageByUserId(Long userId);
    List<Message> getAllMessageByRoomId(Long roomId);

    Message addMessage(Message message);



}
