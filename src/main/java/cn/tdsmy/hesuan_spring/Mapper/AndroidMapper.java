package cn.tdsmy.hesuan_spring.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @Author: Raymond Li
 * @Date: 2023/3/4 19:35
 * @Version 1.0
 */
@Mapper
public interface AndroidMapper {

    @Update("update queue set person_num = #{number} where id = #{id}")
    void updateNumberOfPeople(String id, int number);
}
