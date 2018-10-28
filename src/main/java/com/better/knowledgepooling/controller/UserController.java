package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.entity.UserEntity;
import com.better.knowledgepooling.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 9:45 PM 10/28/2018
 * @Modified By :
 */
@RestController
@RequestMapping(value = "/mybatis/user")
/*
* 如果使用Hibernate Validator 对Controller的请求参数做验证，需要添加@Validated，
* 在添加@Validated后会对请求参数中添加有验证注解的参数进行验证并会把验证结果放在BindingResult result中
* 提供给GlobalExceptionHandler(自己写的)识别
* */
@Validated
public class UserController {
    @Resource
    private UserService userService;

    /*
    * @Validated 对请求内容(参数或者对象)做验证，除了Controller中添加，也需要在参数列表中添加
     *
    * */
    @PostMapping(value ="/insert", produces = "application/json")
    public int insertUser(@RequestBody @Validated UserEntity user){
        return userService.insertUser(user);
    }

    @PostMapping(value = "/insertGetKey",produces = "application/json")
    public void insertGetKey(@RequestBody UserEntity user){
        userService.insertGetKey(user);
    }

    /*
    * 使用@NotBlank对参数验证
    * */
    @GetMapping(value = "/selectByUserName",produces = "application/json")
    public UserEntity selectByUserName(@RequestParam("userName") @NotBlank(message = "User name不能为空") String userName){
        return userService.selectByUserName(userName);
    }

    @GetMapping(value = "/selectAll")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @GetMapping(value = "/selectById")
    public UserEntity findUserById(@RequestParam("id") int id){
        return userService.findUserById(id);
    }

    @GetMapping(value = "/deleteById")
    public void delete(@RequestParam("id") final Integer id){
        userService.delete(id);
    }

    @PutMapping(value = "/updateUser",produces = "application/json")
    public void update(@RequestParam("id") int id,
                       @RequestBody UserEntity user){
        userService.update(user,id);
    }
}
