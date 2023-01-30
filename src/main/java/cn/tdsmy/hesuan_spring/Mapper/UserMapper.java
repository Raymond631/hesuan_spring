package cn.tdsmy.hesuan_spring.Mapper;

import cn.tdsmy.hesuan_spring.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:36
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    List<User> selectUserByUsername(String username);

    @Insert("insert into user (username,password,phone) values (#{username},#{password},#{phone})")
    void insertUser(String username, String password, String phone);

    @Select("select * from user where username = #{username} and password = #{password}")
    List<User> selectUserByUsernameAndPassword(String username, String password);

    @Update("update user set password = #{password},phone = #{phone} where username = #{username}")
    void changeUserInfo(String username, String password, String phone);

    @Delete("delete from user where username = #{username}")
    void deleteUser(String username);
}
