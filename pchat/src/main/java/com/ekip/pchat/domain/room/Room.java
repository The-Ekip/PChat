package com.ekip.pchat.domain.room;

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

    @Column (name="user_id")
    private List<Long> userId;

    @Column (name="max_capacity")
    private int maxCapacity;

    @Column (name="room_type")
    private RoomType roomType;

    @Enumerated(EnumType.STRING)
    @Column (name="room_status")
    private RoomStatus roomStatus;
}
