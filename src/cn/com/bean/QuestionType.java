package cn.com.bean;

public class QuestionType {
    private Integer qtid;
    private String qname;


    public Integer getQtid() {
        return qtid;
    }

    public void setQtid(Integer qtid) {
        this.qtid = qtid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }



    @Override
    public String toString() {
        return "QuestionType{" +
                "qtid=" + qtid +
                ", qname='" + qname + '\'' +
                '}';
    }

}
