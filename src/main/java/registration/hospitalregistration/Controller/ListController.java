package registration.hospitalregistration.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
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

    @PostMapping("/file_test")
    public Result file_test (String name, Integer age, MultipartFile image) {
        log.info("表单上传：{}, {}, {}", name, age, image);
        return Result.success();
    }

    @GetMapping("/doctorListById/{id}")
    public Result doctorListById(@PathVariable int id) {
        log.info("通过id {} 返回部门的医生", id);
        return Result.success(server.doctorListById(id));
    }
}
