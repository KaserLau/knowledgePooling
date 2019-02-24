package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:28 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class BaggageDeterminingCarrier {
    @XmlElement(name = "bDCReason", required = true)
    private String bDCReason;
    @XmlElement(name = "airlineId", required = true)
    private String airlineId;
    @XmlElement(name = "name", required = true)
    private String name;
}
