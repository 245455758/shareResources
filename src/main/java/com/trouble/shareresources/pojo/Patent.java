package com.trouble.shareresources.pojo;

import java.util.Date;

public class Patent {
    private Integer id;

    private String name;

    private String patentNo;

    private String patentType;

    private String price;

    private Date publishDate;

    private String field;

    private String patentOwner;

    private String maturity;

    private Boolean hasSample;

    private String patentTransferForm;

    private Boolean lienceseOthers;

    private String siteRequirements;

    private String personnelRequirements;

    private String revenueExpected;

    private Date reviewDate;

    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPatentNo() {
        return patentNo;
    }

    public void setPatentNo(String patentNo) {
        this.patentNo = patentNo == null ? null : patentNo.trim();
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType == null ? null : patentType.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getPatentOwner() {
        return patentOwner;
    }

    public void setPatentOwner(String patentOwner) {
        this.patentOwner = patentOwner == null ? null : patentOwner.trim();
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity == null ? null : maturity.trim();
    }

    public Boolean getHasSample() {
        return hasSample;
    }

    public void setHasSample(Boolean hasSample) {
        this.hasSample = hasSample;
    }

    public String getPatentTransferForm() {
        return patentTransferForm;
    }

    public void setPatentTransferForm(String patentTransferForm) {
        this.patentTransferForm = patentTransferForm == null ? null : patentTransferForm.trim();
    }

    public Boolean getLienceseOthers() {
        return lienceseOthers;
    }

    public void setLienceseOthers(Boolean lienceseOthers) {
        this.lienceseOthers = lienceseOthers;
    }

    public String getSiteRequirements() {
        return siteRequirements;
    }

    public void setSiteRequirements(String siteRequirements) {
        this.siteRequirements = siteRequirements == null ? null : siteRequirements.trim();
    }

    public String getPersonnelRequirements() {
        return personnelRequirements;
    }

    public void setPersonnelRequirements(String personnelRequirements) {
        this.personnelRequirements = personnelRequirements == null ? null : personnelRequirements.trim();
    }

    public String getRevenueExpected() {
        return revenueExpected;
    }

    public void setRevenueExpected(String revenueExpected) {
        this.revenueExpected = revenueExpected == null ? null : revenueExpected.trim();
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}