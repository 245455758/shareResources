package com.trouble.shareresources.pojo;

public class DeviceDetailWithBLOBs extends DeviceDetail {
    private String mainApplication;

    private String description;

    private String sampleRequirements;

    private String perforamnce;

    public String getMainApplication() {
        return mainApplication;
    }

    public void setMainApplication(String mainApplication) {
        this.mainApplication = mainApplication == null ? null : mainApplication.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSampleRequirements() {
        return sampleRequirements;
    }

    public void setSampleRequirements(String sampleRequirements) {
        this.sampleRequirements = sampleRequirements == null ? null : sampleRequirements.trim();
    }

    public String getPerforamnce() {
        return perforamnce;
    }

    public void setPerforamnce(String perforamnce) {
        this.perforamnce = perforamnce == null ? null : perforamnce.trim();
    }
}