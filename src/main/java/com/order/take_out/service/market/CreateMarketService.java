package com.order.take_out.service.market;

import java.util.Map;

public interface CreateMarketService {
    /**
     * 创建市场
     * @return
     */
    public Boolean createMarket(Map<String,Object> map);
}
