package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
import registration.hospitalregistration.pojo.Patient;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */
@Mapper
public interface patientMapper {
    List<Patient> patientList();
    List<Patient> patientListByDoctorId(Integer id);
    List<Patient> patientListByDepartmentId(Integer id);
    void patientUpdate(Patient patient);
    void patientDelete(Integer id);
    void patientAdd(Patient patient);

}
