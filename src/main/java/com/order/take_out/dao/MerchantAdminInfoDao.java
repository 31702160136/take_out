package com.order.take_out.dao;

import com.order.take_out.pojo.merchant.MerchantAdminInfo;

import java.util.List;

public interface MerchantAdminInfoDao {
    /**
     * 查询所有店铺商家信息
     * @return
     */
    public List<MerchantAdminInfo> findAll();

    /**
     * 根据MerchantId查询店铺商家信息
     * @param id
     * @return
     */
    public MerchantAdminInfo findMerchantAdminInfoByMerchantId(int id);

    /**
     * 插入信息
     * @param merchantAdminInfo
     * @return
     */
    public int insert(MerchantAdminInfo merchantAdminInfo);

    /**
     * 更新信息
     * @param merchantAdminInfo
     * @return
     */
    public int modify(MerchantAdminInfo merchantAdminInfo);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
