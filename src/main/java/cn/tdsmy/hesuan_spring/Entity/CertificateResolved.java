package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Raymond Li
 * @create 2023-03-08 22:25
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificateResolved {
    private String openid;
    private String session_key;
}
