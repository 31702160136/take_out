package com.order.take_out.service.market.impl;

import com.order.take_out.dao.*;
import com.order.take_out.pojo.market.*;
import com.order.take_out.service.market.ModifyMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;

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
    MarketUserDao marketUserDao;
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

    @Transactional
    @Override
    public Boolean modifyMarketDetailedInfo(Map<String, Object> map) {
        try {
            System.out.println(map.get("id"));
            if (map.get("id")!=null){
                //创建市场对象保存信息
                Market market=new Market();
                market.setId((Integer) map.get("id"));
                market.setName(String.valueOf(map.get("marketName")));
                market.setAddress(String.valueOf(map.get("marketAddress")));
                market.setModificationTime(new Date());
                //修改市场信息
                int marketRes=marketDao.modify(market);
                if (!(marketRes>0)){
                    throw new RuntimeException("修改市场信息失败!");
                }
                //创建市场管理员对象保存信息
                MarketAdminInfo marketAdminInfo=new MarketAdminInfo();
                marketAdminInfo.setMarketId(market.getId());
                marketAdminInfo.setName(String.valueOf(map.get("adminName")));
                //判断性别0男1女
                int iGender=0;
                if(map.get("adminGender").equals("男")){
                    iGender = 0;
                }else if(map.get("adminGender").equals("女")){
                    iGender = 1;
                }else{
                    throw new RuntimeException("市场管理员性别信息有误");
                }
                marketAdminInfo.setGender(iGender);
                marketAdminInfo.setPhone(String.valueOf(map.get("adminPhone")));
                marketAdminInfo.setAddress(String.valueOf(map.get("adminAddress")));
                marketAdminInfo.setModificationTime(new Date());
                //修改市场管理员信息
                int marketAdminInfoRes=marketAdminInfoDao.modify(marketAdminInfo);
                if (!(marketAdminInfoRes>0)){
                    throw new RuntimeException("修改市场管理员信息失败");
                }
                //创建市场管理员账号对象保存信息
                MarketUser marketUser=new MarketUser();
                marketUser.setMarketId(market.getId());
                marketUser.setUsername(String.valueOf(map.get("username")));
                marketUser.setModificationTime(new Date());
                //修改市场管理员账号
                int marketUserRes=marketUserDao.modify(marketUser);
                if (!(marketUserRes>0)){
                    throw new RuntimeException("修改市场管理员账号失败");
                }
                //创建市场管理员密码对象保存信息
                MarketPassword marketPassword=new MarketPassword();
                marketPassword.setMarketUserId(marketUser.getId());
                marketPassword.setPassword(String.valueOf(map.get("password")));
                marketPassword.setModificationTime(new Date());
                //修改市场管理员密码
                int marketPasswordRes=marketPasswordDao.modify(marketPassword);
                if (!(marketPasswordRes>0)){
                    throw new RuntimeException("修改市场管理员密码失败");
                }
                return true;
            }else {
                throw new RuntimeException("缺少必要信息");
            }
        }catch (RuntimeException e){
            throw new RuntimeException("修改失败!"+e);
        }
    }
}
