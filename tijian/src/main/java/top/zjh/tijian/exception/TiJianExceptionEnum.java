package top.zjh.tijian.exception;

public enum TiJianExceptionEnum {

    USER_REGISTERED("该用户已注册", 10001),
    SYSTEM_ERROR("系统错误", 10000);
    private Integer code;  //  10010  您的密码缺失
    private String msg;

    TiJianExceptionEnum() {
    }

    TiJianExceptionEnum(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
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
}
