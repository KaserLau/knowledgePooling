package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 4:35 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "baggageResponse")
public class BaggageAllowanceResponse {

    @JsonProperty("document")
    @XmlElement(name = "document", required = true)
    private Document document;

    @JsonProperty("originDestination")
    @XmlElement(name = "originDestination", required = true)
    private List<OriginDestination> originDestination;

    @JsonProperty("dataLists")
    @XmlElement(name = "dataLists", required = true)
    private DataLists dataLists;

    @JsonProperty("success")
    @XmlElement(name = "success", required = true)
    private String success;
}
