package registration.hospitalregistration.Controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import registration.hospitalregistration.Controller.imp.patientControllerImp;
import registration.hospitalregistration.Server.Imp.PatientServer;
import registration.hospitalregistration.Server.Imp.registrationServer;
import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.mapper.Imp.registrationMapper;
import registration.hospitalregistration.pojo.Patient;
import registration.hospitalregistration.pojo.Registration_;

@RestController
@Slf4j
@RequestMapping("/patient")
public class patientController implements patientControllerImp {

    @Resource
    private PatientServer server;
    @Resource
    private registrationMapper mapper;

    /**病人列表
     * @return
     */
    @Override
    @GetMapping
    public Result List() {
        log.info("查询病人列表");
        return Result.success(server.List());
    }

    /**根据医生id查询病人
     * @param id
     * @return
     */
    @Override
    @GetMapping("/doctor/{id}")
    public Result ListByDoctorId(@PathVariable Integer id) {
        log.info("根据医生id查询病人");
        return Result.success(server.ListByDoctorId(id));
    }

    /**通过部门id查询病人
     * @param id
     * @return
     */
    @Override
    @GetMapping("/department/{id}")
    public Result ListByDepartmentId(@PathVariable Integer id) {
        log.info("根据部门id查询病人");
        return Result.success(server.ListByDepartmentId(id));
    }

    /**
     * 通过主键id查询病人
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result ListById(@PathVariable Integer id) {
        log.info("通过id {}",id);
        return Result.success(server.ListById(id));
    }

    /**
     * @param patient
     * @return
     */
    @Override
    @PutMapping
    public Result Update(@RequestBody Patient patient) {
        log.info("更新病人信息");
        server.Update(patient);
        return Result.success();
    }

    /**通过id查询病人
     * @return
     */
    @Override
    @DeleteMapping("{id}")
    public Result Delete(@PathVariable Integer id) {
        log.info("根据id删除病人");
        server.Delete(id);
        return Result.success();
    }

    /**
     * @param patient
     * @return
     */
    @Override
    public Result Add(Patient patient) {
        return null;
    }


}
