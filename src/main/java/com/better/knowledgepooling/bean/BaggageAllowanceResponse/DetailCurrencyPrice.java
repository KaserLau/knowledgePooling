package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:47 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
public class DetailCurrencyPrice {
    private String Total;
    private Taxes Taxes;
    private Fees Fees;
}
