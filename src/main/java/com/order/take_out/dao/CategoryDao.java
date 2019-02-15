package com.order.take_out.dao;

import com.order.take_out.pojo.menu.Category;

import java.util.List;

public interface CategoryDao {
    /**
     * 查询所有菜单分类
     * @return
     */
    public List<Category> findAll();

    /**
     * 根据MerchantId查询所有菜单分类,一个商店存在多个菜单分类
     * @param id merchantId
     * @return
     */
    public List<Category> findCategoryByMerchantId(int id);

    /**
     * 插入信息
     * @param category
     * @return
     */
    public int insert(Category category);

    /**
     * 更新信息
     * @param category
     * @return
     */
    public int modify(Category category);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
