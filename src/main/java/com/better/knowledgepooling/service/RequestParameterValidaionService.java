package com.better.knowledgepooling.service;

        import com.better.knowledgepooling.constant.ErrorCode;
        import com.better.knowledgepooling.error.exception.BusinessException;
        import com.better.knowledgepooling.request.PersonalRequest;
        import org.springframework.stereotype.Service;
        import org.springframework.validation.BindingResult;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 3:45 PM 2018/11/25
 * @Modified By :
 */
//Step5：创建service层（习惯分层，如果练手可以不用）
@Service
public class RequestParameterValidaionService {

    public void parameterValidationHandler(PersonalRequest request, BindingResult bindingResult) throws BusinessException {
        /*
         * 用自定义的BusinessException类来处理异常信息，把bindingResult传入给BusinessException做处理并返回JSON格式的返回值
         * */
        if (bindingResult.hasErrors()){
            throw new BusinessException(ErrorCode.GBEX00001,bindingResult);
        } else {
            /*
             * 对正常的错误进行处理
             * */
            throw new BusinessException(ErrorCode.GBEX00002,"Test normal error case!","Test");
        }
    }
}
