package registration.hospitalregistration.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import registration.hospitalregistration.Controller.imp.doctorControllerImp;
import registration.hospitalregistration.Server.Imp.doctorServer;
import registration.hospitalregistration.Utils.Result;

/**
 * @description: 实现医生的数据发送和接收
 * @author: yang
 * @date: 2024/4/26 0:20
 */
@RestController
@Slf4j
@RequestMapping("/doctor")
public class doctorController implements doctorControllerImp {

    private final doctorServer server;

    doctorController(doctorServer server) {
        this.server = server;
    }

    @Override
    @GetMapping
    public Result doctorList() {
        log.info("查询所有医生的信息");
        return Result.success(server.doctorList());
    }

    /**
     * 通过部门id查询部门的医生
     *
     * @param id 部门id
     * @return 医生列表
     */
    @Override
    @GetMapping("/department/{id}")
    public Result doctorListByDepartmentId(@PathVariable Integer id) {
        log.info("通过id {} 返回部门的医生", id);
        return Result.success(server.doctorListByDepartmentId(id));
    }

    /*
     * @description: 通过姓名模糊查询医生
     * @return:
     * @author: Yang
     * @date: 2024/4/26 0:46
     */
    @Override
    @GetMapping("/{name}")
    public Result doctorListByName(@PathVariable String name) {
        log.info("通过姓名模糊返回医生信息");
        return Result.success(server.doctorListByName(name));
    }

    @GetMapping("/department/{id}/{name}")
    public Result doctorListByNameByDepartmentId(@PathVariable String name, @PathVariable Integer id) {
        log.info("通过部门id和姓名模糊查询医生的列表");
        return Result.success(server.doctorListByNameDepartmentId(name, id));
    }

    @GetMapping("/patient/{id}")
    public Result doctorListByPatientId(@PathVariable Integer id) {
        log.info("通过病人id {} 返回医生的信息", id);
        return Result.success(server.doctorListByPatientId(id));
    }

}
