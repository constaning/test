package cn.com.bean;

import org.apache.catalina.Session;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("z;hixi");
        Cookie[] cookies = httpServletRequest.getCookies();
        if (null==cookies) {
            System.out.println("没有cookie");
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath());
            return false;
        } else {

            for(Cookie cookie : cookies){
                if (cookie.getName().equals("name_test")){
                    return true;
                }
            }
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath());
            return false;
        }


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
