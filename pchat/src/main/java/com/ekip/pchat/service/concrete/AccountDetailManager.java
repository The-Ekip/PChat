package com.ekip.pchat.service.concrete;

import com.ekip.pchat.dao.AccaountDetailRepository;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.accountDetail.AccountStatus;
import com.ekip.pchat.domain.accountDetail.AccountType;
import com.ekip.pchat.service.abstracts.AccaountDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AccountDetailManager implements AccaountDetailService {

    private final AccaountDetailRepository accaountDetailRepository;


    @Override
    public AccountDetail getAll() {
        return null;
    }

    @Override
    public AccountDetail add(AccountDetail accountDetail) {
        AccountDetail accountDetail1 = new AccountDetail();
        accountDetail1.setAccountStatus(AccountStatus.ACTIVE);
        accountDetail1.setAccountType(AccountType.STANDARD);
        accountDetail1.setAccountStartDate(LocalDateTime.now());
        accountDetail1.setAccountStartDate(null);
        accountDetail1.setAccountTypeDeadline(null);
        return this.accaountDetailRepository.save(accountDetail1);
    }

    @Override
    public AccountDetail getOneAccountDetailById() {
        return null;
    }
}
