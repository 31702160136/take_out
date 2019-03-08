package com.order.take_out.service.market.Impl;

import com.order.take_out.dao.MarketAdminInfoDao;
import com.order.take_out.dao.MarketDao;
import com.order.take_out.dao.ServiceInfoDao;
import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.pojo.market.ServiceInfo;
import com.order.take_out.service.market.ModifyMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-03 19:08
 **/
@Service
public class ModifyMarketServiceImpl implements ModifyMarketService {

    @Autowired
    MarketDao marketDao;
    @Autowired
    MarketAdminInfoDao marketAdminInfoDao;
    @Autowired
    ServiceInfoDao serviceInfoDao;

    @Override
    public Boolean modifyMarket(Market market) {
        if (market.getId()!=null){
            try {
                int result=marketDao.modify(market);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("修改市场信息修改错误");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("修改市场信息修改错误"+e.getMessage());
            }
        }else{
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public Boolean modifyMarketAdminInfo(MarketAdminInfo marketAdminInfo) {
        if (marketAdminInfo.getId()!=null){
            try {
                int result=marketAdminInfoDao.modify(marketAdminInfo);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("修改市场管理员信息修改错误");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("修改市场管理员信息修改错误"+e.getMessage());
            }
        }else{
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public Boolean modifyServiceInfo(ServiceInfo serviceInfo) {
        if (serviceInfo.getId()!=null){
            try {
                int result=serviceInfoDao.modify(serviceInfo);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("修改市场续费信息修改错误");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("修改市场续费信息修改错误"+e.getMessage());
            }
        }else{
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }
}
