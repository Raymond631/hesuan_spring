package cn.tdsmy.hesuan_spring.Service;

import cn.tdsmy.hesuan_spring.Entity.User;
import jakarta.servlet.http.HttpSession;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:35
 * @Version 1.0
 */
public interface UserService {
    Object register(User user, HttpSession session);

    Object login(String username, String password, HttpSession session);

    Object logout(String username, HttpSession session);

    Object changeUserInfo(User user);

    Object deleteUser(String username, HttpSession session);
}
