package registration.hospitalregistration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @description: 病人类
 * @author: yang
 * @date: 2024/4/22 8:07
 */

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Integer id;
    private String name;
    private Integer gender;
    private Date birthday;
    private String idNumber;
    private String phone;
    private String address;
    private LocalDateTime createTime;
    private Integer doctorId;
    private String doctorName;
    private Integer departmentId;
    private String department;
    private LocalDateTime updateTime;
    private String state;
}
