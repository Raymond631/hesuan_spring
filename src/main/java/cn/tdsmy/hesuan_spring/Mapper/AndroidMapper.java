package cn.tdsmy.hesuan_spring.Mapper;

import cn.tdsmy.hesuan_spring.Entity.NumberOfPeople;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @Author: Raymond Li
 * @Date: 2023/3/4 19:35
 * @Version 1.0
 */
@Mapper
public interface AndroidMapper {

    @Update("update queue set person_num = #{number} , num_update_time = #{timeNow} where id = #{id}")
    void updateNumberOfPeople(NumberOfPeople numberOfPeople);
}
