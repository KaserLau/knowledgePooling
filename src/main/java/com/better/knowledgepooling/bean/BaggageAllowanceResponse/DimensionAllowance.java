package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:14 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class DimensionAllowance {
    @XmlElement(name = "applicableParty", required = true)
    private String applicableParty;
    @XmlElement(name = "dimensionUOM", required = true)
    private String dimensionUOM;
    @XmlElement(name = "maxLinear", required = true)
    private String maxLinear;
    @XmlElement(name = "minLinear", required = true)
    private String minLinear;
    @XmlElement(name = "dimensions", required = true)
    private Dimensions dimensions;
}
