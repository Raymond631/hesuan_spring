package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/2/1 11:16
 * @Version 1.0
 */
public class QueueRecord implements Serializable {
    @Serial
    private static final long serialVersionUID = 7237579130528025989L;

    private String username;
    private String queue_id;
    private String day;
    private int time_id;
    private int status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(String queue_id) {
        this.queue_id = queue_id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTime_id() {
        return time_id;
    }

    public void setTime_id(int time_id) {
        this.time_id = time_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QueueRecord{" +
                "username='" + username + '\'' +
                ", queue_id='" + queue_id + '\'' +
                ", day='" + day + '\'' +
                ", time_id=" + time_id +
                ", status=" + status +
                '}';
    }
}
