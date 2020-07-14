package cn.com.service;

import cn.com.bean.Course;
import cn.com.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServceImpl implements CourseServce {
    @Autowired
    CourseDao courseDao;
    @Override
    public List<Course> selectAllCourse() {
        return courseDao.selectAllCourse();
    }

    @Override
    public int addCourse(Course course) {
        return courseDao.addCourse(course);
    }
}
