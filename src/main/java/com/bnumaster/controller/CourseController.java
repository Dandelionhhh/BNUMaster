package com.bnumaster.controller;


import com.bnumaster.common.tools.utils.QiniuCloudUtils;
import com.bnumaster.entity.base.Course;
import com.bnumaster.entity.params.CourseParams;
import com.bnumaster.service.ICourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.*;

@Api(tags = "课程管理")
@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    private QiniuCloudUtils qiniuCloudUtils = new QiniuCloudUtils();

    @GetMapping("/getUserList")
    @ApiOperation(value = "获取课程列表")
    public List<Course> getUserList() {
       return courseService.getCourseList();
    }

    @PostMapping("/postCourse")
    @ApiOperation(value = "发布课程", notes = "根据Course对象创建用户")
    public String postCourse(@Validated CourseParams params,
                             @RequestPart @ApiParam(value = "cover") MultipartFile file){
        Course course = new Course();
        course.setInstitutionId(params.getInstitutionId());
        course.setAuthorId(params.getAuthorId());
        course.setTitle(params.getTitle());
        course.setSubTitle(params.getSubTitle());
        course.setStatus(params.getStatus());
        course.setAttribute(params.getAttribute());
        course.setDescription(params.getDescription());
        course.setCourseType(params.getCourseType());
        course.setPrice(params.getPrice());
        course.setStartTime(params.getStartTime());
        course.setEndTime(params.getEndTime());
        course.setAddressId(params.getAddressId());
        course.setDetails(params.getDetails());
        course.setScheduling(params.getScheduling());
        course.setNotice(params.getNotice());
        course.setEnrollAdditional(params.getEnrollAdditional());
        course.setResources(params.getResources());
        course.setSuitableForCrowd(params.getSuitableForCrowd());
        course.setOptions(params.getOptions());
        course.setTravelDays(params.getTravelDays());
        course.setCreateTime(params.getCreateTime());
        course.setUpdateTime(params.getUpdateTime());
        if(!file.isEmpty()){
            System.out.println(file.getOriginalFilename());
            try{
                String url = qiniuCloudUtils.uploadToQiniu(file);
                course.setCover(url);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        courseService.postCourse(course);
        return "success";
    }

    @GetMapping("/getCourse/{id}")
    @ApiOperation(value = "获取课程详细信息", notes = "根据url的id来获取课程详细信息")
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }

    @PutMapping("/putCourse")
//    @ApiImplicitParam(paramType = "path", dataType = "int", name = "id", value = "课程编号", required = true, example = "1")
    @ApiOperation(value = "更新课程详细信息", notes = "根据url的id来指定更新对象，并根据传过来的course信息来更新用户详细信息")
    public String putCourse(@Validated CourseParams params,
                            @RequestPart @ApiParam(value = "cover") MultipartFile file){
        int id = params.getId();
        Course course = courseService.getCourse(id);
        course.setInstitutionId(params.getInstitutionId());
        course.setAuthorId(params.getAuthorId());
        course.setTitle(params.getTitle());
        course.setSubTitle(params.getSubTitle());
        course.setStatus(params.getStatus());
        course.setAttribute(params.getAttribute());
        course.setDescription(params.getDescription());
        course.setCourseType(params.getCourseType());
        course.setPrice(params.getPrice());
        course.setStartTime(params.getStartTime());
        course.setEndTime(params.getEndTime());
        course.setAddressId(params.getAddressId());
        course.setDetails(params.getDetails());
        course.setScheduling(params.getScheduling());
        course.setNotice(params.getNotice());
        course.setEnrollAdditional(params.getEnrollAdditional());
        course.setResources(params.getResources());
        course.setSuitableForCrowd(params.getSuitableForCrowd());
        course.setOptions(params.getOptions());
        course.setTravelDays(params.getTravelDays());
        course.setCreateTime(params.getCreateTime());
        course.setUpdateTime(params.getUpdateTime());

        if(!file.isEmpty()){
            System.out.println(file.getOriginalFilename());
            try{
                String url = qiniuCloudUtils.uploadToQiniu(file);
                String oldUrl = courseService.findImageById(id);
                int statusCode = qiniuCloudUtils.deleteFromQiniu(oldUrl);
                if(statusCode == -1){
                    System.out.println("图片删除失败！");
                }
            }catch (IOException e){
                System.out.println("图片删除成功！");
            }
        }
        courseService.putCourse(course);
        return "success";
    }

    @DeleteMapping("/deleteCourse/{id}")
    @ApiOperation(value = "删除课程", notes = "根据url的id来删除对象")
    public String deleteCourse(@PathVariable int id){

        courseService.deleteCourse(id);
        return "success";
    }


}
