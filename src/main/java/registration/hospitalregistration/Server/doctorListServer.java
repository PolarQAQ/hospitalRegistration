package registration.hospitalregistration.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.hospitalregistration.Server.Imp.ser;
import registration.hospitalregistration.mapper.Imp.doctorListMapperImp;
import registration.hospitalregistration.pojo.doctor;

import java.util.List;

/**
 * @description: 处理野生列表页面的逻辑
 * @author: yang
 * @date: 2024/4/21 21:51
 */
@Service
public class doctorListServer implements ser {


private doctorListMapperImp domp;

    private final doctorListMapperImp emp;

    @Autowired
    public doctorListServer(doctorListMapperImp emp) {
        this.emp = emp;
    }

    @Override
    public List<doctor> doctorList() {
        return emp.doctorList();
    }

}
