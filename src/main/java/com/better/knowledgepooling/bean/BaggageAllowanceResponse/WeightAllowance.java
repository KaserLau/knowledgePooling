package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:07 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class WeightAllowance {
    @XmlElement(name = "applicableParty", required = true)
    private String applicableParty;
    @XmlElement(name = "maximumWeight", required = true)
    private MaximumWeight maximumWeight;
    @XmlElement(name = "descriptions", required = true)
    private Descriptions descriptions;
    @XmlElement(name = "dimensionAllowance", required = true)
    private DimensionAllowance dimensionAllowance;
}
