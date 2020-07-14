package cn.com.dao;

import cn.com.bean.Question;

import java.util.List;

public interface QuestionDao {
    public List<Question> getQuestionById(Integer tid);
}
