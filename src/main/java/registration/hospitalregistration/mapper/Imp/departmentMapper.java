package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.pojo.Department;

import java.util.List;

@Mapper
public interface departmentMapper {

    /**
     * 返回所有部门列表
     * @return
     */
    @Select("Select * from departments")
    List<Department> List();

    /**
     * 添加部门
     * @param department
     */
    @Insert("insert into departments (name, director_id,create_time) VALUES (#{name},#{directorId},#{createTime})")
    void Add(Department department);


    /**
     * 更新部门
     * @param department
     */
    void Update(Department department);

    @Delete("delete from departments where id=#{id}")
    void Delete(Integer id);
}
