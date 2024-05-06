package registration.hospitalregistration.Server.Imp;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
import registration.hospitalregistration.pojo.Doctor;

import java.time.LocalDateTime;
import java.util.List;


@Service
@Data
public class doctorServer implements doctorServerImp{

//
    @Resource
    private final doctorMapper dmp;

    @Resource
    private registrationMapper rgp;

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


    @Override
    public void doctorAdd(Doctor doctor) {
        dmp.doctorInsert(doctor);
    }

    public List<Doctor> doctorListByPatientId(Integer id) {
        return dmp.doctorListByPatientId(id);
    }

    /**
     * 此处应使用事务使注册单删除和医生删除要同步，不可分割
     * @param id
     */
    @Transactional//这个注解可以用于开启和提交事务
    public void doctorDelete(Integer id) {
        rgp.registrationDeleteByDoctor(id);
        dmp.doctorDelete(id);
    }

    /**
     * 医生更新
     * @param doctor
     */
    public void doctorUpdate(Doctor doctor) {
       doctor.setUpdateTime(LocalDateTime.now());
       dmp.doctorUpdate(doctor);
    }
}
