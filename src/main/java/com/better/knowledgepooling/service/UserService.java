package com.better.knowledgepooling.service;

import com.better.knowledgepooling.entity.UserEntity;
import com.better.knowledgepooling.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 9:47 PM 10/28/2018
 * @Modified By :
 */
@Service
public class UserService {
    @Resource
    private UserMapper mapper;

    @Transactional
    public int insertUser(UserEntity user){
        return mapper.insertUser(user);
    }

    @Transactional
    public void insertGetKey(UserEntity user){
        mapper.insertGetKey(user);
    }

    public UserEntity selectByUserName(String userName){
        return mapper.selectByUserName(userName);
    }

    public List<UserEntity> findAll(){
        return mapper.findAll();
    }

    public UserEntity findUserById(int id){
        return mapper.findUserById(id);
    }

    @Transactional
    public void delete(final Integer id){
        mapper.delete(id);
    }

    @Transactional
    public void update(UserEntity user,int id){
        mapper.update(user,id);
    }
}
