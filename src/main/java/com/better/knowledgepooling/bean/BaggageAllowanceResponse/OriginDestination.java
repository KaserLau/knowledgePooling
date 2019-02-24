package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 4:57 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class OriginDestination {
    @XmlElement(name = "departureCode", required = true)
    private String departureCode;
    @XmlElement(name = "arrivalCode", required = true)
    private String arrivalCode;
    @XmlElement(name = "checkedBags", required = true)
    private CheckedBags checkedBags;
}
