package edu.cqgcxy.model;

public class Report {
    private Integer id;

    private Integer userid;

    private String reportphone;

    private Integer reportemailid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getReportphone() {
        return reportphone;
    }

    public void setReportphone(String reportphone) {
        this.reportphone = reportphone == null ? null : reportphone.trim();
    }

    public Integer getReportemailid() {
        return reportemailid;
    }

    public void setReportemailid(Integer reportemailid) {
        this.reportemailid = reportemailid;
    }
}