package cn.com.dao;

import cn.com.bean.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseDao {
     List<Course> selectAllCourse();
     int addCourse(Course course);
     Byte selectCourse( Course course);
}
