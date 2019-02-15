package com.order.take_out.pojo.merchant;

import java.util.Date;

/**
 * @program: take_out
 * @description: 店铺
 * @author: Mr.Yang
 * @create: 2019-02-13 20:20
 **/
public class Merchant {
//    店铺id
    private Integer id;
//    店铺名称
    private String name;
//    店铺地址
    private String address;
//    是否营业
    private Integer isDoBusiness;
//    店铺对应的市场
    private Integer marketId;
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

    public Integer getIsDoBusiness() {
        return isDoBusiness;
    }

    public void setIsDoBusiness(Integer isDoBusiness) {
        this.isDoBusiness = isDoBusiness;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
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
        return "Merchant{" +
                "id=" + id +
                ", shopName='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isDoBusiness=" + isDoBusiness +
                ", marketId=" + marketId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
