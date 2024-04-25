package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import registration.hospitalregistration.pojo.Doctor;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @description: 通过此接口通过mybatis与数据库进行交互进行查询操作
 */
@Mapper
public interface doctorMapper {

//    @Select("select * from doctors")
    List<Doctor> doctorList();
//    @Select("select * from patients")

    /**
     * @description: 传入部门id查看该部门的医生
     * @return: java.util.List<registration.hospitalregistration.pojo.Doctor>
     * @author: Yang
     * @date: 2024/4/25 10:25
     */

    List<Doctor> doctorListById(@Param("id") int id);

    List<Registration_> registrationList();

    List<Patient> patientList();
}
