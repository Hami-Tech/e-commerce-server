package com.hmaitech.onlineshop.exceptions;


import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

@ControllerAdvice
public class RestExceptionHandler {


    private static Properties property = new Properties();


    @PostConstruct
    public void init(){
        try {
            property.load(new FileReader("D:\\intelij projects\\mapsa\\projects\\e-commerce-server\\src\\main\\resources\\exceptions_fa_IR.properties",StandardCharsets.UTF_8) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionResponse> handleException(ServiceException exception) {
        ExceptionResponse value = new ExceptionResponse();
        value.setError(true);


        switch (exception.getErrorCode()) {
            case "default": {
                value.setMessage(property.getProperty("default"));
                break;
            }
        }

//
//        if (serviceException instanceof IllegalArgumentException ){
//            value.setMessage("داده وروردی اشتباه است");
//        }
//        if (serviceException instanceof FatalBeanException){
//            value.setMessage("این یوزر وجود ندارد");
//        }
//        if (serviceException instanceof MethodArgumentTypeMismatchException){
//            value.setMessage("نوع داده ورودی اشتباه است");
//        }
//        if(serviceException instanceof MissingServletRequestParameterException){
//            value.setMessage("داده ای برای عملیات داده نشده است");
//        }


        return ResponseEntity.badRequest().body(value);
    }


    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionResponse> handleException(RuntimeException runtimeException) {
        ExceptionResponse value = new ExceptionResponse();
        value.setError(true);

        value.setMessage(property.getProperty("unknown"));

        return ResponseEntity.badRequest().body(value);
    }
}