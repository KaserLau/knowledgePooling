package com.better.knowledgepooling.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 9:21 PM 10/28/2018
 * @Modified By :
 */
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    @NotBlank(message = "UserName不能为空")
    private String userName;
    @NotBlank(message = "LoginName不能为空")
    private String loginName;
    @NotBlank(message = "性别不能为空")
    private String sex;
    @NotNull(message = "年龄不能为空")
    private int age;
}