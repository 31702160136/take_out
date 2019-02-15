package com.order.take_out.dao;

import com.order.take_out.pojo.market.MarketUser;

import java.util.List;

public interface MarketUserDao {
    /**
     * 查询所有市场管理账号
     * @return
     */
    public List<MarketUser> findAll();

    /**
     * 根据MarketId查询市场管理账号
     * @param id
     * @return
     */
    public MarketUser findMarketUserByMarketId(int id);

    /**
     * 插入信息
     * @param marketUser
     * @return
     */
    public int insert(MarketUser marketUser);

    /**
     * 更新信息
     * @param marketUser
     * @return
     */
    public int modify(MarketUser marketUser);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
