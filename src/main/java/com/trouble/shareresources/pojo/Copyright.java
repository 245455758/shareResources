package com.trouble.shareresources.pojo;

import java.util.Date;

public class Copyright {
    private Integer id;

    private String name;

    private String number;

    private String category;

    private String price;

    private Date publishDate;

    private String copyrightOwner;

    private String transferForm;

    private Boolean licenseOthers;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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

    public String getCopyrightOwner() {
        return copyrightOwner;
    }

    public void setCopyrightOwner(String copyrightOwner) {
        this.copyrightOwner = copyrightOwner == null ? null : copyrightOwner.trim();
    }

    public String getTransferForm() {
        return transferForm;
    }

    public void setTransferForm(String transferForm) {
        this.transferForm = transferForm == null ? null : transferForm.trim();
    }

    public Boolean getLicenseOthers() {
        return licenseOthers;
    }

    public void setLicenseOthers(Boolean licenseOthers) {
        this.licenseOthers = licenseOthers;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}