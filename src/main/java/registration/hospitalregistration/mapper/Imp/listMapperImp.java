package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
import registration.hospitalregistration.pojo.Doctor;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * 通过此接口通过mybatis与数据库进行交互
 */
@Mapper
public interface listMapperImp {

//    @Select("select * from doctors")
    List<Doctor> doctorList();
//    @Select("select * from patients")
    List<Patient> patientList();
//    @Select("select * from registrations")
    List<Registration_> registrationList();

}
