package com.better.knowledgepooling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : yaobin
 * @Description :
 * @Date : Create in 5:34 PM 10/28/2018
 * @Modified By :
 */
@RestController
public class StartHealthCheckController {

    @GetMapping(value = "/health")
    public String healthCheck(){
        return "It is health!";
    }
}
