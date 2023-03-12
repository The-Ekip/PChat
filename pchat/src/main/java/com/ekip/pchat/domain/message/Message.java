package com.ekip.pchat.domain.message;

import com.ekip.pchat.domain.room.Room;
import com.ekip.pchat.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

   // @Column (name="user_id")
    @JoinColumn(name="user_id", nullable=false)
    @ManyToOne
    private User user;

    @JsonIgnore
    @JoinColumn(name="room_id", nullable=false)
 //   @Column (name="room_id")
    @ManyToOne
    private Room room;

}
