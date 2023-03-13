package com.ekip.pchat.api;


import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.service.abstracts.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService service;

    @GetMapping("/{roomId}")
    public Room getRoomById(@PathVariable Long roomId) {
        return service.getOneRoomById(roomId);
    }

}
