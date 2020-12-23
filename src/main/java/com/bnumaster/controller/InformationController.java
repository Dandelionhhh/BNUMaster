package com.bnumaster.controller;


import com.bnumaster.common.tools.utils.QiniuCloudUtils;
import com.bnumaster.entity.base.Information;
import com.bnumaster.entity.params.InformationParams;
import com.bnumaster.service.IIformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Api(tags = "咨询管理")
@RestController
@RequestMapping(value = "/infos")
public class InformationController {

    @Autowired
    private IIformationService informationService;

    private QiniuCloudUtils qiniuCloudUtils = new QiniuCloudUtils();

    @GetMapping("/getInfoList")
    @ApiOperation(value = "获取咨询列表")
    public List<Information> getInfoList() {
        return informationService.getInformationList();
    }

    @PostMapping("/postInformation")
    @ApiOperation(value = "发布咨询", notes = "根据Information对象创建咨询")
    public String postInformation(@Validated InformationParams params,
                                  @RequestPart @ApiParam(value = "cover") MultipartFile file){
        Information info = new Information();
        info.setAuthorId(params.getAuthorId());
        info.setInstitutionId(params.getInstitutionId());
        info.setAttribute(params.getAttribute());
        info.setStatus(params.getStatus());
        info.setInformationType(params.getInformationType());
        info.setTitle(params.getTitle());
        info.setAbst(params.getAbst());
        info.setContent(params.getContent());
        info.setResources(params.getResources());
        info.setCreateTime(params.getCreateTime());
        info.setUpdadateTime(params.getUpdadateTime());
        if(!file.isEmpty()){
            System.out.println(file.getOriginalFilename());
            try {
                String url = qiniuCloudUtils.uploadToQiniu(file);
                info.setCover(url);
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            info.setCover(null);
        }
        informationService.postInformation(info);
        return "success";
    }

    @GetMapping("/getInformation/{id}")
    @ApiOperation(value = "获取咨询详细信息", notes = "根据url的id来获取咨询详细信息")
    public Information getInformation(@PathVariable int id){
        return informationService.getInformation(id);
    }

    @PutMapping("/putInformation/{id}")
//    @ApiImplicitParam(paramType = "path", dataType = "int", name = "id", value = "咨询编号", required = true, example = "1")
    @ApiOperation(value = "更新咨询详细信息", notes = "根据url的id来指定更新对象，并根据传过来的info信息来更新咨询详细信息")
    public String putInformation(@Validated InformationParams params,
                                 @RequestPart @ApiParam(value = "cover") MultipartFile file){
        int id = params.getId();
        Information info = informationService.getInformation(id);
        info.setAuthorId(params.getAuthorId());
        info.setInstitutionId(params.getInstitutionId());
        info.setAttribute(params.getAttribute());
        info.setStatus(params.getStatus());
        info.setInformationType(params.getInformationType());
        info.setTitle(params.getTitle());
        info.setAbst(params.getAbst());
        info.setContent(params.getContent());
        info.setResources(params.getResources());
        info.setCreateTime(params.getCreateTime());
        info.setUpdadateTime(params.getUpdadateTime());

        if(!file.isEmpty()){
            System.out.println(file.getOriginalFilename());
            try{
                String url = qiniuCloudUtils.uploadToQiniu(file);
                String oldUrl = informationService.findImageById(id);
                int statusCode = qiniuCloudUtils.deleteFromQiniu(oldUrl);
                if(statusCode == -1){
                    System.out.println("图片删除失败！");
                }else{
                    System.out.println("图片删除成功");
                }
                info.setCover(url);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        informationService.putInformation(info);
        return "success";
    }

    @DeleteMapping("/deleteInformation/{id}")
    @ApiOperation(value = "删除课程", notes = "根据url的id来删除对象")
    public String deleteInformation(@PathVariable int id){
        String oldUrl = informationService.findImageById(id);
        int statusCode = qiniuCloudUtils.deleteFromQiniu(oldUrl);
        if(statusCode == -1){
            System.out.println("图片删除失败！");
        }else{
            System.out.println("图片删除成功！");
        }
        informationService.deleteInformation(id);
        return "success";
    }
}
