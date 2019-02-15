package com.order.take_out.pojo.merchant;

import java.util.Date;

/**
 * @program: take_out
 * @description: 商家信息
 * @author: Mr.Yang
 * @create: 2019-02-13 22:59
 **/
public class MerchantAdminInfo {
//    商家id
    private Integer id;
//    商家名称
    private String name;
//    商家性别
    private Integer gender;
//    商家电话
    private String phone;
//    商家住址
    private String address;
//    商家信息对应的店铺
    private Integer merchantId;
    //    创建时间
    private Date creationTime;
    //    修改时间
    private Date modificationTime;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "MerchantAdmin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", merchantId=" + merchantId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
