package com.ekip.pchat.service.concrete;

import com.ekip.pchat.api.dto.accaountDetail.BuyPremiumResponse;
import com.ekip.pchat.api.dto.userdto.AppUserAddRequest;
import com.ekip.pchat.api.dto.userdto.BuyPremiumRequest;
import com.ekip.pchat.dao.AppUserRepository;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.accountDetail.AccountType;
import com.ekip.pchat.domain.applicationtoken.ApplicationToken;
import com.ekip.pchat.domain.user.AppUser;
import com.ekip.pchat.domain.user.Rank;
import com.ekip.pchat.domain.user.Role;
import com.ekip.pchat.domain.user.UserStatus;
import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import com.ekip.pchat.service.abstracts.AccaountDetailService;
import com.ekip.pchat.service.abstracts.AppUserService;
import com.ekip.pchat.service.abstracts.ApplicationTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AppUserManager implements AppUserService {

    final private AppUserRepository appUserRepository;
    final private AccaountDetailService accaountDetailService;
    final private ApplicationTokenService applicationtokenService;


    @Override
    public List<AppUser> getAll() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser add(AppUserAddRequest appUserAddRequest) {
        AppUser appUser = AppUserAddRequest.appUserFromDto(appUserAddRequest);
        appUser.setCreatedAt(LocalDateTime.now());
        appUser.setUserRank(Rank.BRONZE);
        appUser.setUserStatus(UserStatus.IDLE);
        appUser.setRole(Role.MEMBER);
        AccountDetail add = accaountDetailService.add(new AccountDetail());
        appUser.setAccountDetail(add);
        ApplicationToken applicationToken = applicationtokenService.add(new ApplicationToken());
        appUser.setApplicationToken(applicationToken);
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser getById(Long userId) {
        return appUserRepository.findById(userId).orElseThrow(() -> new EntityNotFountException("User not found with " + userId + " id. "));
    }


    @Override
    public BuyPremiumResponse buyPremium(BuyPremiumRequest buyPremiumRequest, Long userId) {
        AppUser appUser = getById(userId);
        AccountDetail accountDetail1 = appUser.getAccountDetail();
        accountDetail1.setPremiumStartDate(LocalDateTime.now());
        accountDetail1.setAccountType(AccountType.PREMIUM);
        accountDetail1.setPremiumDeadline(buyPremiumRequest.getPremiumDeadline());
        accountDetail1.setFriendsLimit(10);
        accountDetail1.setSessionLimit(120);
        int tokenQuatity = appUser.getApplicationToken().getTokenQuantity() - (buyPremiumRequest.getNumberofMounth() * 100);
        if (tokenQuatity >= 0) {
            updateApplicationToken(tokenQuatity, userId);
        } else{
            throw new EntityNotFountException("LUTFEN TOKEN ALIN SUAN KI TOKENINIZ " +
                    appUser.getApplicationToken().getTokenQuantity() + " gereken token " + (-tokenQuatity) );
        }

        AccountDetail accountDetail = accaountDetailService.buyPremium(accountDetail1);
        BuyPremiumResponse premiumResponse = BuyPremiumResponse.fromDto(accountDetail);
        premiumResponse.setTokenAmount(tokenQuatity);
        return premiumResponse;
    }


    @Override
    public ApplicationToken updateApplicationToken(int applicationTokenAmaount, Long userId) {
        AppUser appUser = getById(userId);
        ApplicationToken applicationToken1 = appUser.getApplicationToken();
        applicationToken1.setTokenQuantity(applicationTokenAmaount);
        return applicationtokenService.updateApplicationToken(applicationToken1);
    }

    @Override
    public ApplicationToken buyApplicationToken(int applicationTokenAmaount, Long userId) {
        AppUser appUser = getById(userId);
        ApplicationToken applicationToken1 = appUser.getApplicationToken();
        applicationToken1.setTokenQuantity(applicationToken1.getTokenQuantity()+applicationTokenAmaount);
        return applicationtokenService.updateApplicationToken(applicationToken1);
    }





}
