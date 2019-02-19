package com.order.take_out.service;

import com.order.take_out.pojo.menu.Category;

import java.util.List;

public interface CategoryService {
    /**
     * 查询所有菜单分类
     * @return
     */
    public List<Category> getCategoryList();

    /**
     * 根据MerchantId查询所有菜单分类,一个商店存在多个菜单分类
     * @param id merchantId
     * @return
     */
    public List<Category> getdCategoryByMerchantIdList(Integer id);

    /**
     * 插入信息
     * @param category
     * @return
     */
    public boolean createCategory(Category category);

    /**
     * 更新信息
     * @param category
     * @return
     */
    public boolean modifyCategory(Category category);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public boolean deleteCategory(Integer id);
}
