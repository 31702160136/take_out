package com.order.take_out.service.market;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketUser;
import com.order.take_out.pojo.merchant.Merchant;

import java.util.List;

public interface SelectMarketService {
    /**
     * 查询所有市场
     * @return
     */
    public List<Market> getMarketList();

    /**
     * 查询市场
     * @param id
     * @return
     */
    public Market getMarket(Integer id);

    /**
     * 根据Name查询所有市场
     * @param name
     * @return
     */
    public List<Market> getMarketByName(String name);

    /**
     * 根据MarketId查询市场管理账号
     * @param MarketId
     * @return
     */
    public MarketUser getMarketUser(Integer MarketId);
}
