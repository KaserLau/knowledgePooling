package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.bean.BaggageAllowanceResponse.BaggageAllowanceResponse;
import com.better.knowledgepooling.constant.Constant;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 9:16 PM 2019/2/24
 * @Modified By :
 */
@RestController
public class JsonToJavaPOJOController
{
    @GetMapping(value = "/get/baggage/jsonToPojo")
    public Object jsonToPojo(){
        String jsonData = Constant.jsonData();
        JSONObject jsonObject = JSONObject.fromObject(jsonData);
        BaggageAllowanceResponse  response  = (BaggageAllowanceResponse) JSONObject.toBean(jsonObject,BaggageAllowanceResponse.class);
        return response;
    }
}
