package com.better.knowledgepooling.response;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 11:53 PM 10/28/2018
 * @Modified By :
 */
public class CommonResponse extends ErrorResponse{
    private boolean success = true;

    public CommonResponse() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
