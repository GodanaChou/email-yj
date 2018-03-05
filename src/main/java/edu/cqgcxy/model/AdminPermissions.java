package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class AdminPermissions implements Serializable {
    private Integer adminperid;

    private Integer adminid;

    private Integer permissionsId;

    private static final long serialVersionUID = 1L;

    public Integer getAdminperid() {
        return adminperid;
    }

    public void setAdminperid(Integer adminperid) {
        this.adminperid = adminperid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
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
        AdminPermissions other = (AdminPermissions) that;
        return (this.getAdminperid() == null ? other.getAdminperid() == null : this.getAdminperid().equals(other.getAdminperid()))
            && (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
            && (this.getPermissionsId() == null ? other.getPermissionsId() == null : this.getPermissionsId().equals(other.getPermissionsId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminperid() == null) ? 0 : getAdminperid().hashCode());
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
        result = prime * result + ((getPermissionsId() == null) ? 0 : getPermissionsId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminperid=").append(adminperid);
        sb.append(", adminid=").append(adminid);
        sb.append(", permissionsId=").append(permissionsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}