package com.bnumaster.mapper;

import com.bnumaster.entity.base.Information;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper

@Repository
public interface InformationMapper {
    //查询全部咨询
    List<Information> getInformationList();

    //增加咨询
    void postInformation(Information information);

    //根据id获取咨询
    Information getInformation(int id);

    //修改更新咨询
    void putInformation(Information information);

    //删除咨询
    void deleteInformation(int id);

    //根据id查询封面
    String findImageById(int id);
}
