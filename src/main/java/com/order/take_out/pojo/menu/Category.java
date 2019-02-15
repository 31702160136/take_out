package com.order.take_out.pojo.menu;

import java.util.Date;

/**
 * @program: take_out
 * @description: 菜单类目
 * @author: Mr.Yang
 * @create: 2019-02-13 16:59
 **/
public class Category {
//    菜单类目id
    private Integer id;
//    菜单类目名称
    private String name;
//    菜单类目权重，决定排序顺序，0最小权重
    private Integer index;
//    菜单类目对应的商家
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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
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
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", index=" + index +
                ", merchantId=" + merchantId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
