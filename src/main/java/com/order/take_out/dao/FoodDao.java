package com.order.take_out.dao;

import com.order.take_out.pojo.menu.Food;

import java.util.List;

public interface FoodDao {
    /**
     * 查询所有食品
     * @return
     */
    public List<Food> findAll();

    /**
     * 根据categoryId查询所有食品列表，一个类别存在多个食品
     * @param id
     * @return
     */
    public List<Food> findFoodByCategoryId(int id);

    /**
     * 插入信息
     * @param food
     * @return
     */
    public int insert(Food food);

    /**
     * 更新信息
     * @param food
     * @return
     */
    public int modify(Food food);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
