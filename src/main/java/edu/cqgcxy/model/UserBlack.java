package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class UserBlack implements Serializable {
    private Integer userblackid;

    private Integer userId;

    /**
     * 黑名单ID
     */
    private Integer blackId;

    private static final long serialVersionUID = 1L;

    public Integer getUserblackid() {
        return userblackid;
    }

    public void setUserblackid(Integer userblackid) {
        this.userblackid = userblackid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBlackId() {
        return blackId;
    }

    public void setBlackId(Integer blackId) {
        this.blackId = blackId;
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
        UserBlack other = (UserBlack) that;
        return (this.getUserblackid() == null ? other.getUserblackid() == null : this.getUserblackid().equals(other.getUserblackid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBlackId() == null ? other.getBlackId() == null : this.getBlackId().equals(other.getBlackId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserblackid() == null) ? 0 : getUserblackid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBlackId() == null) ? 0 : getBlackId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userblackid=").append(userblackid);
        sb.append(", userId=").append(userId);
        sb.append(", blackId=").append(blackId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}