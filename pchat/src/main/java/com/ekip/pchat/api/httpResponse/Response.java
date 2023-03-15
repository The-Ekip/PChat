package com.ekip.pchat.api.httpResponse;

import lombok.Data;

@Data
public class Response {
    private String message;
    private Boolean isSuccess;

    public Response(String message,Boolean isSuccess){
        this.message=message;
        this.isSuccess=isSuccess;
    }
}
