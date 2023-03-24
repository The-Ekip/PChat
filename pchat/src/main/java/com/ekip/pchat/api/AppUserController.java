package com.ekip.pchat.api;

import com.ekip.pchat.api.dto.userdto.AppUserAddRequest;
import com.ekip.pchat.api.httpResponse.SuccessDataResponse;
import com.ekip.pchat.service.abstracts.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService service;

    @GetMapping("/get")
    public ResponseEntity get(){
        return new ResponseEntity(new SuccessDataResponse("users listed",this.service.getAll()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody AppUserAddRequest appUserAddRequest){
        return new ResponseEntity(new SuccessDataResponse("user created",this.service.add(appUserAddRequest)),HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity getUserById(@PathVariable Long userId){
        return new ResponseEntity(new SuccessDataResponse("user listed",this.service.getById(userId)),HttpStatus.OK);
    }

}
