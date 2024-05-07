package registration.hospitalregistration.Controller.imp;

import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.pojo.Patient;

/**
 * @author Young
 * @version 1.0
 */
public interface patientControllerImp {
    Result List();
    Result ListByDoctorId(Integer id);
    Result ListByDepartmentId(Integer id);
    Result Update(Patient patient);
    Result Delete(Integer id);
    Result Add(Patient patient);
}
