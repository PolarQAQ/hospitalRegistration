package registration.hospitalregistration.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import registration.hospitalregistration.Controller.imp.ListControllerImp;
import registration.hospitalregistration.Server.ListServer;
import registration.hospitalregistration.Utills.Result;

/**
 * @description: 实现列表页面逻辑
 * @author: yang
 * @date: 2024/4/21 20:26
 */
@RestController
@Slf4j
public class ListController implements ListControllerImp {
    private final ListServer server;

    ListController(ListServer server) {
        this.server = server;
    }

    @Override
    @GetMapping("/doctorList")
    public Result doctorList() {
        log.info("查询所有医生的信息");
        return Result.success(server.doctorList());
    }

    @Override
    @GetMapping("/patientList")
    public Result patientList() {
        log.info("查询所有病人信息");
        return Result.success(server.patientList());
    }

    @Override
    @GetMapping("/registrationList")
    public Result registrationList() {
        log.info("查询所有挂号单信息");
        return Result.success(server.registrationList());
    }
}
