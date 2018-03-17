package edu.cqgcxy.model;

import java.io.Serializable;

public class PowerModel implements Serializable {

    private String name;

    private int userid;

    private String powerName;

    private int powerid;

    private String powerids;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public int getPowerid() {
        return powerid;
    }

    public void setPowerid(int powerid) {
        this.powerid = powerid;
    }

    public String getPowerids() {
        return powerids;
    }

    public void setPowerids(String powerids) {
        this.powerids = powerids;
    }
}
