package cn.tdsmy.hesuan_spring.Service.Impl;

import cn.tdsmy.hesuan_spring.Entity.Certificate;
import cn.tdsmy.hesuan_spring.Entity.CertificateResolved;
import cn.tdsmy.hesuan_spring.Mapper.UserMapper;
import cn.tdsmy.hesuan_spring.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:36
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getOpenID(Certificate certificate) throws JsonProcessingException {
        WebClient webClient = WebClient.create("https://api.weixin.qq.com");
        Mono<String> response = webClient
                .get()
                .uri("/sns/jscode2session?appid={p1}&secret={p2}&js_code={p3}&grant_type=authorization_code",certificate.getAppid(),certificate.getSecret(),certificate.getJs_code())
                .retrieve()
                .bodyToMono(String.class);
        String s=response.block();

        ObjectMapper mapper = new ObjectMapper();
        String openID=mapper.readValue(s, CertificateResolved.class).getOpenid();

        String time=getTimeNow();
        userMapper.insertOrUpdateUser(openID,time);
        return openID;
    }

    @Override
    public String getTimeNow() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
