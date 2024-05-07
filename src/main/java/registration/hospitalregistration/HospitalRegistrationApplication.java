package registration.hospitalregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan//表示当前项目支持java web用于过滤器
@SpringBootApplication
public class HospitalRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalRegistrationApplication.class, args);
    }

}
