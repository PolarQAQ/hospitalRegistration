package registration.hospitalregistration.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import registration.hospitalregistration.Controller.imp.doctorListControllerImp;
import registration.hospitalregistration.Server.doctorListServer;
import registration.hospitalregistration.pojo.Result;

/**
 * @description: 实现医生列表页面
 * @author: yang
 * @date: 2024/4/21 20:26
 */
@RestController
@Slf4j
public class doctorListController implements doctorListControllerImp {
    private final doctorListServer dser;
    doctorListController(doctorListServer dser) {
        this.dser = dser;
    }

    @Override
    @GetMapping("/doctorList")
    public Result doctorList() {
        log.info("查询所有医生的信息");
        return Result.success(dser.doctorList());
    }
}
