package com.test.accounts.web;

import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Created by 609092482 on 19/03/2020.
 */
@ControllerAdvice
public class AccountErrorController {

    private ErrorAttributes errorAttributes;

    private final static String ERROR_PATH = "/error";

    /**
     * Controller for the Error Controller
     * @param
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(value= HttpStatus.NOT_FOUND)
    @ResponseBody
    public String requestHandlingNoHandlerFound() {
        return "custom_404 -message for 404 error code";
    }

}
