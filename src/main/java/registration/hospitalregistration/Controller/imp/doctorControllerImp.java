package registration.hospitalregistration.Controller.imp;

import org.springframework.web.bind.annotation.RestController;
import registration.hospitalregistration.Utils.Result;

/**
 * @author Young
 * @version 1.0
 */
@RestController
public interface doctorControllerImp {
    Result doctorList();
    Result doctorListByDepartmentId(Integer id);
    Result doctorListByName(String name);

//    Result doctorListByNameByDepartmentId(String name, Integer id);

}
