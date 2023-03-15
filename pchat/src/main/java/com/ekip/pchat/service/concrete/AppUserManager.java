package com.ekip.pchat.service.concrete;

import com.ekip.pchat.dao.AppUserRepository;
import com.ekip.pchat.domain.user.AppUser;
import com.ekip.pchat.domain.user.Rank;
import com.ekip.pchat.domain.user.Role;
import com.ekip.pchat.domain.user.UserStatus;
import com.ekip.pchat.service.abstracts.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AppUserManager implements AppUserService {

    final private AppUserRepository appUserRepository;


    @Override
    public List<AppUser> getAll() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser add(AppUser appUser) {
        AppUser appUser1 = new AppUser();
        appUser1.setCreatedAt(LocalDateTime.now());
        appUser1.setUserRank(Rank.BRONZE);
        appUser1.setUserStatus(UserStatus.IDLE);
        appUser1.setUserRoom(null);
        appUser1.setGender(appUser.getGender());
        appUser1.setFirstName(appUser.getFirstName());
        appUser1.setLastName(appUser.getLastName());
        appUser1.setMail(appUser.getMail());
        appUser1.setMessage(null);
        appUser1.setNickName(appUser.getNickName());
        appUser1.setPassword(null);
        appUser1.setPhone(appUser.getPhone());
        appUser1.setRole(Role.MEMBER);
        return appUserRepository.save(appUser1);
    }

    @Override
    public AppUser getById(Long userId) {
        return null;
    }
}
