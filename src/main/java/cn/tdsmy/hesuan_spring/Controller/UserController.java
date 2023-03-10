package cn.tdsmy.hesuan_spring.Controller;

import cn.tdsmy.hesuan_spring.Entity.Certificate;
import cn.tdsmy.hesuan_spring.Entity.CertificateResolved;
import cn.tdsmy.hesuan_spring.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 10:24
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(@RequestBody Certificate certificate) throws JsonProcessingException {
        String openID = userService.getOpenID(certificate);
        CertificateResolved certificateResolved =new CertificateResolved();
        certificateResolved.setOpenid(openID);
        return certificateResolved;
    }
}
