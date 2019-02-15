package com.order.take_out.pojo.market;

import java.util.Date;

/**
 * @program: take_out
 * @description: 市场
 * @author: Mr.Yang
 * @create: 2019-02-13 17:01
 **/
public class Market {
//    市场id
    private Integer id;
//    市场名称
    private String name;
//    市场地址
    private String address;
//    是否已激活
    private Integer isActivate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Integer isActivate) {
        this.isActivate = isActivate;
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
        return "market{" +
                "id=" + id +
                ", market_name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isActivate=" + isActivate +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
