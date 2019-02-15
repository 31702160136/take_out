package com.order.take_out.pojo.merchant;

import java.util.Date;

/**
 * @program: take_out
 * @description: 商店密码
 * @author: Mr.Yang
 * @create: 2019-02-13 20:20
 **/
public class MerchantPassword {
//    商店密码id
    private Integer id;
//    商店密码
    private String password;
//    商店动态密码
    private String dPassword;
//    商店密码对应的商店账号
    private Integer merchantUserId;
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

    public Integer getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(Integer merchantUserId) {
        this.merchantUserId = merchantUserId;
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
        return "MerchantPassword{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", dPassword='" + dPassword + '\'' +
                ", merchantUserId=" + merchantUserId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
