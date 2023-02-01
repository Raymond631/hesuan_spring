package cn.tdsmy.hesuan_spring.Controller;

import cn.tdsmy.hesuan_spring.Entity.Queue;
import cn.tdsmy.hesuan_spring.Entity.QueueRecord;
import cn.tdsmy.hesuan_spring.Service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 17:49
 * @Version 1.0
 */
@RestController
@RequestMapping("/queue")
public class QueueController {
    @Autowired
    private QueueService queueService;

    @PostMapping("/createQueue")
    public Object creatQueue(@RequestBody Queue queue) {
        queue.setId(queueService.createID());
        return queueService.createQueue(queue);
    }

    @GetMapping("/getQueueData")
    public Object getQueueData() {
        return queueService.getQueueData();
    }

    @PostMapping("/insertQueueRecord")
    public Object addToQueue(@RequestBody QueueRecord queueRecord) {
        return queueService.insertQueueRecord(queueRecord);
    }
}
