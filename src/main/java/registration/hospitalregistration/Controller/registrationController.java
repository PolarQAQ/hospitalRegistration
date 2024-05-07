package registration.hospitalregistration.Controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import registration.hospitalregistration.Controller.imp.registrationControllerImp;
import registration.hospitalregistration.Server.Imp.registrationServer;
import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

@RestController
@Slf4j
@RequestMapping("/registration")
public class registrationController implements registrationControllerImp {

    @Resource
    private final registrationServer server;
    @Resource
    private final registrationMapper mapper;

    public registrationController(registrationServer server, registrationMapper mapper) {
        this.server = server;
        this.mapper = mapper;
    }

    /**病历单列表
     * @return
     */
    @Override
    @GetMapping
    public Result List() {
        log.info("查询订单列表");
        return Result.success(server.List());
    }

    /**根据医生id查询病历单
     * @param id
     * @return
     */
    @Override
    @GetMapping("/doctor/{id}")
    public Result ListByDoctorId(@PathVariable Integer id) {
        log.info("根据医生id查询病历单");
        return Result.success(server.ListByDoctorId(id));
    }

    /**通过部门id查询病历单
     * @param id
     * @return
     */
    @Override
    @GetMapping("/department/{id}")
    public Result ListByDepartmentId(@PathVariable Integer id) {
        log.info("根据部门id查询病历单");
        return Result.success(server.ListByDepartmentId(id));
    }

    /**根据病人查询病历单
     * @param patient
     * @return
     */
    @Override
    @PutMapping
    public Result Update(@RequestBody Patient patient) {
        log.info("更新病历单信息");
        server.Update(patient);
        return Result.success();
    }

    /**
     * @return
     */
    @Override
    @DeleteMapping("{id}")
    public Result Delete(@PathVariable Integer id) {
        log.info("根据id删除病历单");
        server.Delete(id);
        return Result.success();
    }

    /**
     * @param registration
     * @return
     */
    @Override
    @PutMapping
    public Result Add(Registration_ registration) {
        log.info("添加病历单{}",registration);
        server.Add(registration);
        return Result.success();
    }
}
