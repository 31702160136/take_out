package com.order.take_out.dao;

import com.order.take_out.pojo.merchant_discount.DiscountDiscount;

import java.util.List;

public interface DiscountDiscountDao {
    /**
     * 查询所有所有优惠：折扣
     * @return
     */
    public List<DiscountDiscount> findAll();

    /**
     * 根据MerchantId查询所有优惠：折扣
     * @param id
     * @return
     */
    public List<DiscountDiscount> findDiscountDiscountByMerchantId(int id);

    /**
     * 插入信息
     * @param discountDiscount
     * @return
     */
    public int insert(DiscountDiscount discountDiscount);

    /**
     * 更新信息
     * @param discountDiscount
     * @return
     */
    public int modify(DiscountDiscount discountDiscount);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
