package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 6:09 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
@XmlAccessorType(XmlAccessType.NONE)
public class Error {
    @XmlElement(name = "language", required = true)
    private String language;
    @XmlElement(name = "type", required = true)
    private String type;
    @XmlElement(name = "shortText", required = true)
    private String shortText;
    @XmlElement(name = "code", required = true)
    private String code;
    @XmlElement(name = "docURL", required = true)
    private String docURL;
    @XmlElement(name = "status", required = true)
    private String status;
    @XmlElement(name = "tag", required = true)
    private String tag;
    @XmlElement(name = "recordID", required = true)
    private String recordID;
    @XmlElement(name = "nodeList", required = true)
    private String nodeList;
}
