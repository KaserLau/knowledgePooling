package com.better.knowledgepooling.config;

import com.better.knowledgepooling.error.exception.BusinessException;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 4:06 PM 2018/11/25
 * @Modified By :
 */
//Step7:使用@ExceptionHandler捕捉由BusinessException抛出的异常并进行处理
@RestControllerAdvice
public class GlobalExceptionHandler {

    /*
    * 针对自定义BusinessException进行特定处理，用@ExceptionHandler制定需要捕捉的异常信息类
    * */
    @ExceptionHandler(BusinessException.class)
    public JSONObject defaultErrorHandler(BusinessException ex) {
        return ex.getJsonMessage();
    }
}
