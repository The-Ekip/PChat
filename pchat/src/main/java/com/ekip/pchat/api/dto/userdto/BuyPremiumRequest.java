package com.ekip.pchat.api.dto.userdto;

import com.ekip.pchat.domain.accountDetail.AccountStatus;
import com.ekip.pchat.domain.accountDetail.AccountType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BuyPremiumRequest {

    private LocalDateTime premiumDeadline;
    private int numberofMounth;
}
