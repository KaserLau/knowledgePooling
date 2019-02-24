package com.better.knowledgepooling.bean.BaggageAllowanceResponse;

import lombok.Data;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/20/2019$ 5:49 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@Data
public class Tax {
    private String Amount;
    private String TaxCode;
    private String TaxType;
    private String FiledAmount;
    private String FileTaxType;
}
