package cn.com.dao;

import cn.com.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface UserDao {
    Byte selectByNameAndPassword(@Param("uphone") Long uphone, @Param("upassword") String upassword);
    Byte selectByName(@Param("uphone") Long uphone);
}
