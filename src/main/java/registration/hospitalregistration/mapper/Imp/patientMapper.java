package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
import registration.hospitalregistration.pojo.Patient;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */
@Mapper
public interface patientMapper {
    List<Patient> patientList();
}
