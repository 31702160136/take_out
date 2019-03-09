package com.order.take_out.service.market.Impl;

import com.order.take_out.dao.*;
import com.order.take_out.pojo.market.*;
import com.order.take_out.service.market.CreateMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-02 22:30
 **/
@Service
public class CreateMarketServiceImpl implements CreateMarketService {
    @Autowired
    MarketDao marketDao;
    @Autowired
    MarketUserDao marketUserDao;
    @Autowired
    MarketPasswordDao marketPasswordDao;
    @Autowired
    MarketAdminInfoDao marketAdminInfoDao;
    @Autowired
    ServiceInfoDao serviceInfoDao;

    @Transactional
    @Override
    public Boolean createMarket(String username,String password) {
        Market market=new Market();
        market.setAddress("");
        market.setName("");
        market.setIsActivate(0);
        market.setModificationTime(new Date());
        market.setCreationTime(new Date());
        try {
            int result=marketDao.insert(market);
            if (result>0){
                int marketAdminInfoId=createMarketAdminInfo(market.getId());
                int serviceInfoId=createServiceInfo(market.getId());
                int userId=createUser(username,market.getId());
                int passwordId=createPassword(password,userId);
                return true;
            }else {
                throw new RuntimeException("创建店铺失败：");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("创建店铺失败："+e.getMessage());
        }
    }

    private int createUser(String username,Integer marketId) throws RuntimeException{
        try {
            MarketUser reMarketUser=marketUserDao.findMarketUserByUserName(username);
            if (reMarketUser==null){
                MarketUser marketUser=new MarketUser();
                marketUser.setUsername(username);
                marketUser.setMarketId(marketId);
                marketUser.setCreationTime(new Date());
                marketUser.setModificationTime(new Date());
                int result=marketUserDao.insert(marketUser);
                if (result>0){
                    return marketUser.getId();
                }else {
                    throw new RuntimeException("创建市场账号错误");
                }
            }else {
                throw new RuntimeException("账号重复");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("创建市场账号错误");
        }

    }

    private int createPassword(String password,Integer userId){
        MarketPassword marketPassword=new MarketPassword();
        marketPassword.setPassword(password);
        marketPassword.setdPassword("");
        marketPassword.setMarketUserId(userId);
        marketPassword.setCreationTime(new Date());
        marketPassword.setModificationTime(new Date());
        try {
            int result=marketPasswordDao.insert(marketPassword);
            if (result>0){
                return marketPassword.getId();
            }else {
                throw new RuntimeException("创建店铺密码错误");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("创建市场管理密码错误"+e);
        }
    }

    private int createMarketAdminInfo(Integer marketId){
        MarketAdminInfo marketAdminInfo=new MarketAdminInfo();
        marketAdminInfo.setName("");
        marketAdminInfo.setGender(0);
        marketAdminInfo.setAddress("");
        marketAdminInfo.setPhone("");
        marketAdminInfo.setMarketId(marketId);
        marketAdminInfo.setCreationTime(new Date());
        marketAdminInfo.setModificationTime(new Date());
        try {
            int result=marketAdminInfoDao.insert(marketAdminInfo);
            if (result>0){
                return marketAdminInfo.getId();
            }else {
                throw new RuntimeException("创建店铺密码错误");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("创建市场管理员信息失败："+e);
        }
    }

    private int createServiceInfo(Integer marketId){
        ServiceInfo serviceInfo=new ServiceInfo();
        serviceInfo.setNumOfRenewal(0);
        serviceInfo.setStartingTime(null);
        serviceInfo.setEndTime(null);
        serviceInfo.setMarketId(marketId);
        serviceInfo.setCreationTime(new Date());
        serviceInfo.setModificationTime(new Date());
        try {
            int result=serviceInfoDao.insert(serviceInfo);
            if (result>0){
                return serviceInfo.getId();
            }else {
                throw new RuntimeException("创建店铺密码错误");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("创建市场续费信息失败："+e);
        }
    }
}
