package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:26
 * @Version 1.0
 */
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -6006306858490582805L;

    private String username;
    private String password;
    private String phone;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
