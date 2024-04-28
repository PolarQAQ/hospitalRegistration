package registration.hospitalregistration.Controller.imp;

import registration.hospitalregistration.Utils.Result;

/**@Description: 医生列表页面的逻辑接口
 * @author polar
 * @version 1.0
 */
public interface ListControllerImp {

    /**
     * @description: 返回所有医生的列表数据
     * @return Result
     * @author: Yang
     * @date: 2024/4/21 20:35
     */
    
//    Result doctorList();
    Result patientList();
    Result registrationList();

}
