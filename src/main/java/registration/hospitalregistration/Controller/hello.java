package registration.hospitalregistration.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 向所指网址发送ok
 * @author: yang
 * @date: 2024/4/21 10:55
 */
@RestController
@Slf4j
public class hello {

    @RequestMapping("/hello")
    public String helloworld() {
        log.info("Hello world");
        return "OK";
    }
}
