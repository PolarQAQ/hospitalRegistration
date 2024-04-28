package registration.hospitalregistration.Server.Imp;

import registration.hospitalregistration.pojo.Patient;

import java.util.List;

/**
 * @author yang
 * @version 1.0
 */
public interface patientServerImp {
    List<Patient> patientList();
    List<Patient> patientListByDoctorId(Integer id);
    List<Patient> patientListByDepartmentId(Integer id);
    void patientUpdate(Patient patient);
    void patientDelete();
    void patientAdd(Patient patient);
}
