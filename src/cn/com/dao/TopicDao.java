package cn.com.dao;

import cn.com.bean.Topic;
import org.apache.ibatis.annotations.Param;


public interface TopicDao {
    public Topic getTopic(@Param("cid") Integer cid , @Param("tid") Long tid);
    public Integer getTopicNumber(Integer cid);
}
