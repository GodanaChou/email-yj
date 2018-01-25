package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class UserPermissions implements Serializable {
    private Integer userperid;

    private Integer userid;

    private Integer permissionsId;

    private static final long serialVersionUID = 1L;

    public Integer getUserperid() {
        return userperid;
    }

    public void setUserperid(Integer userperid) {
        this.userperid = userperid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
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
        UserPermissions other = (UserPermissions) that;
        return (this.getUserperid() == null ? other.getUserperid() == null : this.getUserperid().equals(other.getUserperid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getPermissionsId() == null ? other.getPermissionsId() == null : this.getPermissionsId().equals(other.getPermissionsId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserperid() == null) ? 0 : getUserperid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getPermissionsId() == null) ? 0 : getPermissionsId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userperid=").append(userperid);
        sb.append(", userid=").append(userid);
        sb.append(", permissionsId=").append(permissionsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}