package com.ekip.pchat.domain.userroom;

import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.domain.user.AppUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="user_room")
public class UserRoom {

    @Id
    @Column(name="user_room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userRoomId;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = true)
    private Room assignedRoom;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private AppUser assignedAppUser;


}
