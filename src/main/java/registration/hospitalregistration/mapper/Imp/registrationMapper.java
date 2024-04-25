package registration.hospitalregistration.mapper.Imp;

import org.apache.ibatis.annotations.Mapper;
import registration.hospitalregistration.pojo.Registration_;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */

@Mapper
public interface registrationMapper {
    List<Registration_> registrationList();
}
