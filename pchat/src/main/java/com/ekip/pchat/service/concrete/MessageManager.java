package com.ekip.pchat.service.concrete;

import com.ekip.pchat.dao.MessageRepository;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.service.abstracts.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageManager implements MessageService {
    private final MessageRepository repository;

    @Override
    public Message add(Message message) {
        return repository.save(message);
    }
}
