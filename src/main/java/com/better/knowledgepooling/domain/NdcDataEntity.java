package com.better.knowledgepooling.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 12/5/2018$ 4:44 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
public class NdcDataEntity {
    @Id
    private Long id;
    private String messageversion;
    private String inOutId;
    private String messageid;
    private String xmlmessage;
    private String subpartnerid;
    private String partnerid;
    private String timestamp;
    private String partnerusername;
}
