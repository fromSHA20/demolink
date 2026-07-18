package com.example.demolink.exception;

import com.example.demolink.model.ExceptionError;
import com.example.demolink.model.UserFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// аннотация для обработки ошибок
@RestControllerAdvice
public class ErrorHandler {
    // @org.springframework.web.bind.annotation.ExceptionHandler(UserFoundException.class)
    @ExceptionHandler(UserFoundException.class)

    public ExceptionError userFoundHandler(UserFoundException e) {
        ExceptionError error = new ExceptionError();
        error.setMessage(e.getMessage());
        //   error.setTitel(e.getCause().getMessage());
        return error;
    }

}
