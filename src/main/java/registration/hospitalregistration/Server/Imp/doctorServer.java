package registration.hospitalregistration.Server.Imp;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.pojo.Doctor;

import java.util.List;


@Service
@Data

public class doctorServer implements doctorServerImp{

    final private doctorMapper dmp;

    @Autowired
    doctorServer(doctorMapper dmp) {
        this.dmp = dmp;
    }


    /**
     * @return 返回医生列表
     */
    @Override
    public List<Doctor> doctorList() {
        return dmp.doctorList();
    }

    /**
     * @param id 部门id
     * @return 根据部门id查询的医生列表
     */
    @Override
    public List<Doctor> doctorListByDepartmentId(Integer id) {
        return dmp.doctorListByDepartmentId(id);
    }

    /**
     * @param name 传入的医生名称
     * @return 返回医生列表
     */
    @Override
    public List<Doctor> doctorListByName(String name) {
        return dmp.doctorListByName(name);
    }

    /**
     * @param name 医生名称
     * @param id 部门id
     * @return 医生列表
     */
    @Override
    public List<Doctor> doctorListByNameDepartmentId(String name, Integer id) {
        return dmp.doctorListByNameDepartmentId(name, id);
    }
}
