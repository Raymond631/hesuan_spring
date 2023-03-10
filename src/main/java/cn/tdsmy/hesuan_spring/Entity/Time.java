package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 10:46
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Time{
    private int id;
    private String queue_id;
    private String start_time;
    private String end_time;
    private int max_num;
}
