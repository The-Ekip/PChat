package com.ekip.pchat.api.dto.baseDtos.accountdetail;

import com.ekip.pchat.domain.accountDetail.AccountStatus;
import com.ekip.pchat.domain.accountDetail.AccountType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountDetailRequestDto {
    private LocalDateTime premiumStartDate;
    private LocalDateTime premiumDeadline;
    private AccountStatus accountStatus;
    private int friendsLimit;
    private double sessionLimit;
    private AccountType accountType;
    private Integer tokenAmount;

}

