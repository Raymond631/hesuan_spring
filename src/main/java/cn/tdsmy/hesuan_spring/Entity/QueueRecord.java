package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/2/1 11:16
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueueRecord{
    private String username;
    private String queue_id;
    private String day;
    private int time_id;
    private int status;
}
