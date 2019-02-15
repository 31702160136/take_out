package com.order.take_out.pojo.bill;

import com.order.take_out.pojo.client.UserOpenid;
import com.order.take_out.pojo.merchant.Merchant;

import java.util.Date;

/**
 * @program: take_out
 * @description: 订单
 * @author: Mr.Yang
 * @create: 2019-02-13 16:58
 **/
public class Bill {
//    订单id
    private Integer id;
//    订单编码
    private String number;
//    订单价格
    private Double price;
//    订单优惠金额
    private Double discounts;
//    订单是否支付
    private Integer isPay;
//    订单支付时间
    private Date payTime;
//    备注
    private String remark;
//    订单对应的顾客id
    private Integer userOpenidId;
//    订单对应的商家id
    private Integer merchantId;
//    创建时间
    private Date creationTime;
//    修改时间
    private Date modificationTime;

    //    订单对应的顾客
    private UserOpenid userOpenid;
    //    订单对应的商家
    private Merchant merchant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Double discounts) {
        this.discounts = discounts;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUserOpenidId() {
        return userOpenidId;
    }

    public void setUserOpenidId(Integer userOpenidId) {
        this.userOpenidId = userOpenidId;
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

    public UserOpenid getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(UserOpenid userOpenid) {
        this.userOpenid = userOpenid;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", price=" + price +
                ", discounts=" + discounts +
                ", isPay=" + isPay +
                ", payTime=" + payTime +
                ", remark='" + remark + '\'' +
                ", userOpenidId=" + userOpenidId +
                ", merchantId=" + merchantId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                ", userOpenid=" + userOpenid +
                ", merchant=" + merchant +
                '}';
    }
}
