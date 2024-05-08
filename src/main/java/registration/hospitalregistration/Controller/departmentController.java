package registration.hospitalregistration.Controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import registration.hospitalregistration.Server.Imp.departmentServer;
import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.pojo.Department;

@RestController
@Slf4j
@RequestMapping("/department")
public class departmentController {
    @Resource
    private departmentServer dser;
    @GetMapping
    public Result List() {
        log.info("查看科室");
        return Result.success(dser.List());
    }

    @PostMapping
    public Result Add(@RequestBody Department department) {
        log.info("添加科室");
        dser.Add(department);
        return Result.success();
    }

    @PutMapping
    public Result Update(@RequestBody Department department) {
        log.info("更改科室");
        dser.Update(department);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result Delete(@PathVariable Integer id) {
        log.info("删除科室");
        dser.Delete(id);
        return Result.success();
    }
}
