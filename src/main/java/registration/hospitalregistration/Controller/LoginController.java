package registration.hospitalregistration.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import registration.hospitalregistration.Server.Imp.doctorServer;
import registration.hospitalregistration.Utils.JwtUtil;
import registration.hospitalregistration.Utils.Result;
import registration.hospitalregistration.mapper.Imp.doctorMapper;
import registration.hospitalregistration.pojo.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
@RestController
public class LoginController {

    private doctorServer dser;
    private doctorMapper dmp;

    @Autowired
    public LoginController(doctorServer dser, doctorMapper dmp) {
        this.dser = dser;
        this.dmp = dmp;
    }

    @PostMapping("/login")
    public Result login(@RequestBody Doctor doctor) {
        log.info("医生登录");
        Doctor d = dmp.login(doctor);

        if(d != null) {//如果查询到则生成jwt，返回给前端
            Map<String , Object> claims = new HashMap<>();
            claims.put("id", d.getId());
            claims.put("name", d.getName());
            claims.put("username", d.getUsername());
             String jwt = JwtUtil.generateJwt(claims);
             return Result.success(jwt);
        }

        return Result.error("用户或密码错误");
    }
}
