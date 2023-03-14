package com.ekip.pchat.domain.message;

import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.domain.user.AppUser;
import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table (name="message")
public class Message {

    @Id
    @Column(name="message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageId;

    @Column (name="created_at")
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    @Column (name="content_type")
    private ContentType contentType;


    @Column(columnDefinition="TEXT")
    private String text;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private AppUser appUser;

    @ManyToOne
    @JoinColumn(name="room_id", nullable = false)
    private Room room;

}
