package com.ekip.pchat.domain.room;

import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.userroom.UserRoom;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name="room")
public class Room {

    @Id
    @Column(name="room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;

    @Column (name="created_at")
    private LocalDateTime createdAt;

    @Column (name="max_capacity")
    private int maxCapacity;

    @Column (name="room_type")
    private RoomType roomType;

    @Enumerated(EnumType.STRING)
    @Column (name="room_status")
    private RoomStatus roomStatus;

    @ManyToOne
    @JoinColumn(name="user_room_id",nullable = false)
    private UserRoom userRoom;

    @JsonIgnore
    @OneToMany(mappedBy="room",
            cascade = CascadeType.ALL)
    private List<Message> message;


}
