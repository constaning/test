package cn.com.bean;

import org.springframework.stereotype.Component;
/*
*user class
*@author xu
*@date 2020/7/4
*/

@Component
public class User {
    private  Integer uid;
    private  String uname;
    private  String upassword;
    private Long uphone;

    public Long getUphone() {
        return uphone;
    }

    public void setUphone(Long uphone) {
        this.uphone = uphone;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public User() {
    }

    public User(String upassword, Long uphone) {
        this.upassword = upassword;
        this.uphone = uphone;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uphone=" + uphone +
                '}';
    }
}
