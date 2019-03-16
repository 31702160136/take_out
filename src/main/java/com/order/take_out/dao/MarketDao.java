package com.order.take_out.dao;

import com.order.take_out.pojo.client.UserOpenid;
import com.order.take_out.pojo.market.Market;

import java.util.List;

public interface MarketDao {
    /**
     * 查询所有市场
     * @return
     */
    public List<Market> findAll(int page,int pageSize);

    /**
     * 查询市场
     * @param id
     * @return
     */
    public Market findOne(int id);

    /**
     * 根据Name查询所有市场
     * @param name
     * @return
     */
    public List<Market> findAllByName(String name);

    /**
     * 插入信息
     * @param market
     * @return
     */
    public int insert(Market market);

    /**
     * 更新信息
     * @param market
     * @return
     */
    public int modify(Market market);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
