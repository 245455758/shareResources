package com.trouble.shareresources.pojo;

public class DeviceDetail {
    private Integer id;

    private String affiliationUnit;

    private String deviceManager;

    private String deviceName;

    private String deviceNum;

    private String deviceLocation;

    private String deviceType;

    private String department;

    private String telephone;

    private String eMail;

    private String englishName;

    private String manufacture;

    private String manufactureNation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAffiliationUnit() {
        return affiliationUnit;
    }

    public void setAffiliationUnit(String affiliationUnit) {
        this.affiliationUnit = affiliationUnit == null ? null : affiliationUnit.trim();
    }

    public String getDeviceManager() {
        return deviceManager;
    }

    public void setDeviceManager(String deviceManager) {
        this.deviceManager = deviceManager == null ? null : deviceManager.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation == null ? null : deviceLocation.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public String getManufactureNation() {
        return manufactureNation;
    }

    public void setManufactureNation(String manufactureNation) {
        this.manufactureNation = manufactureNation == null ? null : manufactureNation.trim();
    }
}