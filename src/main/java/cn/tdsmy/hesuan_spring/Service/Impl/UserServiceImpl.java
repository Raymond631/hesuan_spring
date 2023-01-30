package cn.tdsmy.hesuan_spring.Service.Impl;

import cn.tdsmy.hesuan_spring.Entity.Message;
import cn.tdsmy.hesuan_spring.Entity.User;
import cn.tdsmy.hesuan_spring.Mapper.UserMapper;
import cn.tdsmy.hesuan_spring.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:36
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Object register(User user, HttpSession session) {
        if (userMapper.selectUserByUsername(user.getUsername()).isEmpty()) {
            userMapper.insertUser(user.getUsername(), user.getPassword(), user.getPhone());
            session.setAttribute("user", user);
            return new Message(1, "注册成功");
        }
        else {
            return new Message(0, "用户名已存在");
        }
    }

    @Override
    public Object login(String username, String password, HttpSession session) {
        if (userMapper.selectUserByUsernameAndPassword(username, password).isEmpty()) {
            return new Message(0, "用户名或密码错误");
        }
        else {
            session.setAttribute("user", new User(username, password));
            return new Message(1, "登录成功");
        }
    }

    @Override
    public Object logout(String username, HttpSession session) {
        session.removeAttribute("user");
        return new Message(1, "退出登录成功");
    }

    @Override
    public Object changeUserInfo(User user) {
        userMapper.changeUserInfo(user.getUsername(), user.getPassword(), user.getPhone());
        return new Message(1, "用户信息修改成功");
    }

    @Override
    public Object deleteUser(String username, HttpSession session) {
        userMapper.deleteUser(username);
        session.removeAttribute("user");
        return new Message(1, "用户注销成功");
    }
}
