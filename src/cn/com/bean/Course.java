package cn.com.bean;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private Integer cid;
    private String cname;
    private  String cpicter;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpicter() {
        return cpicter;
    }

    public void setCpicter(String cpicter) {
        this.cpicter = cpicter;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cpicter='" + cpicter + '\'' +
                '}';
    }
}
