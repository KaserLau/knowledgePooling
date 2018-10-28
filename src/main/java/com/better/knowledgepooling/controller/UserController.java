package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.entity.UserEntity;
import com.better.knowledgepooling.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 9:45 PM 10/28/2018
 * @Modified By :
 */
@RestController
@RequestMapping(value = "/mybatis/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value ="/insert", produces = "application/json")
    public int insertUser(@RequestBody UserEntity user){
        return userService.insertUser(user);
    }

    @PostMapping(value = "/insertGetKey",produces = "application/json")
    public void insertGetKey(@RequestBody UserEntity user){
        userService.insertGetKey(user);
    }

    @GetMapping(value = "/selectByUserName")
    public UserEntity selectByUserName(@RequestParam("userName") String userName){
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
