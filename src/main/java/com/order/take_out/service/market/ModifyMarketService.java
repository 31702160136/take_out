package com.order.take_out.service.market;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.pojo.market.ServiceInfo;

import java.util.Map;

public interface ModifyMarketService {
    /**
     * 修改市场信息
     * @param market
     * @return
     */
    public Boolean modifyMarket(Market market);

    /**
     * 修改市场管理员信息
     * @param marketAdminInfo
     * @return
     */
    public Boolean modifyMarketAdminInfo(MarketAdminInfo marketAdminInfo);

    /**
     * 修改市场续费信息
     * @param serviceInfo
     * @return
     */
    public Boolean modifyServiceInfo(ServiceInfo serviceInfo);

    /**
     * 修改密码
     * @param password
     * @param oldPassword
     * @param marketUserId
     * @return
     */
    public Boolean modifyMarketPassword(String password,String oldPassword,Integer marketUserId);

    public Boolean modifyMarketDetailedInfo(Map<String,Object> map);
}
