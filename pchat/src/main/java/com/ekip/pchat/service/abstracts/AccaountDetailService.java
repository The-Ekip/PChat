package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.api.dto.userdto.BuyPremiumRequest;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import org.springframework.stereotype.Service;

@Service
public interface AccaountDetailService {

    AccountDetail getAll();
    AccountDetail add(AccountDetail accountDetail);
    AccountDetail getOneAccountDetailById();
    AccountDetail buyPremium(AccountDetail accountDetail);
}
