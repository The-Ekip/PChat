package com.ekip.pchat.domain.message;

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

}
