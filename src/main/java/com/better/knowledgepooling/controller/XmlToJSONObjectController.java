package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.constant.Constant;
import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/24/2019$ 5:36 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@RestController
public class XmlToJSONObjectController {
    @GetMapping(value = "/get/baggage/json/object")
    public JSON getBaggageData() {
        String xmlFormateData = Constant.getXmlData2();
        //需要添加net.sf.json-lib maven 依赖包
        XMLSerializer xmlSerializer = new XMLSerializer();
        JSON xmlToJson = xmlSerializer.read(xmlFormateData);
//        JSONObject jsonObject = (net.sf.json.JSONObject) xmlToJson;
        return xmlToJson;
    }
}
