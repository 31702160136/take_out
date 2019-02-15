package com.order.take_out.pojo.client;

import java.util.Date;

/**
 * @program: take_out
 * @description: 客户的openid
 * @author: Mr.Yang
 * @create: 2019-02-13 20:22
 **/
public class UserOpenid {
//    顾客id
    private Integer id;
//    顾客openid
    private String openid;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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
        return "UserOpenid{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
