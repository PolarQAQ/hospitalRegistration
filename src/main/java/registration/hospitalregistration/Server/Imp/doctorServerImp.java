package registration.hospitalregistration.Server.Imp;

import registration.hospitalregistration.pojo.Doctor;

import java.util.List;

/**
 * @author Young
 * @version 1.0
 */

public interface doctorServerImp {
    List<Doctor> doctorList();
    List<Doctor> doctorListByDepartmentId(Integer id);
    List<Doctor> doctorListByName(String name);
    List<Doctor> doctorListByNameDepartmentId(String name, Integer id);
    void doctorAdd(Doctor doctor);
}
