package com.bnumaster.service;

import com.bnumaster.entity.base.Course;

import java.util.List;

public interface ICourseService {
    //获取用户列表
    public List<Course> getCourseList();

    //增加用户
    public void postCourse(Course course);

    //获取用户详细信息
    public Course getCourse(int id);

    //更新用户
    public void putCourse(Course course);

    //根据id删除用户
    public void deleteCourse(int id);

    //根据id查找课程封面
    public String findImageById(int id);
}
