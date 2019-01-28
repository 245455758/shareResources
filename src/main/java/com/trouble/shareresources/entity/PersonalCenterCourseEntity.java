package com.trouble.shareresources.entity;

public class PersonalCenterCourseEntity {

    private Integer courseId;
    private String courseName;
    private String courseSchool;
    private String picPath;
    private Integer status;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSchool() {
        return courseSchool;
    }

    public void setCourseSchool(String courseSchool) {
        this.courseSchool = courseSchool;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
