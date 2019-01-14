package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.Copyright;

import java.util.List;

public interface CopyrightService {

    List<Copyright> getAllSummary();

    int getAllNum();

    Copyright getById(Integer id);

    int getCountWhenSelection(String category, String name, String number);

    List<Copyright> getCopyrightsWhenSelection(String category, String name, String number);
}
