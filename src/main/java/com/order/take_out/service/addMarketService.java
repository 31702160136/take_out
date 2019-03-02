package com.order.take_out.service;

import com.order.take_out.pojo.market.Market;

public interface addMarketService {

    /**
     * 创建店铺
     * @return
     */
    public Boolean createMarket(String username,String password);
}
