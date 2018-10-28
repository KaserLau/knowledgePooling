package com.better.knowledgepooling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
* @MapperScan("SQL mapper文件所在的文件夹")
* 在SpringBoot启动类中添加@MapperScan指定所有Mybatis所用到的sql都在这个文件夹中，
* 有了这句话只有可以不需要再mapper文件夹中****Mapper文件加入@Mapper注释，也可以被SpringBoot识别
* */
@MapperScan("com.better.knowledgepooling.mapper")
public class KnowledgepoolingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnowledgepoolingApplication.class, args);
    }
}
