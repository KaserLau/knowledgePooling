package com.better.knowledgepooling.handler;

import lombok.Data;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 7:38 AM 10/29/2018
 * @Modified By :
 */
@Data
public class BusinessException extends RuntimeException{
    //自定义错误码
    private String code;
    //自定义构造器，只保留一个，让其必须输入错误码及内容
    public BusinessException(String code,String msg) {
        super(msg);
        this.code = code;
    }
}

