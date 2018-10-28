package com.better.knowledgepooling.entity;

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
    private int id;
    private String userName;
    private String loginName;
    private String sex;
    private int age;
}