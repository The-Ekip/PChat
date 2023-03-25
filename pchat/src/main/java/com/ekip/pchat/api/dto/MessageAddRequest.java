package com.ekip.pchat.api.dto;

import com.ekip.pchat.domain.message.ContentType;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.domain.user.AppUser;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MessageAddRequest {

    private ContentType contentType;
    private String text;

    public static Message messageFromDto(MessageAddRequest messageAddDto){
        Message message = new Message();
        message.setText(messageAddDto.getText());
        message.setContentType(messageAddDto.getContentType());
        return message;
    }

}
