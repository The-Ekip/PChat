package com.ekip.pchat.api.httpResponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResponse<T> extends Response{

    private String message;
    private Boolean isSuccess;
    private T data;

    public DataResponse(String message,Boolean isSuccess,T data){
        super(message,isSuccess);
        this.data=data;
        this.message=message;
        this.isSuccess=isSuccess;
    }
}
