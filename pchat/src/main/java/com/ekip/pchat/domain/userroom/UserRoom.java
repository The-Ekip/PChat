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

    @JsonIgnore
    @OneToMany(mappedBy="userRoom", cascade = CascadeType.ALL)
    private List<Room> assignedRoom;

    @JsonIgnore
    @OneToMany(mappedBy="userRoom", cascade = CascadeType.ALL)
    private List<AppUser> assignedAppUser;


}
