package registration.hospitalregistration.Controller.imp;

import org.springframework.web.bind.annotation.RestController;
import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.pojo.Doctor;

/**
 * @author Young
 * @version 1.0
 */

public interface doctorControllerImp {
    Result doctorList();
    Result doctorListByDepartmentId(Integer id);
    Result doctorListByName(String name);
    Result doctorAdd(Doctor doctor);
    Result doctorUpdate(Doctor doctor);
    Result doctorListByNameByDepartmentId(String name, Integer id);
    Result doctorDelete(Integer id);
}
