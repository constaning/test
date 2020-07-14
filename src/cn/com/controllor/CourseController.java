package cn.com.controllor;

import cn.com.bean.Course;
import cn.com.bean.User;
import cn.com.service.CourseServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    CourseServce courseServce;
    @RequestMapping("/selectCourses")
    @ResponseBody
    public List<Course> getAllCourse(){
        return courseServce.selectAllCourse();
    }
    @RequestMapping("/addCourse")
    public String  addCourse(Course course){
        System.out.println(course);
         int i =courseServce.addCourse(course);
        System.out.println(i);
        return "redirect:/courseRelURL";
    }
    @RequestMapping("/course")
    public String redirectCoures(){
        return "redirect:/courseRelURL";
    }
    @RequestMapping("/courseRelURL")
    public String CouresJsp(){
        return "addCourse";
    }
}
