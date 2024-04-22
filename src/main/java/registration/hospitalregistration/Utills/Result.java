package registration.hospitalregistration.Utills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 标准返回类
 * @author: yang
 * @date: 2024/4/21 20:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;


    /**
     * @description: 返回不带数据的Result
     * @return: Registration_.hospitalregistration.Utills.Result
     * @author: Yang
     * @date: 2024/4/21 21:12
     */


    public static Result success() {
        return new Result(1, "success", null);
    }

/**
 * @description: 查询成功返回数据
 * @return: Registration_.hospitalregistration.Utills.Result
 * @author: Yang
 * @date: 2024/4/21 21:31
 */
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    /**
     * @description:
     * @return: Registration_.hospitalregistration.Utills.Result
     * @author: Yang
     * @date: 2024/4/21 21:16
     */

    public static Result error(String msg) {
        return new Result(0, msg, null);
    }

}
