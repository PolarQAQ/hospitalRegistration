package registration.hospitalregistration.Server.Imp;

import org.springframework.stereotype.Service;
import registration.hospitalregistration.pojo.doctor;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */
@Service
public interface ser {
    List<doctor> doctorList();
}
