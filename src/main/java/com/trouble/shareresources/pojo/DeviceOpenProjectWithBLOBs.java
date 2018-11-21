package com.trouble.shareresources.pojo;

public class DeviceOpenProjectWithBLOBs extends DeviceOpenProject {
    private String projectDescription;

    private String sampleRequirements;

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription == null ? null : projectDescription.trim();
    }

    public String getSampleRequirements() {
        return sampleRequirements;
    }

    public void setSampleRequirements(String sampleRequirements) {
        this.sampleRequirements = sampleRequirements == null ? null : sampleRequirements.trim();
    }
}