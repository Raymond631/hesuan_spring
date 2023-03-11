package cn.tdsmy.hesuan_spring;

import cn.tdsmy.hesuan_spring.Mapper.QueueMapper;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Raymond Li
 * @create 2023-03-11 11:44
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QueueMapperTests {
    @Autowired
    private QueueMapper queueMapper;
    @Test
    public void test(){
        System.out.println("测试结果："+queueMapper.getQueueRecord("张三"));
    }
}
