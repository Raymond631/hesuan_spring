package cn.tdsmy.hesuan_spring.Service.Impl;

import cn.tdsmy.hesuan_spring.Entity.Message;
import cn.tdsmy.hesuan_spring.Entity.NumberOfPeople;
import cn.tdsmy.hesuan_spring.Mapper.AndroidMapper;
import cn.tdsmy.hesuan_spring.Service.AndroidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Raymond Li
 * @Date: 2023/3/4 19:35
 * @Version 1.0
 */
@Service
public class AndroidServiceImpl implements AndroidService {
    @Autowired
    private AndroidMapper androidMapper;

    @Override
    public Object updateNumberOfPeople(NumberOfPeople numberOfPeople) {
        androidMapper.updateNumberOfPeople(numberOfPeople);
        return new Message(1, "人数更新成功");
    }
}
