package com.trouble.shareresources.pojo;

public class UserLecture {
    private Integer id;

    private Integer userId;

    private Integer coursrId;

    private Integer unitId;

    private Integer lectureId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCoursrId() {
        return coursrId;
    }

    public void setCoursrId(Integer coursrId) {
        this.coursrId = coursrId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserLecture{" +
                "id=" + id +
                ", userId=" + userId +
                ", coursrId=" + coursrId +
                ", unitId=" + unitId +
                ", lectureId=" + lectureId +
                ", status=" + status +
                '}';
    }
}