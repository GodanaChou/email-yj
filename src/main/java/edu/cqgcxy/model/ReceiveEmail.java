package edu.cqgcxy.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ReceiveEmail implements Serializable {
    private Integer receiveemailid;

    /**
     * 收信人Phone
     */
    private String userphone;

    /**
     * 发送人Phone
     */
    private String sendphone;

    /**
     * 标题
     */
    private String title;

    /**
     * 正文
     */
    private String message;

    /**
     * 是否被读
     */
    private Integer isread;

    /**
     * 是否删除
     */
    private Integer isdel;

    /**
     * 是否保存
     */
    private Integer issave;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 来往信件标记
     */
    private String sign;

    /**
     * email类型
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getReceiveemailid() {
        return receiveemailid;
    }

    public void setReceiveemailid(Integer receiveemailid) {
        this.receiveemailid = receiveemailid;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getSendphone() {
        return sendphone;
    }

    public void setSendphone(String sendphone) {
        this.sendphone = sendphone;
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

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        ReceiveEmail other = (ReceiveEmail) that;
        return (this.getReceiveemailid() == null ? other.getReceiveemailid() == null : this.getReceiveemailid().equals(other.getReceiveemailid()))
            && (this.getUserphone() == null ? other.getUserphone() == null : this.getUserphone().equals(other.getUserphone()))
            && (this.getSendphone() == null ? other.getSendphone() == null : this.getSendphone().equals(other.getSendphone()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getIsread() == null ? other.getIsread() == null : this.getIsread().equals(other.getIsread()))
            && (this.getIsdel() == null ? other.getIsdel() == null : this.getIsdel().equals(other.getIsdel()))
            && (this.getIssave() == null ? other.getIssave() == null : this.getIssave().equals(other.getIssave()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReceiveemailid() == null) ? 0 : getReceiveemailid().hashCode());
        result = prime * result + ((getUserphone() == null) ? 0 : getUserphone().hashCode());
        result = prime * result + ((getSendphone() == null) ? 0 : getSendphone().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getIsread() == null) ? 0 : getIsread().hashCode());
        result = prime * result + ((getIsdel() == null) ? 0 : getIsdel().hashCode());
        result = prime * result + ((getIssave() == null) ? 0 : getIssave().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receiveemailid=").append(receiveemailid);
        sb.append(", userphone=").append(userphone);
        sb.append(", sendphone=").append(sendphone);
        sb.append(", title=").append(title);
        sb.append(", message=").append(message);
        sb.append(", isread=").append(isread);
        sb.append(", isdel=").append(isdel);
        sb.append(", issave=").append(issave);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", sign=").append(sign);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}