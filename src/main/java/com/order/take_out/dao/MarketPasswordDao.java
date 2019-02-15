package com.order.take_out.dao;


import com.order.take_out.pojo.market.MarketPassword;

import java.util.List;

public interface MarketPasswordDao {
    /**
     * 查询所有市场管理密码
     * @return
     */
    public List<MarketPassword> findAll();

    /**
     * 根据MarketUserId查询市场管理密码
     * @param id
     * @return
     */
    public MarketPassword findMarketPasswordByMarketUserId(int id);

    /**
     * 插入信息
     * @param marketPassword
     * @return
     */
    public int insert(MarketPassword marketPassword);

    /**
     * 更新信息
     * @param marketPassword
     * @return
     */
    public int modify(MarketPassword marketPassword);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
