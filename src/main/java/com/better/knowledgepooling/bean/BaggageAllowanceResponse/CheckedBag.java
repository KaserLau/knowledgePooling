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
 * @CreateDate: 2/20/2019$ 4:59 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class CheckedBag {
    @XmlAttribute(name="refs")
    private String refs;
    @XmlElement(name = "pieceAllowance", required = true)
    private PieceAllowance pieceAllowance;
    @XmlElement(name = "weightAllowance", required = true)
    private List<WeightAllowance> weightAllowance;
}
