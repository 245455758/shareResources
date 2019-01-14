package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.PropertyProtection;

import java.util.List;

public interface PropertyProtectionService {

    public int getAllNum();

    List<PropertyProtection> getSummaryPropertyProtections();

    PropertyProtection getById(Integer id);

    int getNumWhenSelection(String title, String fromDate, String toDate);

    List<PropertyProtection> getPropertyProtectionsWhenSelection(String title, String fromDate, String toDate);
}
