package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.UserLecture;

import java.util.List;

public interface UserLectureService {

    public int saveUserLectureInfo(UserLecture userLecture);

    List<UserLecture> findLectureStatusBy3Ids(Integer userId, Integer courseId, Integer unitId);
}
