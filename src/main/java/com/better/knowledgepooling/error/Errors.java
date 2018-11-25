package com.better.knowledgepooling.error;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 4:54 PM 10/14/2018
 * @Modified By :
 */
@Data
public class Errors implements Serializable {
    private List<ErrorInfo> errors;
    @Data
    public static class ErrorInfo{
        private String code;
        private String message;
        private String parameter;
    }
}
