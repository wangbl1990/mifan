package com.mifan.guessing.controller;

import com.mifan.guessing.controller.response.BaseResponse;
import com.mifan.guessing.exception.GuessingErrorCode;
import com.mifan.guessing.exception.GuessingRunTimeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {

    private static Logger logger = LogManager.getLogger( BaseController.class );

    @ModelAttribute
    public void init(HttpServletRequest request){

    }

    @ExceptionHandler(GuessingRunTimeException.class)
    public BaseResponse<String> exceptionProcess(HttpServletRequest request, HttpServletResponse
            response, GuessingRunTimeException ex) {
        logger.error(ex);
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.getErrorCode(  ex.getErrorCode() ).getValue(),GuessingErrorCode.getErrorCode(  ex.getErrorCode() ).getMessage(),null);
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse<String> exceptionProcess(HttpServletRequest request, HttpServletResponse
            response, Exception ex) {
        logger.error(ex);
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.FAIL.getMessage(),null);
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<String> runtimeExceptionProcess(HttpServletRequest request, HttpServletResponse
            response, RuntimeException ex) {
        logger.error(ex);
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.FAIL.getMessage(),null);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public BaseResponse<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        String errorMesssage = "";
        if ( !bindingResult.getFieldErrors().isEmpty()) {
//            errorMesssage += fieldError.getDefaultMessage() + "|";
            errorMesssage += bindingResult.getFieldErrors().get( 0 ).getDefaultMessage() ;
        }
        return BaseResponse.generateBadResponseEntity(errorMesssage,null);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public BaseResponse<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.FAIL.getMessage(),null);
    }

}
