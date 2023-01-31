package cn.tdsmy.hesuan_spring.Entity;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/31 10:42
 * @Version 1.0
 */
public class Location implements Serializable {
    @Serial
    private static final long serialVersionUID = -4888849417977283970L;

    private String queue_id;
    private BigDecimal lat;
    private BigDecimal lng;
    private String province;
    private String city;
    private String district;
    private String address;
    private int distance;

    public String getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(String queue_id) {
        this.queue_id = queue_id;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "location{" +
                "queue_id=" + queue_id +
                ", lat=" + lat +
                ", lng=" + lng +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", distance=" + distance +
                '}';
    }
}
