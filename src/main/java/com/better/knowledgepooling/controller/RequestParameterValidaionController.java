package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.error.exception.BusinessException;
import com.better.knowledgepooling.request.PersonalRequest;
import com.better.knowledgepooling.service.RequestParameterValidaionService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 2:11 PM 2018/11/25
 * @Modified By :
 */
//Step1 : 创建controller类
@RestController
public class RequestParameterValidaionController {

    @Resource
    private RequestParameterValidaionService service;

    /*
    * 使用Spring validation注解 @Valid 对请求参数的Bean进行验证，需要在后面添加 BindingResult，因为验证后的信息会存放在这里面
    * */
    //Step2：提供API接口
    @PostMapping(value ="/validition/test",produces = "application/json")
    //Step4：使用@Valid 请求Bean做绑定，添加BindingResult在参数列表中，获取验证结果
    public void parameterValidation(@Valid @RequestBody PersonalRequest request, BindingResult bindingResult) throws BusinessException {
        service.parameterValidationHandler(request,bindingResult);
    }
}
