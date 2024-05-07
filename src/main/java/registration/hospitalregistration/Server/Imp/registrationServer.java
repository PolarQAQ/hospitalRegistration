package registration.hospitalregistration.Server.Imp;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class registrationServer {

    @Resource
    private registrationMapper rep;

    @Resource
    private doctorMapper dmp;

    public List<Registration_> List() {
        return rep.List();
    }
    public List<Registration_> ListByDoctorId(Integer id) {
        return rep.ListByDoctorId(id);
    }
    public List<Registration_> ListByDepartmentId(Integer id) {
        return rep.ListByDepartmentId(id);
    }

    @Transactional
    public void Update(Registration_ registration) {
        registration.setUpdateTime(LocalDateTime.now());
        rep.Update(registration);
    }

    public void Delete(Integer id) {
        rep.Delete(id);
    }

    @Transactional
    public void Add(Registration_ registration) {
        registration.setUpdateTime(LocalDateTime.now());
        registration.setCreateTime(LocalDateTime.now());
        registration.setState("已挂号");
        rep.Add(registration);
    }
}
