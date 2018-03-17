package edu.cqgcxy.model;

public class Admin {
    private Integer adminid;

    private String name;

    private String passward;

    private String phone;

    private Integer isvoid;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward == null ? null : passward.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIsvoid() {
        return isvoid;
    }

    public void setIsvoid(Integer isvoid) {
        this.isvoid = isvoid;
    }
}