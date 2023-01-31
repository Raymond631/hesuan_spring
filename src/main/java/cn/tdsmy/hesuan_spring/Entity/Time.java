package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 10:46
 * @Version 1.0
 */
public class Time implements Serializable {
    @Serial
    private static final long serialVersionUID = -110205399388986294L;

    private String id;
    private int queue_id;
    private String start_time;
    private String end_time;
    private int max_num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(int queue_id) {
        this.queue_id = queue_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getMax_num() {
        return max_num;
    }

    public void setMax_num(int max_num) {
        this.max_num = max_num;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", queue_id=" + queue_id +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", max_num=" + max_num +
                '}';
    }
}
