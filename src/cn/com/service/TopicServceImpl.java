package cn.com.service;

import cn.com.bean.Topic;
import cn.com.dao.TopicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class  TopicServceImpl implements TopicServce{
    @Autowired
    TopicDao topicDao;
    @Override
    public Topic getOneTopic(Integer cid) {
        Integer integer =topicDao.getTopicNumber(cid);
        if (null!=integer && integer>0){
            integer = integer-1;
        }
        Long tid =(Math.round(Math.random() * integer + 1));
        System.out.println(topicDao.getTopic(cid,tid));
        return topicDao.getTopic(cid,tid);
    }
}
