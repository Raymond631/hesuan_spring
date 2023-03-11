package cn.tdsmy.hesuan_spring.Mapper;

import cn.tdsmy.hesuan_spring.Entity.*;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 11:47
 * @Version 1.0
 */
@Mapper
public interface QueueMapper {
    @Insert("insert into queue (name,start_day,end_day,username,phone,person_num) values (#{name},#{start_day},#{end_day},#{username},#{phone},#{person_num})")
    @SelectKey(statement = "select last_insert_id()", resultType =int.class,before = false, keyProperty = "id")
    int insertQueue(Queue queue);

    @Insert("insert into location (queue_id,lat,lng,province,city,district,address,distance) values (#{queue_id},#{lat},#{lng},#{province},#{city},#{district},#{address},#{distance})")
    void insertLocation(int queue_id, BigDecimal lat, BigDecimal lng, String province, String city, String district, String address, int distance);

    @Insert("insert into time (queue_id,start_time,end_time,max_num) values (#{queue_id},#{start_time},#{end_time},#{max_num})")
    void insertTime(int queue_id, String start_time, String end_time, int max_num);

    @Select("select * from queue where id = #{id}")
    Queue getQueueData(String id);

    @Select("select * from location where queue_id = #{id}")
    Location getLocationData(int id);

    @Select("select * from time where queue_id = #{id}")
    List<Time> getTimeListData(int id);

    @Insert("insert into queue_record (username,queue_id,day,time_id,status) values (#{username},#{queue_id},#{day},#{time_id},#{status})")
    void insertQueueRecord(String username, int queue_id, String day, int time_id, int status);

    @Select("select id,name from queue")
    List<QueueList> getQueueList();

    //TODO 联表查询
    @Select("select * from queue_record where username = #{username}")
    @Results(value = {
            @Result(column = "id",property = "id"),
            @Result(column = "queue_id",property = "queue_id"),
            @Result(column = "queue_id",property = "queue_name",one=@One(select="cn.tdsmy.hesuan_spring.Mapper.QueueMapper.getQueueNameById")),
            @Result(column = "day",property = "day"),
            @Result(column = "time_id",property = "time_id"),
            @Result(column = "time_id",property = "start_time",one=@One(select="cn.tdsmy.hesuan_spring.Mapper.QueueMapper.getStartTimeById")),
            @Result(column = "time_id",property = "end_time",one=@One(select="cn.tdsmy.hesuan_spring.Mapper.QueueMapper.getEndTimeById")),
            @Result(column = "status",property = "status"),
    })
    List<QueueRecord> getQueueRecord(String username);

    @Select("select name from queue where id = #{queue_id}")
    String getQueueNameById(int queue_id);

    @Select("select start_time from time where id = #{time_id}")
    String getStartTimeById(int time_id);

    @Select("select end_time from time where id = #{time_id}")
    String getEndTimeById(int time_id);
}