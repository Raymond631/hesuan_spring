package cn.tdsmy.hesuan_spring.Service.Impl;

import cn.tdsmy.hesuan_spring.Entity.*;
import cn.tdsmy.hesuan_spring.Mapper.QueueMapper;
import cn.tdsmy.hesuan_spring.Service.QueueService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 17:50
 * @Version 1.0
 */
@Service
public class QueueServiceImpl implements QueueService {
    @Autowired
    private QueueMapper queueMapper;

    @Override
    public Object createQueue(Queue queue) {
        queueMapper.insertQueue(queue);

        Location location = queue.getLocation();
        queueMapper.insertLocation(queue.getId(), location.getLat(), location.getLng(), location.getProvince(), location.getCity(), location.getDistrict(), location.getAddress(), location.getDistance());

        List<Time> timeList = queue.getTimeList();
        for (Time time : timeList) {
            queueMapper.insertTime(queue.getId(), time.getStart_time(), time.getEnd_time(), time.getMax_num());
        }
        return new Message(1, "发布成功");
    }

    @Override
    public Object getQueueData(String id) {
        Queue queue= queueMapper.getQueueData(id);
        queue.setLocation(queueMapper.getLocationData(queue.getId()));
        queue.setTimeList(queueMapper.getTimeListData(queue.getId()));
        return queue;
    }

    @Override
    public Object insertQueueRecord(QueueRecord queueRecord) {
        queueMapper.insertQueueRecord(queueRecord.getUsername(), queueRecord.getQueue_id(), queueRecord.getDay(), queueRecord.getTime_id(), queueRecord.getStatus());
        return new Message(1, "预约成功");
    }

    @Override
    public Object getQueueList() {
        return queueMapper.getQueueList();
    }

    @Override
    public Object getQueueRecord(String username) {
        return queueMapper.getQueueRecord(username);
    }
}
