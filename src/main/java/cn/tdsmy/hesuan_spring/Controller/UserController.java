package cn.tdsmy.hesuan_spring.Controller;

import cn.tdsmy.hesuan_spring.Entity.User;
import cn.tdsmy.hesuan_spring.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Object register(User user, HttpSession session) {
        return userService.register(user, session);
    }

    @PostMapping("/login")
    public Object login(String username, String password, HttpSession session) {
        return userService.login(username, password, session);
    }

    @GetMapping("/logout")
    public Object logout(String username, HttpSession session) {
        return userService.logout(username, session);
    }

    @PutMapping("/changeUserInfo")
    public Object changeUserInfo(User user) {
        return userService.changeUserInfo(user);
    }

    @DeleteMapping("/deleteUser")
    public Object deleteUser(String username, HttpSession session) {
        return userService.deleteUser(username, session);
    }
}
