package cn.tdsmy.hesuan_spring.Service;

import cn.tdsmy.hesuan_spring.Entity.Queue;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 17:50
 * @Version 1.0
 */
public interface QueueService {
    Object createQueue(Queue queue);

    String createID();
}
