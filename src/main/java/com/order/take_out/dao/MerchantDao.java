package com.order.take_out.dao;

import com.order.take_out.pojo.merchant.Merchant;

import java.util.List;

public interface MerchantDao {
    /**
     * 查询所有商店
     * @return
     */
    public List<Merchant> findAll();

    /**
     * 根据MarketId查询商店列表，一个市场存在多个商店
     * @param id
     * @return
     */
    public List<Merchant> findMerchantByMarketId(int id);

    /**
     * 根据name查询商店列表，一个名字可能存在多个商店
     * @param name
     * @return
     */
    public List<Merchant> findMerchantByName(String name);

    /**
     * 插入信息
     * @param merchant
     * @return
     */
    public int insert(Merchant merchant);

    /**
     * 更新信息
     * @param merchant
     * @return
     */
    public int modify(Merchant merchant);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
