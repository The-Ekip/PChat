package com.ekip.pchat.service.abstracts;

import com.ekip.pchat.dao.AppUserRepository;
import com.ekip.pchat.domain.user.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserService {

   List<AppUser> getAll();
    AppUser add(AppUser appUser);
    AppUser getById(Long userId);
}
