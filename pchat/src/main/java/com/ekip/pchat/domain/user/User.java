package com.ekip.pchat.domain.user;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table (name="user")
public class User {

    @Id
    @Column (name="user_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long userId;

    @Column (name="first_name")
    private String firstName;

    @Column (name="last_name")
    private String lastName;

    @Column (name="phone")
    private String phone;

    @Column (name="mail")
    private String mail;

    @Enumerated(EnumType.STRING)
    @Column (name="gender")
    private Gender gender;

    @Column (name="password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column (name="rank")
    private Rank rank;

    @Enumerated(EnumType.STRING)
    @Column (name="role")
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column (name="user_status")
    private UserStatus userStatus;

    @Column (name="nick_name")
    private String nickName;

    @Column (name="created_at")
    private LocalDateTime createdAt;


}
