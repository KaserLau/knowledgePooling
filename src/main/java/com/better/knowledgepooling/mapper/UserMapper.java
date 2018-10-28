package com.better.knowledgepooling.mapper;

import com.better.knowledgepooling.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 9:16 PM 10/28/2018
 * @Modified By :
 */
public interface UserMapper {

    @Insert("insert into tb_user(age,login_name,sex,user_name)"+"values(#{age},#{loginName},#{sex},#{userName})")
    int insertUser(UserEntity user);

    @Insert("insert into tb_user(age,login_name,sex,user_name)"+"values(#{age},#{loginName},#{sex},#{userName})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertGetKey(UserEntity user);

    /*
    *  @Results 指定返回结果中包含哪些数值，不一定返回全表的所有列的值
    *
    * */
    @Select("select * from tb_user where user_name = #{userName}")
    @ResultMap("userResult")
    UserEntity selectByUserName(@Param("userName") String userName);

    @Select("select * from tb_user")
    @Results(id = "userResult",value = {
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "age",property = "age"),
            @Result(column = "login_name",property = "loginName"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "user_name",property = "userName"),
    })
    List<UserEntity> findAll();

    @Delete("delete from tb_user where id = #{id}")
    void delete(final Integer id);

    @Select("select * from tb_user where id = #{id}")
    @ResultMap("userResult")
    UserEntity findUserById(int id);

    @Update("update tb_user set age=#{age},login_name=#{loginName},sex=#{sex},user_name=#{userName} where id=#{id}")
    void update(UserEntity user,int id);

}

