package edu.cqgcxy.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SendEmail implements Serializable {
    private Integer sendemailid;

    private Integer userid;

    /**
     * 标题
     */
    private String title;

    /**
     * 正文
     */
    private String message;

    /**
     * 发送状态 1成功 2失败
     */
    private Integer issuccess;

    /**
     * 是否被删除 1被删除 
     */
    private Integer isdel;

    /**
     * 是否保存至草稿箱 1保存
     */
    private Integer issave;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 收信人
     */
    private String receiveperson;

    /**
     * 附件标识
     */
    private String annexsign;

    private static final long serialVersionUID = 1L;

    public Integer getSendemailid() {
        return sendemailid;
    }

    public void setSendemailid(Integer sendemailid) {
        this.sendemailid = sendemailid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Integer issuccess) {
        this.issuccess = issuccess;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Integer getIssave() {
        return issave;
    }

    public void setIssave(Integer issave) {
        this.issave = issave;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getReceiveperson() {
        return receiveperson;
    }

    public void setReceiveperson(String receiveperson) {
        this.receiveperson = receiveperson;
    }

    public String getAnnexsign() {
        return annexsign;
    }

    public void setAnnexsign(String annexsign) {
        this.annexsign = annexsign;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SendEmail other = (SendEmail) that;
        return (this.getSendemailid() == null ? other.getSendemailid() == null : this.getSendemailid().equals(other.getSendemailid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getIssuccess() == null ? other.getIssuccess() == null : this.getIssuccess().equals(other.getIssuccess()))
            && (this.getIsdel() == null ? other.getIsdel() == null : this.getIsdel().equals(other.getIsdel()))
            && (this.getIssave() == null ? other.getIssave() == null : this.getIssave().equals(other.getIssave()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getReceiveperson() == null ? other.getReceiveperson() == null : this.getReceiveperson().equals(other.getReceiveperson()))
            && (this.getAnnexsign() == null ? other.getAnnexsign() == null : this.getAnnexsign().equals(other.getAnnexsign()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSendemailid() == null) ? 0 : getSendemailid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getIssuccess() == null) ? 0 : getIssuccess().hashCode());
        result = prime * result + ((getIsdel() == null) ? 0 : getIsdel().hashCode());
        result = prime * result + ((getIssave() == null) ? 0 : getIssave().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getReceiveperson() == null) ? 0 : getReceiveperson().hashCode());
        result = prime * result + ((getAnnexsign() == null) ? 0 : getAnnexsign().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sendemailid=").append(sendemailid);
        sb.append(", userid=").append(userid);
        sb.append(", title=").append(title);
        sb.append(", message=").append(message);
        sb.append(", issuccess=").append(issuccess);
        sb.append(", isdel=").append(isdel);
        sb.append(", issave=").append(issave);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", receiveperson=").append(receiveperson);
        sb.append(", annexsign=").append(annexsign);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}