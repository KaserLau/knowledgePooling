package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/22/2019$ 7:26 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class PassengerList {
    @XmlElement(name = "passenger", required = true)
    private List<Passenger> passenger;
}
