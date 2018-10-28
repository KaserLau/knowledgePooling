package com.better.knowledgepooling.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 11:53 PM 10/28/2018
 * @Modified By :
 */
@Data
public class ErrorResponse implements Serializable {
    private List<ErrorInfo> errors;
    @Data
    public static class ErrorInfo{
        private String code;
        private String message;
        private String parameters;
    }
}
