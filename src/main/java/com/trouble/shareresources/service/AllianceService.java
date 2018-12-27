package com.trouble.shareresources.service;


import com.trouble.shareresources.pojo.Alliance;

import java.util.List;

public interface AllianceService {

    public int saveMemberInfo(Alliance alliance);

    public List<Alliance> getAllMemberInfo();

}
