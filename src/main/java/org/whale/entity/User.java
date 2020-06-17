package org.whale.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: gzip
 * @Date: 2020/6/17  9:26
 * @Description:
 **/
@Entity
@Data
public class User {

    private String userName;
    private String password;
    private String remark;
    private int pkUserId;

    @Basic
    @Column(name = "USER_NAME", nullable = false, length = 256)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 256)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, length = 512)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Id
    @Column(name = "PK_USER_ID", nullable = false)
    public int getPkUserId() {
        return pkUserId;
    }

    public void setPkUserId(int pkUserId) {
        this.pkUserId = pkUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (pkUserId != user.pkUserId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (remark != null ? !remark.equals(user.remark) : user.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkUserId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
