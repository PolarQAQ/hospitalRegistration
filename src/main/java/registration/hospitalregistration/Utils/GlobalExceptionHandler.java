package registration.hospitalregistration.Utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//controllerAdvice + ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)//表示要捕获什么类型的异常，这里是全部
    public Result ex(Exception ex) {
        ex.printStackTrace();
        return Result.error("对不起，操作失败，请联系管理员改正错误");
    }
}
