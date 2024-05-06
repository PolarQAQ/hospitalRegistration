package registration.hospitalregistration.Controller.imp;

import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

public interface registrationControllerImp {
    Result List();
    Result ListByDoctorId(Integer id);
    Result ListByDepartmentId(Integer id);
    Result Update(Patient patient);
    Result Delete(Integer id);
    Result Add(Registration_ registration);
}
