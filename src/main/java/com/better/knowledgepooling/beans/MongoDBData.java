package com.better.knowledgepooling.beans;

import lombok.Data;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 12/5/2018$ 7:05 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
public class MongoDBData {
    private String messageversion;
    private String inOutId;
    private String messageid;
    private String xmlmessage;
    private String subpartnerid;
    private String partnerid;
    private String timestamp;
    private String partnerusername;
}
