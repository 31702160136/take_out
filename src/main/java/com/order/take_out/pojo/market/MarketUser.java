package com.order.take_out.pojo.market;

import java.util.Date;

/**
 * @program: take_out
 * @description: 市场管理账号
 * @author: Mr.Yang
 * @create: 2019-02-13 20:17
 **/
public class MarketUser {
    //    市场管理账号id
    private Integer id;
    //    市场管理账号
    private String username;
    //    市场管理账号对应的市场
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return "MarketUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", marketId=" + marketId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
