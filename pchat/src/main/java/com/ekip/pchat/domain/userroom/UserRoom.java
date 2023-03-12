package com.ekip.pchat.domain.userroom;

import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.domain.user.User;
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

  //  @JoinColumn(name="assigned_room_id", nullable=false)
    @OneToMany
  //  @Column (name="assigned_room_id")
    private List<Room> assignedRoom;

    @OneToMany
    // @JoinColumn(name="assigned_user_id", nullable=false)
   // @Column (name="assigned_user_id")
    private List<User> assignedUser;
}
