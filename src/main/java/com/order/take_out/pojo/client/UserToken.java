package com.order.take_out.pojo.client;

import java.util.Date;

/**
 * @program: take_out
 * @description: 用户操作通行证
 * @author: Mr.Yang
 * @create: 2019-02-13 20:22
 **/
public class UserToken {
//    顾客操作通行证id
    private Integer id;
//    顾客操作通行证
    private String token;
//    操作通行证对应的顾客
    private Integer userOpenidId;
    //    创建时间
    private Date creationTime;
    //    修改时间
    private Date modificationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserOpenidId() {
        return userOpenidId;
    }

    public void setUserOpenidId(Integer userOpenidId) {
        this.userOpenidId = userOpenidId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    @Override
    public String toString() {
        return "UserToken{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", userOpenidId=" + userOpenidId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
