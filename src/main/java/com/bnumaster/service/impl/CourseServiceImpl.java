package com.bnumaster.service.impl;

import com.bnumaster.entity.base.Course;
import com.bnumaster.mapper.CourseMapper;
import com.bnumaster.service.ICourseService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service("CourseService")
public class CourseServiceImpl implements ICourseService {
    private CourseMapper courseMapper;
    @Override
    public List<Course> getCourseList() {

        return courseMapper.getCourseList();
    }

    @Override
    public void postCourse(Course course) {
        courseMapper.postCourse(course);
    }

    @Override
    public Course getCourse(int id) {

        return courseMapper.getCourse(id);
    }

    @Override
    public void putCourse(Course course) {
        courseMapper.putCourse(course);
    }

    @Override
    public void deleteCourse(int id) {
        courseMapper.deleteCourse(id);
    }

    @Override
    public String findImageById(int id) {
        return courseMapper.findImageById(id);
    }
}
