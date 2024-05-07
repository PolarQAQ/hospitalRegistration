package registration.hospitalregistration.Server.Imp;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

@Slf4j
@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class registrationServer {

    @Resource
    private registrationMapper rep;

    public List<Registration_> List() {
        return rep.List();
    }
    public List<Registration_> ListByDoctorId(Integer id) {
        return rep.ListByDoctorId(id);
    }

    public List<Registration_> ListByDepartmentId(Integer id) {
        return rep.ListByDepartmentId(id);
    }

    public void Update(Patient patient) {
        rep.Update(patient);
    }

    public void Delete(Integer id) {
        rep.Delete(id);
    }

    public void Add(Registration_ registration) {
        rep.Add(registration);
    }
}
