package top.zjh.tijian.exception;

public class TiJianException extends RuntimeException {
    private Integer code;  //  10010  您的密码缺失
    private String msg;


    public TiJianException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public TiJianException() {
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
