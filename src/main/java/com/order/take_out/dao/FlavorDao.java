package com.order.take_out.dao;

import com.order.take_out.pojo.menu.Flavor;

import java.util.List;
/**
* @Description:
* @Param:
* @return:
* @Author: Mr.Yang
* @Date: 2019/2/15
*/
public interface FlavorDao {
    /**
     * 查询所有食品口味
     * @return
     */
    public List<Flavor> findAll();

    /**
     * 根据FoodId查询所有食品口味列表，一个食品存在与多个口味
     * @param id
     * @return
     */
    public List<Flavor> findFlavorByFoodId(int id);

    /**
     * 插入信息
     * @param flavor
     * @return
     */
    public int insert(Flavor flavor);

    /**
     * 更新信息
     * @param flavor
     * @return
     */
    public int modify(Flavor flavor);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
