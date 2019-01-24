package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.UserLectureMapper;
import com.trouble.shareresources.pojo.UserLecture;
import com.trouble.shareresources.pojo.UserLectureExample;
import com.trouble.shareresources.service.UserLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLectureServiceImpl implements UserLectureService {

    @Autowired
    private UserLectureMapper userLectureMapper;

    @Override
    public int saveUserLectureInfo(UserLecture userLecture) {
        UserLectureExample example = new UserLectureExample();
        UserLectureExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userLecture.getUserId());
        criteria.andCoursrIdEqualTo(userLecture.getCoursrId());
        criteria.andUnitIdEqualTo(userLecture.getUnitId());
        criteria.andLectureIdEqualTo(userLecture.getLectureId());
        List<UserLecture> userLectures = userLectureMapper.selectByExample(example);
        if (userLectures!=null && userLectures.size()>0){
            userLecture.setId(userLectures.get(0).getId());
            return userLectureMapper.updateByPrimaryKey(userLecture);
        }
        int result = 0;
        try{
            result = userLectureMapper.insertSelective(userLecture);
        }catch (Exception e){
            return result;
        }
        return result;
    }

    @Override
    public List<UserLecture> findLectureStatusBy3Ids(Integer userId, Integer courseId, Integer unitId) {
        UserLectureExample example = new UserLectureExample();
        UserLectureExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andCoursrIdEqualTo(courseId);
        criteria.andUnitIdEqualTo(unitId);
        return userLectureMapper.selectByExample(example);
    }
}
