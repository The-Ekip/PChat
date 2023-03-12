package com.ekip.pchat.domain.user;

import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.message.Message;
import com.ekip.pchat.domain.userroom.UserRoom;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

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

    @JsonIgnore
 //   @Column (name="user_room")
    @ManyToOne
    private UserRoom userRoom;

  //  @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "account_detail_id", referencedColumnName = "account_detail_id")
  //  private AccountDetail accountDetail;

    @JsonIgnore
    @OneToMany
    private List<Message> message;

}
