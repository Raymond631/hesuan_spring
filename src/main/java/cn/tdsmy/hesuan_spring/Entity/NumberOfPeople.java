package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/3/4 20:47
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NumberOfPeople{
    private int id;
    private int lastNum;
    private int number;
    private String timeNow;
}
