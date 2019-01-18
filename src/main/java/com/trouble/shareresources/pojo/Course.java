package com.trouble.shareresources.pojo;

public class Course {
    private Integer id;

    private String courseName;

    private String school;

    private String teachers;

    private String abstractIntroduction;

    private Integer participation;

    private String arrangement;

    private String introductionPic;

    private String introductionVideo;

    private String prerequisiteKnowledge;

    private String certificateRequirements;

    private String referenceMaterials;

    private String courseAim;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers == null ? null : teachers.trim();
    }

    public String getAbstractIntroduction() {
        return abstractIntroduction;
    }

    public void setAbstractIntroduction(String abstractIntroduction) {
        this.abstractIntroduction = abstractIntroduction == null ? null : abstractIntroduction.trim();
    }

    public Integer getParticipation() {
        return participation;
    }

    public void setParticipation(Integer participation) {
        this.participation = participation;
    }

    public String getArrangement() {
        return arrangement;
    }

    public void setArrangement(String arrangement) {
        this.arrangement = arrangement == null ? null : arrangement.trim();
    }

    public String getIntroductionPic() {
        return introductionPic;
    }

    public void setIntroductionPic(String introductionPic) {
        this.introductionPic = introductionPic == null ? null : introductionPic.trim();
    }

    public String getIntroductionVideo() {
        return introductionVideo;
    }

    public void setIntroductionVideo(String introductionVideo) {
        this.introductionVideo = introductionVideo == null ? null : introductionVideo.trim();
    }

    public String getPrerequisiteKnowledge() {
        return prerequisiteKnowledge;
    }

    public void setPrerequisiteKnowledge(String prerequisiteKnowledge) {
        this.prerequisiteKnowledge = prerequisiteKnowledge == null ? null : prerequisiteKnowledge.trim();
    }

    public String getCertificateRequirements() {
        return certificateRequirements;
    }

    public void setCertificateRequirements(String certificateRequirements) {
        this.certificateRequirements = certificateRequirements == null ? null : certificateRequirements.trim();
    }

    public String getReferenceMaterials() {
        return referenceMaterials;
    }

    public void setReferenceMaterials(String referenceMaterials) {
        this.referenceMaterials = referenceMaterials == null ? null : referenceMaterials.trim();
    }

    public String getCourseAim() {
        return courseAim;
    }

    public void setCourseAim(String courseAim) {
        this.courseAim = courseAim == null ? null : courseAim.trim();
    }
}