package com.order.take_out.pojo.menu;

import java.util.Date;

/**
 * @program: take_out
 * @description: 食品口味
 * @author: Mr.Yang
 * @create: 2019-02-13 17:00
 **/
public class Flavor {
//    食品口味id
    private Integer id;
//    食品口味名称
    private String name;
//    食品口味对应的食物
    private Integer foodId;
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

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
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
        return "Flavor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foodId=" + foodId +
                ", creationTime=" + creationTime +
                ", modificationTime=" + modificationTime +
                '}';
    }
}
