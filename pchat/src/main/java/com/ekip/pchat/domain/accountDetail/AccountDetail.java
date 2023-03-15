package com.ekip.pchat.domain.accountDetail;

import com.ekip.pchat.domain.user.AppUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Data
@Table (name="account_detail")
public class AccountDetail {

    @Id
    @Column (name="account_detail_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long accountDetailId;

    @Column(name="account_type_deadline")
    private LocalDateTime premiumDeadline;

    @Column (name="account_start_date")
    private LocalDateTime premiumStartDate;

    @Enumerated(EnumType.STRING)
    @Column (name="account_status")
    private AccountStatus accountStatus;

    @Enumerated(EnumType.STRING)
    @Column (name="account_type")
    private AccountType accountType;

    @JsonIgnore
    @OneToOne(mappedBy = "accountDetail")
    private AppUser appUser;

}
