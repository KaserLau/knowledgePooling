package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/21/2019$ 4:25 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class Document {
    @XmlElement(name = "referenceVersion", required = true)
    private String referenceVersion;
}
