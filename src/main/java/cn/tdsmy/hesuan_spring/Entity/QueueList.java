package cn.tdsmy.hesuan_spring.Entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class QueueList implements Serializable {
    @Serial
    private static final long serialVersionUID = 4342481786058259766L;

    private String id;
    private String name;
}
