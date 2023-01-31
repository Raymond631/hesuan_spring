package cn.tdsmy.hesuan_spring.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 11:47
 * @Version 1.0
 */
@Mapper
public interface QueueMapper {
    @Insert("insert into queue (id,name,start_day,end_day,username,phone,person_num) values (#{id},#{name},#{start_day},#{end_day},#{username},#{phone},#{person_num})")
    int insertQueue(String id, String name, String start_day, String end_day, String username, String phone, int person_num);

    @Insert("insert into location (queue_id,lat,lng,province,city,district,address,distance) values (#{queue_id},#{lat},#{lng},#{province},#{city},#{district},#{address},#{distance})")
    void insertLocation(String queue_id, BigDecimal lat, BigDecimal lng, String province, String city, String district, String address, int distance);

    @Insert("insert into time (queue_id,start_time,end_time,max_num) values (#{queue_id},#{start_time},#{end_time},#{max_num})")
    void insertTime(String queue_id, String start_time, String end_time, int max_num);
}
