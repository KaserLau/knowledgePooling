package com.better.knowledgepooling.entity;

import com.better.knowledgepooling.enums.UserSexEnum;
import lombok.Data;

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
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;
}