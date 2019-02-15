package com.order.take_out.pojo.merchant_discount;

import java.util.Date;

/**
 * @program: take_out
 * @description: 优惠：满减
 * @author: Mr.Yang
 * @create: 2019-02-13 20:20
 **/
public class DiscountSubtract {
    //    优惠：满减id
    private Integer id;
    //    优惠名称
    private String name;
    //    优惠条件金额门槛
    private Double condition;
    //    减多少
    private Double subtract;
    //    优惠：满减对应的商店id
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCondition() {
        return condition;
    }

    public void setCondition(Double condition) {
        this.condition = condition;
    }

    public Double getSubtract() {
        return subtract;
    }

    public void setSubtract(Double subtract) {
        this.subtract = subtract;
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
        return "DiscountSubtract{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", condition=" + condition +
                ", subtract=" + subtract +
                ", merchantId=" + merchantId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
