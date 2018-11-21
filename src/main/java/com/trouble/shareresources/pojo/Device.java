package com.trouble.shareresources.pojo;

public class Device {
    private Integer id;

    private String name;

    private String type;

    private String affiliationUnit;

    private String catalogue;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAffiliationUnit() {
        return affiliationUnit;
    }

    public void setAffiliationUnit(String affiliationUnit) {
        this.affiliationUnit = affiliationUnit == null ? null : affiliationUnit.trim();
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue == null ? null : catalogue.trim();
    }
}