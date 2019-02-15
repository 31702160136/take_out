package com.order.take_out.pojo.merchant;

import java.util.Date;

/**
 * @program: take_out
 * @description: 商店账号
 * @author: Mr.Yang
 * @create: 2019-02-13 20:21
 **/
public class MerchantUser {
    //    商店账号id
    private Integer id;
    //    商店账号
    private String username;
    //    商店账号对应的商店
    private Integer merchantId;
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

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
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
        return "MerchantUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", merchantId=" + merchantId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
