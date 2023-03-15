package com.ekip.pchat.api;

import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.service.abstracts.MessageService;
import com.ekip.pchat.service.concrete.MessageManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService service;

    @GetMapping("/get")
    public String add(){

        return "sefa";
    }
}
