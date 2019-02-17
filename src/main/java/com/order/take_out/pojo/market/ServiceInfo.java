package com.order.take_out.pojo.market;

import java.util.Date;

/**
 * @program: take_out
 * @description: 续费信息
 * @author: Mr.Yang
 * @create: 2019-02-13 20:18
 **/
public class ServiceInfo {
//    市场续费id
    private Integer id;
//    市场续费次数
    private Integer numOfRenewal;
//    市场最新续费日期
    private Date startingTime;
//    市场使用过期时间
    private Date endTime;
//    续费信息对应的市场
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

    public Integer getNumOfRenewal() {
        return numOfRenewal;
    }

    public void setNumOfRenewal(Integer numOfRenewal) {
        this.numOfRenewal = numOfRenewal;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        return "ServiceInfo{" +
                "id=" + id +
                ", numOfRenewal=" + numOfRenewal +
                ", startingTime=" + startingTime +
                ", end_time=" + endTime +
                ", marketId=" + marketId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
