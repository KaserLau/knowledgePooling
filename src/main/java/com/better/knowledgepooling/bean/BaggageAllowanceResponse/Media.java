package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:36 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class Media {
    @XmlElement(name = "objectID", required = true)
    private String objectID;
    @XmlElement(name = "mediaLink", required = true)
    private String mediaLink;
    @XmlElement(name = "descriptions", required = true)
    private Descriptions descriptions;
}
