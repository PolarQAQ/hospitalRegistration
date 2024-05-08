package registration.hospitalregistration.Server.Imp;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.mapper.Imp.departmentMapper;
import registration.hospitalregistration.pojo.Department;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class departmentServer {

    @Resource
    private departmentMapper dmp;

    public void Add(Department department) {
        department.setCreateTime(LocalDateTime.now());
        dmp.Add(department);
    }

    public List<Department> List() {
        return dmp.List();
    }

    public void Update(Department department) {
        dmp.Update(department);
    }

    public void Delete(Integer id) {
        dmp.Delete(id);
    }
}
