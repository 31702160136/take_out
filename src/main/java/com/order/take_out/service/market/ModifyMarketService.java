package com.order.take_out.service.market;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.pojo.market.ServiceInfo;

public interface ModifyMarketService {
    /**
     * 修改市场信息
     * @return
     */
    public Boolean modifyMarket(Market market);

    /**
     * 修改市场管理员信息
     * @return
     */
    public Boolean modifyMarketAdminInfo(MarketAdminInfo marketAdminInfo);

    /**
     * 修改市场续费信息
     * @return
     */
    public Boolean modifyServiceInfo(ServiceInfo serviceInfo);
}
