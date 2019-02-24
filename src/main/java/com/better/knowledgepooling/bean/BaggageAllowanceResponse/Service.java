package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:39 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
public class Service {
    private String ServiceID;
    private String ServiceIDOwner;
    private String Name;
    private Descriptions Descriptions;
    private Price Price;
    private BookingInstructions BookingInstructions;
    private String ValidatingCarrier;
    private BaggageDeterminingCarrier BaggageDeterminingCarrier;
}
