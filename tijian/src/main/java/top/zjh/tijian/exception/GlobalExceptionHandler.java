package top.zjh.tijian.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zjh.tijian.pojo.Result;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class) //声明处理所有异常
    @ResponseBody  //Object--json
    public Object handlerException(Exception e) {
        //1.对于异常要重视，要日志输出
        // log.error("exception:"+e);
        //2.返回一个标准响应格式给用户
        return Result.fail(TiJianExceptionEnum.SYSTEM_ERROR);
    }

    @ExceptionHandler(TiJianException.class) //声明只处理商城业务异常
    @ResponseBody  //Object--json
    public Object NeueduMallException(TiJianException e) {
        //1.对于异常要重视，要日志输出
        //   log.error("exception:"+e);
        //2.返回一个标准响应格式给用户
        return Result.error(e.getCode(), e.getMsg());
    }
}
