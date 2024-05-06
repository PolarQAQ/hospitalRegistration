package registration.hospitalregistration.Server.Imp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

@Slf4j
@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class registrationServer {
    public List<Registration_> List() {
        return null;
    }

    public List<Registration_> ListByDoctorId(Integer id) {
        return null;
    }

    public List<Registration_> ListByDepartmentId(Integer id) {
        return null;
    }

    public void Update(Patient patient) {
    }

    public void Delete(Integer id) {
    }

    public void Add(Registration_ registration) {
    }
}
