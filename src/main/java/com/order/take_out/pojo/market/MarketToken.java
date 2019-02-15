package com.order.take_out.pojo.market;

import java.util.Date;

/**
 * @program: take_out
 * @description: 市场管理操作通行证
 * @author: Mr.Yang
 * @create: 2019-02-13 20:16
 **/
public class MarketToken {
    //    市场管理操作通行证id
    private Integer id;
    //    市场管理操作通行证
    private String token;
    //    操作通行证对应的市场
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
        return "MarketToken{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", marketId=" + marketId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
