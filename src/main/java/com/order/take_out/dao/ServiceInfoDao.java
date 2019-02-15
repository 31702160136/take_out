package com.order.take_out.dao;

import com.order.take_out.pojo.market.ServiceInfo;

import java.util.List;

public interface ServiceInfoDao {
    /**
     * 查询所有市场续费信息
     * @return
     */
    public List<ServiceInfo> findAll();

    /**
     * 根据MarketId查询市场续费信息
     * @param id
     * @return
     */
    public ServiceInfo findServiceInfoByMarketId(int id);

    /**
     * 插入信息
     * @param serviceInfo
     * @return
     */
    public int insert(ServiceInfo serviceInfo);

    /**
     * 更新信息
     * @param serviceInfo
     * @return
     */
    public int modify(ServiceInfo serviceInfo);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
