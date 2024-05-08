package registration.hospitalregistration.Server.Imp;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.mapper.Imp.departmentMapper;

import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.mapper.Imp.registrationMapper;

import registration.hospitalregistration.pojo.Department;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class departmentServer {

    @Resource
    private departmentMapper dmp;


    @Resource
    private doctorMapper docmp;

    @Resource
    private registrationMapper rmp;

    /**
     * 添加科室
     * @param department
     */

    public void Add(Department department) {
        department.setCreateTime(LocalDateTime.now());
        dmp.Add(department);
    }

    /**
     * 查看科室列表
     * @return
     */

    public List<Department> List() {
        return dmp.List();
    }


    /**
     * 更新科室信息
     * @param department
     */


    public void Update(Department department) {
        dmp.Update(department);
    }


    /**
     * 删除科室，需要同时删除科室中的病人，医生，病历单
     * @param id
     */
    public void Delete(Integer id) {
        docmp.DeleteByDepartmentId(id);
        rmp.DeleteByDepartmentIdentId(id);
        dmp.Delete(id);
    }

}
