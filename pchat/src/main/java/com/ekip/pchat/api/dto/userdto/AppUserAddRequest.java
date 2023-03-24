package com.ekip.pchat.api.dto.userdto;

import com.ekip.pchat.domain.user.*;
import lombok.Data;

@Data
public class AppUserAddRequest {

    private String firstName;
    private String lastName;
    private String phone;
    private String mail;
    private Gender gender;
    private String password;
    private String nickName;


    public static AppUser appUserFromDto(AppUserAddRequest appUserAddDto){
        AppUser appUser = new AppUser();
        appUser.setFirstName(appUserAddDto.getFirstName());
        appUser.setLastName(appUserAddDto.getLastName());
        appUser.setPhone(appUserAddDto.getPhone());
        appUser.setMail(appUserAddDto.getMail());
        appUser.setGender(appUserAddDto.getGender());
        appUser.setPassword(appUserAddDto.getPassword());
        appUser.setNickName(appUserAddDto.getNickName());
        return appUser;
    }
}
