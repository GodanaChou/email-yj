package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Annex implements Serializable {
    private Integer annexid;

    /**
     * 附件名称
     */
    private String annexname;

    /**
     * 附件地址
     */
    private String annexaddr;

    /**
     * 附件标识
     */
    private String annexsign;

    /**
     * 附件类型
     */
    private Integer size;

    /**
     * 大小
     */
    private String big;

    private static final long serialVersionUID = 1L;

    public Integer getAnnexid() {
        return annexid;
    }

    public void setAnnexid(Integer annexid) {
        this.annexid = annexid;
    }

    public String getAnnexname() {
        return annexname;
    }

    public void setAnnexname(String annexname) {
        this.annexname = annexname;
    }

    public String getAnnexaddr() {
        return annexaddr;
    }

    public void setAnnexaddr(String annexaddr) {
        this.annexaddr = annexaddr;
    }

    public String getAnnexsign() {
        return annexsign;
    }

    public void setAnnexsign(String annexsign) {
        this.annexsign = annexsign;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
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
        Annex other = (Annex) that;
        return (this.getAnnexid() == null ? other.getAnnexid() == null : this.getAnnexid().equals(other.getAnnexid()))
            && (this.getAnnexname() == null ? other.getAnnexname() == null : this.getAnnexname().equals(other.getAnnexname()))
            && (this.getAnnexaddr() == null ? other.getAnnexaddr() == null : this.getAnnexaddr().equals(other.getAnnexaddr()))
            && (this.getAnnexsign() == null ? other.getAnnexsign() == null : this.getAnnexsign().equals(other.getAnnexsign()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getBig() == null ? other.getBig() == null : this.getBig().equals(other.getBig()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnnexid() == null) ? 0 : getAnnexid().hashCode());
        result = prime * result + ((getAnnexname() == null) ? 0 : getAnnexname().hashCode());
        result = prime * result + ((getAnnexaddr() == null) ? 0 : getAnnexaddr().hashCode());
        result = prime * result + ((getAnnexsign() == null) ? 0 : getAnnexsign().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getBig() == null) ? 0 : getBig().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", annexid=").append(annexid);
        sb.append(", annexname=").append(annexname);
        sb.append(", annexaddr=").append(annexaddr);
        sb.append(", annexsign=").append(annexsign);
        sb.append(", size=").append(size);
        sb.append(", big=").append(big);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}