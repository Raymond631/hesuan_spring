package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 11:18
 * @Version 1.0
 */
public class Message implements Serializable {
    @Serial
    private static final long serialVersionUID = 5436975493805823233L;

    private int code;//状态码
    private Object msg;//响应信息

    public Message() {
    }

    public Message(int code, Object msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", msg=" + msg +
                '}';
    }
}
