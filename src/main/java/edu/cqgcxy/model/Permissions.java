package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Permissions implements Serializable {
    private Integer permissionsid;

    private String url;

    private String style;

    private String img;

    /**
     * 权限名称
     */
    private String name;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLog() == null ? other.getLog() == null : this.getLog().equals(other.getLog()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPermissionsid() == null) ? 0 : getPermissionsid().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLog() == null) ? 0 : getLog().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionsid=").append(permissionsid);
        sb.append(", img=").append(img);
        sb.append(", name=").append(name);
        sb.append(", log=").append(log);
        sb.append(", style=").append(style);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}