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
    private  registrationServer server;
    @Resource
    private  registrationMapper mapper;

    /**病历单列表
     * @return
     */
    @Override
    @GetMapping
    public Result List() {
        log.info("查询病历单列表");
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

    /**更新病历单信息
     * @param registration
     * @return
     */
    @Override
    @PutMapping
    public Result Update(@RequestBody Registration_ registration) {
        log.info("更新病历单信息");
        server.Update(registration);
        return Result.success();
    }

    /**
     * 通过病历单id治疗病人
     * @param id
     * @return
     */
    @PutMapping("/treat/{id}")
    public Result treat(@PathVariable Integer id) {
        log.info("通过病历单治疗病人:{}", id);
        server.treat(id);
        return Result.success();
    }

    @PutMapping("/treat/patient/{id}")
    public Result treatByPatientId(@PathVariable Integer id) {
        log.info("通过病人id治疗病人");
        server.treatByPatientId(id);
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
    @PostMapping
    public Result Add(Registration_ registration) {
        log.info("添加病历单{}",registration);
        server.Add(registration);
        return Result.success();
    }
}
