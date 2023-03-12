package com.ekip.pchat.exceptionHandler;

import com.ekip.pchat.exceptionHandler.exceptions.EntityNotFountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(value
            = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity handleConflict(
            RuntimeException ex, WebRequest request) {
        return new ResponseEntity("IllegalArgument exception",HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(value= { EntityNotFountException.class, EntityNotFountException.class })
    protected ResponseEntity handleNotFoundConflict(
            RuntimeException ex, WebRequest request) {
        return new ResponseEntity("entity not found",HttpStatus.NOT_FOUND);
    }

}
