package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:03 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class MaximumWeight {
    @XmlElement(name = "value", required = true)
    private String value;
    @XmlElement(name = "uOM", required = true)
    private String uOM;
    @XmlElement(name = "spreadOverBagsQuantity", required = true)
    private int spreadOverBagsQuantity;
}
