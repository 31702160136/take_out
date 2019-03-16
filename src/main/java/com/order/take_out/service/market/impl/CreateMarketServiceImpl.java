package com.order.take_out.service.market.impl;

import com.order.take_out.dao.*;
import com.order.take_out.pojo.market.*;
import com.order.take_out.service.market.CreateMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;

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
    public Boolean createMarket(Map<String, Object> map) {
        try {
            String name = String.valueOf(map.get("marketName"));
            String address = String.valueOf(map.get("marketAddress"));
            int isActivate = 0;
            Market market = new Market();
            market.setName(name);
            market.setAddress(address);
            market.setIsActivate(isActivate);
            market.setModificationTime(new Date());
            market.setCreationTime(new Date());
            int result = marketDao.insert(market);
            if (result > 0) {
                int marketAdminInfoId = createMarketAdminInfo(map, market.getId());
                int serviceInfoId = createServiceInfo(map, market.getId());
                int userId = createUser(map, market.getId());
                int passwordId = createPassword(map, userId);
                return true;
            } else {
                throw new RuntimeException("创建店铺失败：");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("创建店铺失败：" + e.getMessage());
        }
    }

    private int createUser(Map<String, Object> map, Integer marketId) {
        try{
            String username = String.valueOf(map.get("username"));
            MarketUser reMarketUser = marketUserDao.findMarketUserByUserName(username);
            if (reMarketUser == null) {
                MarketUser marketUser = new MarketUser();
                marketUser.setUsername(username);
                marketUser.setMarketId(marketId);
                marketUser.setCreationTime(new Date());
                marketUser.setModificationTime(new Date());
                try {
                    int result = marketUserDao.insert(marketUser);
                    if (result > 0) {
                        return marketUser.getId();
                    } else {
                        throw new RuntimeException("创建市场账号错误");
                    }
                } catch (RuntimeException e) {
                    throw new RuntimeException("创建市场账号错误");
                }
            } else {
                throw new RuntimeException("账号重复");
            }
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }

    }

    private int createPassword(Map<String, Object> map, Integer userId) {
        try {
            String password = String.valueOf(map.get("password"));
            MarketPassword marketPassword = new MarketPassword();
            marketPassword.setPassword(password);
            marketPassword.setdPassword("");
            marketPassword.setMarketUserId(userId);
            marketPassword.setCreationTime(new Date());
            marketPassword.setModificationTime(new Date());
            int result = marketPasswordDao.insert(marketPassword);
            if (result > 0) {
                return marketPassword.getId();
            } else {
                throw new RuntimeException("创建店铺密码错误");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("创建市场管理密码错误：" + e);
        }
    }

    private int createMarketAdminInfo(Map<String, Object> map, Integer marketId) {
        try {
            String name = String.valueOf(map.get("name"));
            String gender=String.valueOf(map.get("gender"));
            int iGender=0;
            if(gender.equals("男")){
                iGender = 0;
            }else if(gender.equals("女")){
                iGender = 1;
            }else{
                throw new RuntimeException("市场管理员性别信息有误");
            }
            String address = String.valueOf(map.get("address"));
            String phone = String.valueOf(map.get("phone"));
            MarketAdminInfo marketAdminInfo = new MarketAdminInfo();
            marketAdminInfo.setName(name);
            marketAdminInfo.setGender(iGender);
            marketAdminInfo.setAddress(address);
            marketAdminInfo.setPhone(phone);
            marketAdminInfo.setMarketId(marketId);
            marketAdminInfo.setCreationTime(new Date());
            marketAdminInfo.setModificationTime(new Date());
            int result = marketAdminInfoDao.insert(marketAdminInfo);
            if (result > 0) {
                return marketAdminInfo.getId();
            } else {
                throw new RuntimeException("创建市场管理员信息错误");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("创建市场管理员信息失败：" + e);
        }
    }

    private int createServiceInfo(Map<String, Object> map, Integer marketId) {
        try {
            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.setNumOfRenewal(0);
            serviceInfo.setStartingTime(null);
            serviceInfo.setEndTime(null);
            serviceInfo.setMarketId(marketId);
            serviceInfo.setCreationTime(new Date());
            serviceInfo.setModificationTime(new Date());
            int result = serviceInfoDao.insert(serviceInfo);
            if (result > 0) {
                return serviceInfo.getId();
            } else {
                throw new RuntimeException("创建店铺密码错误");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("创建市场续费信息失败：" + e);
        }
    }
}
