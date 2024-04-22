package registration.hospitalregistration.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.Server.Imp.server;
import registration.hospitalregistration.mapper.Imp.listMapperImp;
import registration.hospitalregistration.pojo.Doctor;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

/**
 * @description: 处理列表页面的逻辑
 * @author: yang
 * @date: 2024/4/21 21:51
 */
@Service
public class ListServer implements server {
    private final listMapperImp list;

    @Autowired
    public ListServer(listMapperImp list) {
        this.list = list;
    }

    @Override
    public List<Doctor> doctorList() {
        return list.doctorList();
    }

    @Override
    public List<Patient> patientList() {
        return list.patientList();
    }

   @Override
    public List<Registration_> registrationList() {
        return list.registrationList();
    }

}
