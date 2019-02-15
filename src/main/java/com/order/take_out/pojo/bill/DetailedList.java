package com.order.take_out.pojo.bill;

import java.util.Date;

/**
 * @program: take_out
 * @description:订单菜品快照
 * @author: Mr.Yang
 * @create: 2019-02-15 21:20
 **/
public class DetailedList {
    private Integer id;
    private String name;
    private Integer originalPrice;
    private Integer price;
    private Integer count;
    private String flavor;
    private Integer billId;
    private Date creationTime;
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

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
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
        return "snapshoot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", originalPrice=" + originalPrice +
                ", price=" + price +
                ", count=" + count +
                ", flavor='" + flavor + '\'' +
                ", billId=" + billId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
