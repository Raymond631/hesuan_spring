package cn.tdsmy.hesuan_spring.Service;

import cn.tdsmy.hesuan_spring.Entity.Certificate;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpSession;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:35
 * @Version 1.0
 */
public interface UserService {

    String getOpenID(Certificate certificate) throws JsonProcessingException;

    String getTimeNow();
}
