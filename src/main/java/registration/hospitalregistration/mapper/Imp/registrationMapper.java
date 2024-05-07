package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */

@Mapper
public interface registrationMapper {
    void registrationDeleteByDoctor(Integer id);
    List<Registration_> List();

    List<Registration_> ListByDoctorId(Integer id);

    List<Registration_> ListByDepartmentId(Integer id);

    void Update(Patient patient);

    void Delete(Integer id);

    void Add(Registration_ registration);
}
