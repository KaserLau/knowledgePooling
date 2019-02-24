package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:16 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class Dimensions {
    @XmlElement(name = "category", required = true)
    private String category;
    @XmlElement(name = "maxValue", required = true)
    private String maxValue;
    @XmlElement(name = "descriptions", required = true)
    private Descriptions descriptions;
}
