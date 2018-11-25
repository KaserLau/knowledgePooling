package com.better.knowledgepooling.error.exception;

import com.better.knowledgepooling.error.Errors;
import net.sf.json.JSONObject;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 4:06 PM 2018/11/25
 * @Modified By :
 */
//Step6:自定义异常处理类BusinessException，并编写异常处理构造器和方法
public class BusinessException extends Exception {

    public Errors errors;
    public String errorCode;
    public String errorMessage;
    public String parameter;

    /*
    * 对使用Spring validation验证后的所得到的信息进行遍历
    * */
    public BusinessException(String errorCode, BindingResult bindingResult){
        Errors error = new Errors();
        List<Errors.ErrorInfo> errors = new ArrayList<>();
        for(int i=0 ; i<bindingResult.getFieldErrors().size(); i++){
            Errors.ErrorInfo errorInfo = new Errors.ErrorInfo();
            errorInfo.setCode(errorCode);
            errorInfo.setMessage(bindingResult.getFieldErrors().get(i).getDefaultMessage());
            errorInfo.setParameter(bindingResult.getFieldErrors().get(i).getField());
            errors.add(errorInfo);
            error.setErrors(errors);
        }
        this.errors=error;
    }

    public BusinessException(String errorCode,String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage= errorMessage;
        this.errors= this.errorsHandler();
    }

    public BusinessException(String errorCode,String errorMessage,String parameter){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.parameter = parameter;
        this.errors= this.errorsHandler();
    }

    public Errors errorsHandler(){
        Errors error = new Errors();
        List<Errors.ErrorInfo> errors = new ArrayList<>();
        Errors.ErrorInfo errorInfo = new Errors.ErrorInfo();
        errorInfo.setCode(errorCode);
        errorInfo.setMessage(errorMessage);
        errorInfo.setParameter(parameter);
        errors.add(errorInfo);
        error.setErrors(errors);
        return error;
    }

    /*
    * 处理JSON格式的error信息，并返回。
    * */
    public JSONObject getJsonMessage(){
        return JSONObject.fromObject(errors);
    }
}
