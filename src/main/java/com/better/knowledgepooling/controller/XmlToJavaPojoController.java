package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.bean.BaggageAllowanceResponse.BaggageAllowanceResponse;
import com.better.knowledgepooling.constant.Constant;
import com.better.knowledgepooling.util.XmlToBeanUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/24/2019$ 4:56 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@RestController
public class XmlToJavaPojoController {
    /*
     * 讲解一下XML数据与Java bean -> BaggageAllowanceResponse 转换的使用：
     * 1.XML数据传输过程中先把它转换为字符串（String）格式，方便使用new StringReader()等方法
     * 2.这里POJO bean BaggageAllowanceResponse 在使用 Unmarshaller 的使用需要用到指定的注解来启动对XML中字符串的识别：
     *   a. 如这里xml数据中的<baggageResponse>是开头的标签，需要用到@XmlRootElement注解指定该标签的内容使它对应 Java Bean BaggageAllowanceResponse，完整的的使用：@XmlRootElement(name = "baggageResponse")
     *   b. 使用@XmlElement(name = "document", required = true)，指定XML 数据 <document>的内容，对应的就是Document对象：private Document document
     *   c. 当XML中有多个相同标签内容的时候其实对应的就是Java中ArrayList的对象： 如：<originDestination>***</originDestination><originDestination>***</originDestination> 对应的就是：private List<OriginDestination> originDestination
     *   d. 如XML中出现： <mediaList/>这种类型的数据时，表明mediaList是没东西的，但是对应的是private MediaList mediaList;也会接收但是值为null
     * 3.需要注意的是使用标签@XmlElement(name = "document")或者@XmlRootElement 里面的名字一定要与XML标签指定的值大小写一致。
     * 4.注意：使用注解@XmlElement的前提需要在bean class中加入注解@XmlAccessorType(XmlAccessType.NONE)，否则@XmlElement会无效并且报错。
     * */
    @GetMapping(value = "/get/baggage/json/pojo")
    public BaggageAllowanceResponse getBaggageData() throws Exception {
        String xmlFormateData = Constant.getXmlData();
        BaggageAllowanceResponse response  = XmlToBeanUtil.convertToJavaBean(xmlFormateData, BaggageAllowanceResponse.class);
        return response;
    }
}
