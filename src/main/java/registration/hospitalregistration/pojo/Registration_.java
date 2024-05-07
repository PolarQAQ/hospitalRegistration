package registration.hospitalregistration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @description: 注册表类
 * @author: yang
 * @date: 2024/4/22 8:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration_ {
    private Integer id;
    private Integer patientId;
    private String patientName;
    private String doctorName;
    private Integer doctorId;
    private LocalDateTime oppointmentTime;
    private Integer departmentId;
    private LocalDateTime registrationTime;//注册时间
    private String state;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
