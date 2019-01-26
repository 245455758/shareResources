package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.CourseUnitLectureMapper;
import com.trouble.shareresources.mapper.CourseUnitMapper;
import com.trouble.shareresources.mapper.UserCourseMapper;
import com.trouble.shareresources.mapper.UserLectureMapper;
import com.trouble.shareresources.pojo.*;
import com.trouble.shareresources.service.UserLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLectureServiceImpl implements UserLectureService {

    @Autowired
    private UserLectureMapper userLectureMapper;
    @Autowired
    private CourseUnitMapper courseUnitMapper;
    @Autowired
    private CourseUnitLectureMapper courseUnitLectureMapper;
    @Autowired
    private UserCourseMapper userCourseMapper;

    @Override
    public int saveUserLectureInfo(UserLecture userLecture) {
        UserLectureExample example = new UserLectureExample();
        UserLectureExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userLecture.getUserId());
        criteria.andCoursrIdEqualTo(userLecture.getCoursrId());
        criteria.andUnitIdEqualTo(userLecture.getUnitId());
        criteria.andLectureIdEqualTo(userLecture.getLectureId());
        List<UserLecture> userLectures = userLectureMapper.selectByExample(example);
        if (userLectures!=null && userLectures.size()>0 && userLectures.get(0).getStatus()!=1){
            userLecture.setId(userLectures.get(0).getId());
            int i = userLectureMapper.updateByPrimaryKey(userLecture);
            if(userLecture.getStatus()==1){
                boolean judgeLectureCount = judgeLectureCount(userLecture.getCoursrId(), userLecture.getUserId());
                boolean judgeIsLastLecture = judgeIsLastLecture(userLecture);
                System.out.println("!!!!!!!!!!!!@@@@@@@@@@@@"+judgeIsLastLecture+judgeLectureCount);
                if(judgeIsLastLecture&&judgeLectureCount) updateCourseStatusWhenFinish(userLecture.getUserId(),userLecture.getCoursrId());
            }
            return i;
        }else{
            int result = 0;
            try{
                result = userLectureMapper.insertSelective(userLecture);
            }catch (Exception e){
                return result;
            }finally {
                if (userLecture.getStatus()==1){
                    boolean judgeLectureCount = judgeLectureCount(userLecture.getCoursrId(), userLecture.getUserId());
                    boolean judgeIsLastLecture = judgeIsLastLecture(userLecture);
                    System.out.println("###############@@@@@@@@"+judgeIsLastLecture+judgeLectureCount);
                    if(judgeIsLastLecture&&judgeLectureCount) updateCourseStatusWhenFinish(userLecture.getUserId(),userLecture.getCoursrId());
                }
            }
            return result;
        }
    }

    private int updateCourseStatusWhenFinish(Integer userId,Integer courseId) {
        UserCourseExample example = new UserCourseExample();
        UserCourseExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andCourseIdEqualTo(courseId);
        List<UserCourse> userCourses = userCourseMapper.selectByExample(example);
        UserCourse userCourse = null;
        if (userCourses!=null && userCourses.size()>0) userCourse = userCourses.get(0);
        userCourse.setStatus(2);
       return userCourseMapper.updateByPrimaryKey(userCourse);
    }

    public boolean judgeLectureCount(Integer courseId,Integer userId){
        CourseUnitExample example = new CourseUnitExample();
        CourseUnitExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdEqualTo(courseId);
        List<CourseUnit> courseUnits = courseUnitMapper.selectByExample(example);
        int count = 0;
        for (CourseUnit courseUnit: courseUnits) {
            System.out.println("%%%%%%%%%%%%%%%"+courseUnit.getId());
            CourseUnitLectureExample example1 = new CourseUnitLectureExample();
            CourseUnitLectureExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andUnitIdEqualTo(courseUnit.getId());
            int i = courseUnitLectureMapper.countByExample(example1);
            count += i;
        }
        UserLectureExample example2 = new UserLectureExample();
        UserLectureExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andCoursrIdEqualTo(courseId);
        criteria2.andUserIdEqualTo(userId);
        criteria2.andStatusEqualTo(1);
        int i = userLectureMapper.countByExample(example2);
        System.out.println("课程有："+count+",已经学了："+i);
        return count==i;
    }


    public boolean judgeIsLastLecture(UserLecture userLecture){
        CourseUnitExample example = new CourseUnitExample();
        CourseUnitExample.Criteria criteria1 = example.createCriteria();
        criteria1.andCourseIdEqualTo(userLecture.getCoursrId());
        List<CourseUnit> courseUnits = courseUnitMapper.selectByExample(example);
        CourseUnitLectureExample example1 = new CourseUnitLectureExample();
        CourseUnitLectureExample.Criteria criteria = example1.createCriteria();
        criteria.andUnitIdEqualTo(courseUnits.get((courseUnits.size()-1)).getId());
        List<CourseUnitLecture> courseUnitLectures = courseUnitLectureMapper.selectByExample(example1);
        System.out.println(courseUnits.get((courseUnits.size()-1)).getId());
        System.out.println(userLecture.getUnitId());
        System.out.println(userLecture.getLectureId());
        System.out.println(courseUnitLectures.get(courseUnitLectures.size()-1).getId());
        return userLecture.getUnitId()==courseUnits.get((courseUnits.size()-1)).getId()
                &&
                userLecture.getLectureId()==courseUnitLectures.get(courseUnitLectures.size()-1).getId();
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
