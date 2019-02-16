package com.order.take_out.dao;

import com.order.take_out.pojo.merchant_discount.DiscountSubtract;

import java.util.List;

public interface DiscountSubtractDao {
    /**
     * 查询所有所有优惠：满减
     * @return
     */
    public List<DiscountSubtract> findAll();

    /**
     * 根据MerchantId查询所有优惠：满减
     * @param id
     * @return
     */
    public List<DiscountSubtract> findDiscountSubtractByMerchantId(int id);

    /**
     * 插入信息
     * @param discountSubtract
     * @return
     */
    public int insert(DiscountSubtract discountSubtract);

    /**
     * 更新信息
     * @param discountSubtract
     * @return
     */
    public int modify(DiscountSubtract discountSubtract);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
