package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.Patent;

import java.util.List;

public interface PatentService {

    public List<Patent> getAllSummaryPatent();

    int getPatentCount();

    int getPatentCountWhenSelect(String name, String patentNo, String patenType, String field);

    List<Patent> getPatentByCondition(String name, String patentNo, String patenType, String field);

    Patent getPatentById(Integer id);
}
