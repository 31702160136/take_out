package com.order.take_out.dao;

import com.order.take_out.pojo.merchant.MerchantUser;

import java.util.List;

public interface MerchantUserDao {
    /**
     * 查询所有店铺账号
     * @return
     */
    public List<MerchantUser> findAll();

    /**
     * 根据MerchantId查询店铺账号
     * @param id
     * @return
     */
    public MerchantUser findMerchantUserByMerchantId(int id);

    /**
     * 根据UserName查询店铺账号
     * @param username
     * @return
     */
    public MerchantUser findMerchantUserByUserName(String username);

    /**
     * 插入信息
     * @param merchantUser
     * @return
     */
    public int insert(MerchantUser merchantUser);

    /**
     * 更新信息
     * @param merchantUser
     * @return
     */
    public int modify(MerchantUser merchantUser);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
