package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 10:32
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Queue{
    private int id;
    private String name;
    private String start_day;
    private String end_day;
    private String username;
    private String phone;
    private int person_num;
    private Location location;
    private List<Time> timeList;
}
