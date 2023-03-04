package cn.tdsmy.hesuan_spring.Controller;

import cn.tdsmy.hesuan_spring.Entity.NumberOfPeople;
import cn.tdsmy.hesuan_spring.Service.AndroidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Raymond Li
 * @Date: 2023/3/4 19:33
 * @Version 1.0
 */
@RestController
@RequestMapping("/android")
public class AndroidController {
    @Autowired
    private AndroidService androidService;

    @PutMapping("/numberOfPeople")
    public Object updateNumberOfPeople(@RequestBody NumberOfPeople numberOfPeople) {
        System.out.println(numberOfPeople.toString());
        return androidService.updateNumberOfPeople(numberOfPeople.getId(), numberOfPeople.getNumber());
    }
}
