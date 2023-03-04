package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/3/4 20:47
 * @Version 1.0
 */
public class NumberOfPeople implements Serializable {
    @Serial
    private static final long serialVersionUID = 7578856918317597937L;
    private String id;
    private int number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberOfPeople{" +
                "id='" + id + '\'' +
                ", number=" + number +
                '}';
    }
}
