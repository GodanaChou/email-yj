package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Permissions implements Serializable {
    private Integer permissionsid;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限接口
     */
    private String service;

    /**
     * 日志
     */
    private String log;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionsid() {
        return permissionsid;
    }

    public void setPermissionsid(Integer permissionsid) {
        this.permissionsid = permissionsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
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
        Permissions other = (Permissions) that;
        return (this.getPermissionsid() == null ? other.getPermissionsid() == null : this.getPermissionsid().equals(other.getPermissionsid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getService() == null ? other.getService() == null : this.getService().equals(other.getService()))
            && (this.getLog() == null ? other.getLog() == null : this.getLog().equals(other.getLog()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPermissionsid() == null) ? 0 : getPermissionsid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getService() == null) ? 0 : getService().hashCode());
        result = prime * result + ((getLog() == null) ? 0 : getLog().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionsid=").append(permissionsid);
        sb.append(", name=").append(name);
        sb.append(", service=").append(service);
        sb.append(", log=").append(log);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}