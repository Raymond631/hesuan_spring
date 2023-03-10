package cn.tdsmy.hesuan_spring.Mapper;

import org.apache.ibatis.annotations.*;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:36
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (user_id,last_login_time) VALUES (#{openID},#{time}) ON DUPLICATE KEY UPDATE last_login_time=#{time};")
    void insertOrUpdateUser(String openID, String time);
}
