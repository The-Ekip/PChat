package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.domain.accountDetail.AccountDetail;
import org.springframework.stereotype.Service;

@Service
public interface AccountDetailService {

    AccountDetail getAll();
    AccountDetail add(AccountDetail accountDetail);
    AccountDetail getOneAccountDetailById();
    AccountDetail buyPremium(AccountDetail accountDetail);
    AccountDetail updateAccountType(AccountDetail accountDetail);
}
