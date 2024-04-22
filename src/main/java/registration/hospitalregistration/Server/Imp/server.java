package registration.hospitalregistration.Server.Imp;

import org.springframework.stereotype.Service;
import registration.hospitalregistration.pojo.Doctor;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */
@Service
public interface server {
    List<Doctor> doctorList();
    List<Patient> patientList();
    List<Registration_> registrationList();
}
