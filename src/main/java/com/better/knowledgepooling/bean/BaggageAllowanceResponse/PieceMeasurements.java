package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:21 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class PieceMeasurements {
    @XmlAttribute(name="Quantity")
    private String quantity;
    @XmlElement(name = "pieceWeightAllowance", required = true)
    private PieceWeightAllowance pieceWeightAllowance;
    @XmlElement(name = "pieceDimensionAllowance", required = true)
    private PieceDimensionAllowance pieceDimensionAllowance;
}
