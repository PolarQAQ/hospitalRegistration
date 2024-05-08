package registration.hospitalregistration.mapper.Imp;

import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
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

    void Update(Registration_ registration);

    void Delete(Integer id);

    void Add(Registration_ registration);
    void registrationDeleteByPatientId(Integer id);
    void treat(Integer id);
    void treatByPatientId(Integer id);
    @Delete("delete from registrations where department_id=#{id}")
    void DeleteByDepartmentIdentId(Integer id);
}
