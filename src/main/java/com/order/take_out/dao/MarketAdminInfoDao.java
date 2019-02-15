package com.order.take_out.dao;

import com.order.take_out.pojo.market.MarketAdminInfo;

import java.util.List;

public interface MarketAdminInfoDao {
    /**
     * 查询所有市场管理员信息
     * @return
     */
    public List<MarketAdminInfo> findAll();

    /**
     * 根据MarketId查询市场管理员信息
     * @param id
     * @return
     */
    public MarketAdminInfo findMarketAdminInfoByMarketId(int id);

    /**
     * 插入信息
     * @param marketAdminInfo
     * @return
     */
    public int insert(MarketAdminInfo marketAdminInfo);

    /**
     * 更新信息
     * @param marketAdminInfo
     * @return
     */
    public int modify(MarketAdminInfo marketAdminInfo);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
