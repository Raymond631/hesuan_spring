package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 10:42
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location{
    private int queue_id;
    private BigDecimal lat;
    private BigDecimal lng;
    private String province;
    private String city;
    private String district;
    private String address;
    private int distance;
}
