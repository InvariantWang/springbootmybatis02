package com.odianyun.internship.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxj
 * @date 2021/7/19 - 13:55
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6071305180207124673L;
    /**
     * id
     */
    private Long id;

    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码
     */

    private String password;
    /**
     * 创建时间
     */

    private Date createTime;
    /**
     * 更新时间
     */

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString ( ) {
        return "User{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
