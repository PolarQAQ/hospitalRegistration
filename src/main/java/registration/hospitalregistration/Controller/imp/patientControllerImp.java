package registration.hospitalregistration.Controller.imp;

import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.pojo.Patient;

/**
 * @author Young
 * @version 1.0
 */
public interface patientControllerImp {
    Result patientList();
    Result patientListByDoctorId(Integer id);
    Result patientListByDepartmentId(Integer id);
    Result patientUpdate(Patient patient);
    Result patientDelete();
    Result patientAdd(Patient patient);
}
