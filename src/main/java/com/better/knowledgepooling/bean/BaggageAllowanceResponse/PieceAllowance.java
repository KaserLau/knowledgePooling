package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:18 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class PieceAllowance {
    @XmlElement(name = "applicableParty", required = true)
    private String applicableParty;
    @XmlElement(name = "totalQuantity", required = true)
    private String totalQuantity;
    @XmlElement(name = "descriptions", required = true)
    private Descriptions descriptions;
    @XmlElement(name = "pieceMeasurements", required = true)
    private PieceMeasurements pieceMeasurements;
}
