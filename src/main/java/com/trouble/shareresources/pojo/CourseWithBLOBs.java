package com.trouble.shareresources.pojo;

public class CourseWithBLOBs extends Course {
    private String introduction;

    private String courseOutline;

    private String commonQuestions;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getCourseOutline() {
        return courseOutline;
    }

    public void setCourseOutline(String courseOutline) {
        this.courseOutline = courseOutline == null ? null : courseOutline.trim();
    }

    public String getCommonQuestions() {
        return commonQuestions;
    }

    public void setCommonQuestions(String commonQuestions) {
        this.commonQuestions = commonQuestions == null ? null : commonQuestions.trim();
    }
}