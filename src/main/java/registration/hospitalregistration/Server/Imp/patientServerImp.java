package registration.hospitalregistration.Server.Imp;

import registration.hospitalregistration.pojo.Patient;

import java.util.List;

/**
 * @author yang
 * @version 1.0
 */
public interface patientServerImp {
    List<Patient> List();
    List<Patient> ListByDoctorId(Integer id);
    List<Patient> ListByDepartmentId(Integer id);
    void Update(Patient patient);
    void Delete(Integer id);
    void Add(Patient patient);
}
