package com.better.knowledgepooling.request;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 2:15 PM 2018/11/25
 * @Modified By :
 */
//Step3：创建请求参数的Bean，使用Spring validation的注解对参数进行验证，注解详细请参考官方文档，这里只是做简单的介绍
@Data
public class PersonalRequest implements request {

    @Size(min=2, max=30,message = "名字的字符长度不正确")
    private String name;

    @NotEmpty(message = "自定义错误信息，Email不能为空")
    @Email(message = "邮件格式不正确")
    private String email;

    @NotNull(message = "参数不能为空")
    @Min(18) @Max(100)
    private Integer age;
}
