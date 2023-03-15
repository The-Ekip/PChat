package com.ekip.pchat.api;

import com.ekip.pchat.api.httpResponse.SuccessDataResponse;
import com.ekip.pchat.domain.user.AppUser;
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
    public ResponseEntity add(@RequestBody AppUser addRequest){
        return new ResponseEntity(new SuccessDataResponse("user created",this.service.add(addRequest)),HttpStatus.CREATED);
    }

}
