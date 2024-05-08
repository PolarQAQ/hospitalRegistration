package registration.hospitalregistration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @description: 为方便数据交互创建实体类
 * @author: yang
 * @date: 2024/4/21 19:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer id;
    private String name;
    private Integer directorId;
    private LocalDateTime createTime;
}
