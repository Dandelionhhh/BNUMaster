package com.bnumaster.service;


import com.bnumaster.entity.base.Information;

import java.util.List;

public interface IIformationService {
    //获取咨询列表
    public List<Information> getInformationList();

    //增加咨询
    public void postInformation(Information information);

    //获取咨询详细信息
    public Information getInformation(int id);

    //更新咨询
    public void putInformation(Information information);

    //根据id删除咨询
    public void deleteInformation(int id);

    //根据id查找图片
    public String findImageById(int id);
}
