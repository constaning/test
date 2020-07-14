package cn.com.controllor;

import cn.com.service.CourseServce;
import cn.com.service.UserServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserLogin {
    @Autowired
    UserServce userServce;
    @Autowired
    CourseServce courseServce;
    @RequestMapping("/login")
    public String login(Long uphone, String upassword,HttpServletResponse response){
        Byte i =userServce.userLogin(uphone,upassword);
        if(null!=i){
            if (i==1){
                Cookie cookie = new Cookie("name_test","value_test");
                cookie.setMaxAge(5 * 60);
                cookie.setPath("/");
                response.addCookie(cookie);

                return "redirect:/user";
            }else {
                return "index";
            }
        }else {
            return "index";
        }
    }
    @RequestMapping("/user")
    public String forwardUser(){
        return "user";
    }
    @RequestMapping(value = "a/{id}",method = RequestMethod.GET)
    public String one(@PathVariable("id") String id){
        System.out.println(1);
        return "redirect:/user";
    }

}
