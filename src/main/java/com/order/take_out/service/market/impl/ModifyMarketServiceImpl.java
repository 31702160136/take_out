package com.order.take_out.service.market.impl;

import com.order.take_out.dao.MarketAdminInfoDao;
import com.order.take_out.dao.MarketDao;
import com.order.take_out.dao.MarketPasswordDao;
import com.order.take_out.dao.ServiceInfoDao;
import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.pojo.market.MarketPassword;
import com.order.take_out.pojo.market.ServiceInfo;
import com.order.take_out.service.market.ModifyMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    @Autowired
    MarketPasswordDao marketPasswordDao;

    /**
     * 修改市场信息
     * @param market
     * @return
     */
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

    /**
     * 修改市场管理员信息
     * @param marketAdminInfo
     * @return
     */
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

    /**
     * 修改市场续费信息
     * @param serviceInfo
     * @return
     */
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

    /**
     * 修改密码
     * @param password
     * @param oldPassword
     * @param marketUserId
     * @return
     */
    @Override
    public Boolean modifyMarketPassword(String password,String oldPassword,Integer marketUserId) {
        MarketPassword getOldPass=marketPasswordDao.findMarketPasswordByMarketUserId(marketUserId);
        if (oldPassword.equals(getOldPass.getPassword())){
            if (!password.equals(getOldPass.getPassword())){
                MarketPassword marketPassword=new MarketPassword();
                marketPassword.setId(getOldPass.getId());
                marketPassword.setMarketUserId(getOldPass.getMarketUserId());
                marketPassword.setdPassword("");
                marketPassword.setPassword(password);
                marketPassword.setModificationTime(new Date());
                try {
                    int result=marketPasswordDao.modify(marketPassword);
                    if (result>0){
                        return true;
                    }else {
                        throw new RuntimeException("修改密码失败!");
                    }
                }catch (RuntimeException e){
                    throw new RuntimeException("修改密码失败!"+e);
                }
            }else {
                throw new RuntimeException("新密码与旧密码重复!");
            }
        }else {
            throw new RuntimeException("旧密码不一致!");
        }
    }
}
