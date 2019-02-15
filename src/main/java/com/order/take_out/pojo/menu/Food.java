package com.order.take_out.pojo.menu;

import java.util.Date;

/**
 * @program: take_out
 * @description: 食品
 * @author: Mr.Yang
 * @create: 2019-02-13 17:00
 **/
public class Food {
//    食品id
    private Integer id;
//    食品名称
    private String name;
//    食品描述
    private String description;
//    食品原价
    private double originalPrice;
//    食品价格
    private double price;
//    食品销售量
    private Integer salesVolume;
//    食品对应的类目
    private Integer categoryId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", originalPrice=" + originalPrice +
                ", price=" + price +
                ", salesVolume=" + salesVolume +
                ", categoryId=" + categoryId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
