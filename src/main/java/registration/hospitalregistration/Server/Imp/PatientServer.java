package registration.hospitalregistration.Server.Imp;

import registration.hospitalregistration.mapper.Imp.patientMapper;
import registration.hospitalregistration.pojo.Patient;

import java.util.List;

/**
 * @description: 病人服务端实现
 * @author: Young
 * @date: 2024/4/26 8:26
 */
public class PatientServer implements patientServerImp{

    final private patientMapper pmp;

    public PatientServer(patientMapper pmp) {
        this.pmp = pmp;
    }

    /**
     * @return 病人列表
     */
    @Override
    public List<Patient> patientList() {
        return pmp.patientList();
    }

    /**
     * @param id 医生的主键
     * @return 通过医生主键查询的病人（每个医生的患者）
     */
    @Override
    public List<Patient> patientListByDoctorId(Integer id) {
        return pmp.patientListByDoctorId(id);
    }

    /**
     * @param id 通过部门的主键查询部门的病人
     * @return 病人列表
     */
    @Override
    public List<Patient> patientListByDepartmentId(Integer id) {
        return pmp.patientListByDepartmentId(id);
    }

    /**
     * @param patient
     * 病人数据更新
     *
     */
    @Override
    public void patientUpdate(Patient patient) {

    }

    /**
     *
     */
    @Override
    public void patientDelete() {

    }

    /**
     * @param patient
     * 添加病人信息
     */
    @Override
    public void patientAdd(Patient patient) {

    }
}
