package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.Policy;
import com.trouble.shareresources.pojo.PropertyProtection;

import java.util.List;

public interface PolicyService {

    int getAllNum();

    List<Policy> getAllPolicySummary();

    Policy getPokicyById(Integer id);

    int getNumWhenSelection(String title, String publisher, String fromDate, String toDate);

    List<PropertyProtection> getPolicysWhenSelection(String title, String publisher, String fromDate, String toDate);
}
