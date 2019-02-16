package com.order.take_out.dao;

import com.order.take_out.pojo.merchant.MerchantPassword;

import java.util.List;

public interface MerchantPasswordDao {
    /**
     * 查询所有店铺密码
     * @return
     */
    public List<MerchantPassword> findAll();

    /**
     * 根据MerchantUserId查询店铺密码
     * @param id
     * @return
     */
    public MerchantPassword findMerchantPasswordByMerchantUserId(int id);

    /**
     * 插入信息
     * @param merchantPassword
     * @return
     */
    public int insert(MerchantPassword merchantPassword);

    /**
     * 更新信息
     * @param merchantPassword
     * @return
     */
    public int modify(MerchantPassword merchantPassword);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
