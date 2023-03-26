package com.ekip.pchat.service.concrete;

import com.ekip.pchat.dao.AccountDetailRepository;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.accountDetail.AccountStatus;
import com.ekip.pchat.domain.accountDetail.AccountType;
import com.ekip.pchat.service.abstracts.AccountDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AccountDetailManager implements AccountDetailService {

    private final AccountDetailRepository accountDetailRepository;


    @Override
    public AccountDetail getAll() {
        return null;
    }

    @Override
    public AccountDetail add(AccountDetail accountDetail) {
        AccountDetail accountDetail1 = new AccountDetail();
        accountDetail1.setAccountStatus(AccountStatus.ACTIVE);
        accountDetail1.setAccountType(AccountType.STANDARD);
        accountDetail1.setPremiumDeadline(null);
        accountDetail1.setPremiumStartDate(null);
        return this.accountDetailRepository.save(accountDetail1);
    }


    @Override
    public AccountDetail getOneAccountDetailById() {
        return null;
    }

    @Override
    public AccountDetail buyPremium(AccountDetail accountDetail) {
        return accountDetailRepository.save(accountDetail);
    }

    @Override
    public AccountDetail updateAccountType(AccountDetail accountDetail) {
        return accountDetailRepository.save(accountDetail);
    }


}
