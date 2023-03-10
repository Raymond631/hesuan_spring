package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:26
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
    private String appid;
    private String secret;
    private String js_code;
}
