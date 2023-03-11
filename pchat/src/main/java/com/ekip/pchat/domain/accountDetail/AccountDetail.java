package com.ekip.pchat.domain.accountDetail;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Data
@Table (name="account_detail")
public class AccountDetail {

    @Column(name="account_type_deadline")
    private LocalDateTime accountTypeDeadline;

    @Column (name="account_start_date")
    private LocalDateTime accountStartDate;

    @Enumerated(EnumType.STRING)
    @Column (name="account_status")
    private AccountStatus accountStatus;

    @Enumerated(EnumType.STRING)
    @Column (name="account_type")
    private AccountType accountType;
}
