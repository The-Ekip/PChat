package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.api.dto.userdto.AppUserAddRequest;
import com.ekip.pchat.api.dto.userdto.BuyPremiumRequest;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.applicationtoken.ApplicationToken;
import com.ekip.pchat.domain.user.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserService {

   List<AppUser> getAll();
    AppUser add(AppUserAddRequest appUserAddRequest);
    AppUser getById(Long userId);
    AccountDetail buyPremium(BuyPremiumRequest buyPremiumRequest, Long userId);
    ApplicationToken updateApplicationToken(int applicationToken, Long userId);
    ApplicationToken buyApplicationToken(int applicationToken, Long userId);

}
