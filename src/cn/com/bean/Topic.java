package cn.com.bean;

import java.util.List;

public class Topic {
    private Integer tid;
    private String tname;
    private QuestionType qtid;
    private Integer cid;
    private List<Question> questions;
    private List<Answer> answers;
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public QuestionType getQtid() {
        return qtid;
    }

    public void setQtid(QuestionType qtid) {
        this.qtid = qtid;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", qtid=" + qtid +
                ", cid=" + cid +
                ", questions=" + questions +
                ", answers=" + answers +
                '}';
    }
}
