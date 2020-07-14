package cn.com.dao;

import cn.com.bean.Answer;

import java.util.List;

public interface AnswerDao {
    public List<Answer> getAnswerById(Integer aid);
}
