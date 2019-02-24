package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:31 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class CarryOnBag {
    @XmlAttribute(name="refs")
    private String refs;
    @XmlElement(name = "weightAllowance", required = true)
    private WeightAllowance weightAllowance;
    @XmlElement(name = "pieceAllowance", required = true)
    private List<PieceAllowance> pieceAllowance;
    @XmlElement(name = "allowanceDescription", required = true)
    private AllowanceDescription allowanceDescription;
    @XmlElement(name = "baggageDeterminingCarrier", required = true)
    private BaggageDeterminingCarrier baggageDeterminingCarrier;
}
