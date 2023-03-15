package com.ekip.pchat.api.httpResponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessDataResponse<T> extends DataResponse<T>{
    public SuccessDataResponse(String message,T data){
        super(message,true,data);
    }
}
