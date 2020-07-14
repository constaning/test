package cn.com.service;

import cn.com.bean.Course;

import java.util.List;

public interface CourseServce {
    public List<Course> selectAllCourse();
    public int addCourse(Course course);
}
