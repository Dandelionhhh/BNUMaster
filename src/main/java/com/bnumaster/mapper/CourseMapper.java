package com.bnumaster.mapper;

import com.bnumaster.entity.base.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper

@Repository
public interface CourseMapper {
    //查询全部课程
    List<Course> getCourseList();

    //增加课程
    void postCourse(Course course);

    //根据id获取课程
    Course getCourse(int id);

    //修改更新课程
    void putCourse(Course course);

    //删除课程
    void deleteCourse(int id);

    //根据id查找封面
    String findImageById(int id);
}
