package com.better.knowledgepooling.handler;

import com.better.knowledgepooling.response.CommonResponse;
import com.better.knowledgepooling.response.ErrorResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 10:24 PM 10/28/2018
 * @Modified By :
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResponse handleException(Exception e){
        //Hibernate Validator验证消息返回
        BindingResult result = null;
        if (e instanceof MethodArgumentNotValidException){
            result = ((MethodArgumentNotValidException) e).getBindingResult();
        } else if (e instanceof BindException){
            result = ((BindException) e).getBindingResult();
        } else if (e instanceof ConstraintViolationException){
            Set<ConstraintViolation<?>> constraintViolations = ((ConstraintViolationException) e).getConstraintViolations();
            CommonResponse response = new CommonResponse();
            response.setSuccess(false);
            List<ErrorResponse.ErrorInfo> errors = new ArrayList<ErrorResponse.ErrorInfo>();
            for (ConstraintViolation<?> violation : constraintViolations) {
                ErrorResponse.ErrorInfo errorInfo = new ErrorResponse.ErrorInfo();
                errorInfo.setCode("RQEX001");
                errorInfo.setMessage(violation.getMessage());
                errors.add(errorInfo);
                response.setErrors(errors);
            }
            return response;
        }
        if (result != null) {
            CommonResponse response = new CommonResponse();
            response.setSuccess(false);
            List<ErrorResponse.ErrorInfo> errors = new ArrayList<ErrorResponse.ErrorInfo>();
            for(int i=0 ; i<result.getFieldErrors().size(); i++){
                ErrorResponse.ErrorInfo errorInfo = new ErrorResponse.ErrorInfo();
                errorInfo.setCode("RQEX001");
                errorInfo.setParameters(result.getFieldErrors().get(i).getField());
                errorInfo.setMessage(result.getFieldErrors().get(i).getDefaultMessage());
                errors.add(errorInfo);
                response.setErrors(errors);
            }
            return response;
        }
        if(e instanceof BusinessException) {
            CommonResponse response = new CommonResponse();
            response.setSuccess(false);
            List<ErrorResponse.ErrorInfo> errors = new ArrayList<ErrorResponse.ErrorInfo>();
            ErrorResponse.ErrorInfo errorInfo = new ErrorResponse.ErrorInfo();
            BusinessException businessException = (BusinessException)e;
            errorInfo.setCode(businessException.getCode());
            errorInfo.setMessage(businessException.getMessage());
            errors.add(errorInfo);
            response.setErrors(errors);
            return response;
        }
        CommonResponse response = new CommonResponse();
        response.setSuccess(false);
        List<ErrorResponse.ErrorInfo> errors = new ArrayList<ErrorResponse.ErrorInfo>();
        ErrorResponse.ErrorInfo errorInfo = new ErrorResponse.ErrorInfo();
        errorInfo.setMessage(e.getMessage());
        errors.add(errorInfo);
        response.setErrors(errors);
        return response;
    }
}