package registration.hospitalregistration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: 为方便处理数据定义实体类
 * @author: yang
 * @date: 2024/4/21 19:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    private Integer id;
    private Integer age;
    private String name;
    private Integer gender;
    private Date birthday;
    private Date createTime;
    private String technical;
    private Integer departmentId;
    private String department;
}
