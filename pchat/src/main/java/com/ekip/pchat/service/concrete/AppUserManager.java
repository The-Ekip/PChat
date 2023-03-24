package com.ekip.pchat.service.concrete;

import com.ekip.pchat.api.dto.userdto.AppUserAddRequest;
import com.ekip.pchat.dao.AppUserRepository;
import com.ekip.pchat.domain.accountDetail.AccountDetail;
import com.ekip.pchat.domain.user.AppUser;
import com.ekip.pchat.domain.user.Rank;
import com.ekip.pchat.domain.user.Role;
import com.ekip.pchat.domain.user.UserStatus;
import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import com.ekip.pchat.service.abstracts.AccaountDetailService;
import com.ekip.pchat.service.abstracts.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AppUserManager implements AppUserService {

    final private AppUserRepository appUserRepository;
    final private AccaountDetailService accaountDetailService;


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
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser getById(Long userId) {
      return appUserRepository.findById(userId).orElseThrow(()->new EntityNotFountException("User not found with "+userId+" id. "));
    }
}
