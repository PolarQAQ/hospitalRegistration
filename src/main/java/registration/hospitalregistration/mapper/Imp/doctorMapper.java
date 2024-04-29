package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import registration.hospitalregistration.pojo.Doctor;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @description: 通过此接口通过mybatis与数据库进行交互进行查询操作
 */
@Mapper
public interface doctorMapper {


    /*
     * @description: 直接查询所有的医生信息 返回医生列表
     * @return:
     * @author: Yang
     * @date: 2024/4/25 11:23
     */

    List<Doctor> doctorList();

    List<Doctor> doctorListByDepartmentId(@Param("id") int id);


    void doctorInsert(Doctor doctor);

    List<Doctor> doctorListByName(String name);

    List<Doctor> doctorListByNameDepartmentId(String name, Integer id);

    List<Doctor> doctorListByPatientId(Integer id);

    Doctor login(Doctor doctor);
}
