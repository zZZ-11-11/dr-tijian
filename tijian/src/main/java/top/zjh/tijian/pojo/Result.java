package top.zjh.tijian.pojo;

import top.zjh.tijian.exception.TiJianExceptionEnum;

public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    public static <T> Result<T> success() {
        return new Result<>(200, "success");
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(400, msg);
    }

    public static <T> Result<T> error(Integer code, String msg) {
        return new Result<>(code, msg);
    }

    public static <T> Result<T> fail(TiJianExceptionEnum tiJianExceptionEnum) {
        return new Result<>(tiJianExceptionEnum.getCode(), tiJianExceptionEnum.getMsg());
    }

    public static <T> Result<T> fail(TiJianExceptionEnum tiJianExceptionEnum, T data) {
        return new Result<>(tiJianExceptionEnum.getCode(), tiJianExceptionEnum.getMsg(), data);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
