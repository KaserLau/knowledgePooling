package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/22/2019$ 10:08 AM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlRootElement(name = "baggageAllowanceRS")
public class BaggageAllowanceRS {
    @JsonProperty("baggageAllowanceRs")
    private BaggageAllowanceResponse BaggageAllowanceRS;
}
