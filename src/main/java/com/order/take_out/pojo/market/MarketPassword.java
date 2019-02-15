package com.order.take_out.pojo.market;

import java.util.Date;

/**
 * @program: take_out
 * @description: 市场管理员密码
 * @author: Mr.Yang
 * @create: 2019-02-13 19:54
 **/
public class MarketPassword {
//    市场管理密码id
    private Integer id;
//    市场管理密码
    private String password;
//    市场管理动态密码
    private String dPassword;
//    市场管理密码对应的市场账号
    private Integer marketUserId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getdPassword() {
        return dPassword;
    }

    public void setdPassword(String dPassword) {
        this.dPassword = dPassword;
    }

    public Integer getMarketUserId() {
        return marketUserId;
    }

    public void setMarketUserId(Integer marketUserId) {
        this.marketUserId = marketUserId;
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
        return "MarketPassword{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", dPassword='" + dPassword + '\'' +
                ", marketUserId=" + marketUserId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
