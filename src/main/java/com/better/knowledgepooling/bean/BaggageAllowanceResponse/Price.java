package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:45 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
public class Price {
    private String Total;
    private Details Details;
    private Taxes Taxes;
}
