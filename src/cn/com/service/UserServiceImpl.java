package cn.com.service;

import cn.com.bean.User;
import cn.com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements  UserServce{
    @Autowired
    UserDao userDao;
    @Transactional
    @Override
    public Byte userLogin(Long uphone,String upassword) {
        Byte i= null;
        if (null!=uphone){
            if (null!=upassword && !upassword.equals("")){
                i=userDao.selectByNameAndPassword( uphone, upassword);
                if (null!=i){
                    return  i;
                }else {
                    i =userDao.selectByName(uphone);
                    if (null!=i){
                        return i=0;
                    }else {
                        return i=-1;
                    }
                }
            }else {
                i =userDao.selectByName(uphone);
                if (null!=i){
                    return i=0;
                }else {
                    return i=-1;
                }
            }
        }
        else {
            return i=-1;
        }
    }
}
