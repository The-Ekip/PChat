package com.ekip.pchat.api;


import com.ekip.pchat.api.dto.MessageAddRequest;
import com.ekip.pchat.api.httpResponse.Response;
import com.ekip.pchat.api.httpResponse.SuccessDataResponse;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.service.abstracts.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService service;
    @GetMapping ("/{roomId}")
    public List<Message> getAllMessageByRoomId(@PathVariable Long roomId) {

        return  service.getAllMessageByRoomId(roomId);
    }
    @PostMapping("/{roomId}/messages")
    public ResponseEntity createMessage(@PathVariable Long roomId,@RequestBody MessageAddRequest request) {
        return new ResponseEntity(new SuccessDataResponse("message created",this.service.createMessage(request,roomId)),HttpStatus.CREATED);
    }


    // TODO  DTO OLUŞTURULACAK
    @PostMapping
    public ResponseEntity createRoom(@RequestBody Room room){

        return new ResponseEntity(new SuccessDataResponse("room created",this.service.createRoom(room)), HttpStatus.CREATED);
    }
}
