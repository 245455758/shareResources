package com.trouble.shareresources.pojo;

import java.util.Date;

public class DeviceReservationRecord {
    private Integer id;

    private Date reservationDate;

    private String reservationProject;

    private String reservationUser;

    private String reservationUnit;

    private Integer deviceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationProject() {
        return reservationProject;
    }

    public void setReservationProject(String reservationProject) {
        this.reservationProject = reservationProject == null ? null : reservationProject.trim();
    }

    public String getReservationUser() {
        return reservationUser;
    }

    public void setReservationUser(String reservationUser) {
        this.reservationUser = reservationUser == null ? null : reservationUser.trim();
    }

    public String getReservationUnit() {
        return reservationUnit;
    }

    public void setReservationUnit(String reservationUnit) {
        this.reservationUnit = reservationUnit == null ? null : reservationUnit.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}