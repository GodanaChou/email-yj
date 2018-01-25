package edu.cqgcxy.model;

import java.io.Serializable;

/**
 * @author 
 */
public class UserFriend implements Serializable {
    private Integer userfriendid;

    private Integer userid;

    private String friendphone;

    private String friendname;

    private static final long serialVersionUID = 1L;

    public Integer getUserfriendid() {
        return userfriendid;
    }

    public void setUserfriendid(Integer userfriendid) {
        this.userfriendid = userfriendid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFriendphone() {
        return friendphone;
    }

    public void setFriendphone(String friendphone) {
        this.friendphone = friendphone;
    }

    public String getFriendname() {
        return friendname;
    }

    public void setFriendname(String friendname) {
        this.friendname = friendname;
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
        UserFriend other = (UserFriend) that;
        return (this.getUserfriendid() == null ? other.getUserfriendid() == null : this.getUserfriendid().equals(other.getUserfriendid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getFriendphone() == null ? other.getFriendphone() == null : this.getFriendphone().equals(other.getFriendphone()))
            && (this.getFriendname() == null ? other.getFriendname() == null : this.getFriendname().equals(other.getFriendname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserfriendid() == null) ? 0 : getUserfriendid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getFriendphone() == null) ? 0 : getFriendphone().hashCode());
        result = prime * result + ((getFriendname() == null) ? 0 : getFriendname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userfriendid=").append(userfriendid);
        sb.append(", userid=").append(userid);
        sb.append(", friendphone=").append(friendphone);
        sb.append(", friendname=").append(friendname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}