package com.trouble.shareresources.pojo;

public class User {
    private Integer id;

    private String username;

    private String realname;

    private String telephone;

    private String email;

    private String unit;

    private String password;

    private String businessname;

    private String connectMan;

    private String role;

    private String roleGroup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname == null ? null : businessname.trim();
    }

    public String getConnectMan() {
        return connectMan;
    }

    public void setConnectMan(String connectMan) {
        this.connectMan = connectMan == null ? null : connectMan.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getRoleGroup() {
        return roleGroup;
    }

    public void setRoleGroup(String roleGroup) {
        this.roleGroup = roleGroup == null ? null : roleGroup.trim();
    }

    public User(String username, String telephone, String password, String role) {
        this.username = username;
        this.telephone = telephone;
        this.password = password;
        this.role = role;
    }

    public User() {
    }
}