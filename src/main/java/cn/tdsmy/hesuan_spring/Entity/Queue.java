package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 10:32
 * @Version 1.0
 */
public class Queue implements Serializable {
    @Serial
    private static final long serialVersionUID = 4937412966704055236L;

    private String id;
    private String name;
    private String start_day;
    private String end_day;
    private String username;
    private String phone;
    private int person_num;
    private Location location;
    private List<Time> timeList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_day() {
        return start_day;
    }

    public void setStart_day(String start_day) {
        this.start_day = start_day;
    }

    public String getEnd_day() {
        return end_day;
    }

    public void setEnd_day(String end_day) {
        this.end_day = end_day;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPerson_num() {
        return person_num;
    }

    public void setPerson_num(int person_num) {
        this.person_num = person_num;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Time> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<Time> timeList) {
        this.timeList = timeList;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start_day='" + start_day + '\'' +
                ", end_day='" + end_day + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", person_num=" + person_num +
                ", location=" + location +
                ", timeList=" + timeList +
                '}';
    }
}
