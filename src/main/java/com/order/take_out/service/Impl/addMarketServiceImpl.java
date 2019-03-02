package com.order.take_out.service.Impl;

import com.order.take_out.dao.*;
import com.order.take_out.pojo.market.*;
import com.order.take_out.service.addMarketService;
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
public class addMarketServiceImpl implements addMarketService {
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
        MarketPassword marketPassword=new MarketPassword();
        MarketAdminInfo marketAdminInfo=new MarketAdminInfo();
        ServiceInfo serviceInfo=new ServiceInfo();

        market.setAddress("");
        market.setName("");
        market.setIsActivate(0);
        market.setModificationTime(new Date());
        market.setCreationTime(new Date());
        try {
            int result=marketDao.insert(market);
            if (result>0){
                int userId=createUser(username,market.getId());
                System.out.println(userId);
                return true;
            }else {
                throw new RuntimeException("创建店铺失败：");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("创建店铺失败："+e.getMessage());
        }
    }

    private int createUser(String username,Integer marketId) throws RuntimeException{
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
                throw new RuntimeException("创建店铺账号错误");
            }
        }else {
            throw new RuntimeException("账号重复");
        }

    }
}
