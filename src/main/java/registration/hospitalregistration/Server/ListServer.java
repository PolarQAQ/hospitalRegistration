package registration.hospitalregistration.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.Server.Imp.server;
import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.mapper.Imp.patientMapper;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
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
    private final doctorMapper doctormapper;
    private final patientMapper patientmapper;
    private final registrationMapper registrationmapper;

    @Autowired
    public ListServer(doctorMapper doctormapper, patientMapper patientmapper, registrationMapper registrationmapper) {
        this.doctormapper = doctormapper;
        this.patientmapper = patientmapper;
        this.registrationmapper = registrationmapper;
    }

    @Override
    public List<Doctor> doctorList() {
        return doctormapper.doctorList();
    }

    @Override
    public List<Patient> patientList() {
        return doctormapper.patientList();
    }

   @Override
    public List<Registration_> registrationList() {
        return doctormapper.registrationList();
    }

    public List<Doctor> doctorListById(int id) {
        return doctormapper.doctorListById(id);
    }
}
