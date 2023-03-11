package cn.tdsmy.hesuan_spring.Service;

import cn.tdsmy.hesuan_spring.Entity.Queue;
import cn.tdsmy.hesuan_spring.Entity.QueueRecord;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 17:50
 * @Version 1.0
 */
public interface QueueService {
    Object createQueue(Queue queue);

    Object getQueueData(String id);

    Object insertQueueRecord(QueueRecord queueRecord);

    Object getQueueList();

    Object getQueueRecord(String username);

    Object checkIn(int queueRecordID);
}
