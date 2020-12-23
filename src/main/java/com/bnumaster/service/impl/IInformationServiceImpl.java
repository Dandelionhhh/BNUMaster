package com.bnumaster.service.impl;

import com.bnumaster.entity.base.Information;
import com.bnumaster.mapper.InformationMapper;
import com.bnumaster.service.IIformationService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service("InformationService")
public class IInformationServiceImpl implements IIformationService {
    private InformationMapper informationMapper;

    @Override
    public List<Information> getInformationList() {
        return informationMapper.getInformationList();
    }

    @Override
    public void postInformation(Information information) {
        informationMapper.postInformation(information);
    }

    @Override
    public Information getInformation(int id) {
        return informationMapper.getInformation(id);
    }

    @Override
    public void putInformation(Information information) {
        informationMapper.putInformation(information);
    }

    @Override
    public void deleteInformation(int id) {
        informationMapper.deleteInformation(id);
    }

    @Override
    public String findImageById(int id) {
        return informationMapper.findImageById(id);
    }
}
